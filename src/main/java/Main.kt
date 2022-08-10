import ai.PoliceAI
import ai.ThiefAI
import io.grpc.Channel
import io.grpc.ManagedChannelBuilder
import protobuf.AIProto
import protobuf.AIProto.DeclareReadinessCommand
import protobuf.AIProto.WatchCommand
import protobuf.GameHandlerGrpc
import protobuf.GameHandlerGrpc.GameHandlerBlockingStub

const val SERVER = "127.0.0.1"
const val PORT = 7000

fun main(args: Array<String>) {
    val token: String = try {
        args[0]
    } catch (e: IndexOutOfBoundsException) {
        throw Exception("No token provided. Please provide a token as the first argument to the program.")
    }
    val handler = ClientHandler(ManagedChannelBuilder.forAddress(SERVER, PORT).usePlaintext().build(), token)
    handler.handleClient()
}

class CommandImpl(private val token: String) {
    fun createWatchCommand(): WatchCommand {
        return WatchCommand.newBuilder().setToken(token).build()
    }

    fun declareReadinessCommand(startingNodeId: Int): DeclareReadinessCommand {
        return DeclareReadinessCommand.newBuilder().setStartNodeId(startingNodeId).setToken(token).build()
    }

    fun createMoveCommand(nodeId: Int): AIProto.MoveCommand {
        return AIProto.MoveCommand.newBuilder().setToken(token).setToNodeId(nodeId).build()
    }

    fun createChatCommand(message: String?): AIProto.ChatCommand {
        return AIProto.ChatCommand.newBuilder().setToken(token).setText(message).build()
    }
}

class ClientHandler(channel: Channel, token: String) : Phone {
    private val blockingStub: GameHandlerBlockingStub
    private val commandImpl: CommandImpl
    private var ai: AI = ThiefAI(this)
    private var turn = 1
    private var hasMoved = false

    init {
        blockingStub = GameHandlerGrpc.newBlockingStub(channel)
        commandImpl = CommandImpl(token)
    }

    fun handleClient() {
        val watchCommand = commandImpl.createWatchCommand()
        val gameViews: Iterator<AIProto.GameView>
        try {
            gameViews = blockingStub.watch(watchCommand)
            var isFirstTurn = true
            while (gameViews.hasNext()) {
                val gameView = gameViews.next()
                if (turn != gameView.turn.turnNumber) {
                    turn = gameView.turn.turnNumber
                    hasMoved = false
                }
                if (gameView.status == AIProto.GameStatus.FINISHED) return
                if (gameView.viewer.isDead) return
                if (isFirstTurn) {
                    initialize(gameView)
                    isFirstTurn = false
                } else if (gameView.status == AIProto.GameStatus.ONGOING && canMove(gameView)) {
                    move(gameView)
                } else if (gameView.status == AIProto.GameStatus.FINISHED) {
                    break
                }
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
            throw ex
        }
    }

    private fun canMove(gameView: AIProto.GameView): Boolean {
        if (gameView.turn.turnType == AIProto.TurnType.POLICE_TURN && gameView.viewer.type == AIProto.AgentType.THIEF) return false
        if (gameView.turn.turnType == AIProto.TurnType.THIEF_TURN && gameView.viewer.type == AIProto.AgentType.POLICE) return false
        return if (gameView.turn.turnNumber == turn) {
            !hasMoved
        } else true
    }

    override fun sendMessage(message: String) {
        val chatCommand = commandImpl.createChatCommand(message)
        try {
            blockingStub.sendMessage(chatCommand)
        } catch (e: Exception) {
            println(e.message)
        }
    }

    private fun initialize(gameView: AIProto.GameView) {
        setAIMethod(gameView.viewer.type == AIProto.AgentType.POLICE)
        val startingNodeId = ai.getStartingNode(gameViewFromProto(gameView))
        val declareReadinessCommand = commandImpl.declareReadinessCommand(startingNodeId)
        try {
            blockingStub.declareReadiness(declareReadinessCommand)
        } catch (e: Exception) {
            println(e.message)
        }
    }

    private fun setAIMethod(isPolice: Boolean) {
        if (isPolice) ai = PoliceAI(this)
    }

    private fun move(gameView: AIProto.GameView) {
        val destinationNodeId = ai.move(gameViewFromProto(gameView))
        val moveCommand = commandImpl.createMoveCommand(destinationNodeId)
        try {
            blockingStub.move(moveCommand)
            hasMoved = true
        } catch (e: Exception) {
            println(e.message)
        }
    }
}