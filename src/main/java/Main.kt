import ai.AI
import ai.Phone
import ai.PoliceAI
import ai.ThiefAI
import io.grpc.Channel
import io.grpc.ManagedChannelBuilder
import protobuf.AIProto.*
import protobuf.GameHandlerGrpc
import protobuf.GameHandlerGrpc.GameHandlerBlockingStub


fun main(args: Array<String>) {
    val token: String = try {
        args[0]
    } catch (e: IndexOutOfBoundsException) {
        throw Exception("No token provided. Please provide a token as the first argument to the program.")
    }
    val handler = ClientHandler(
        ManagedChannelBuilder.forAddress("127.0.0.1", 7000).usePlaintext().build(), token
    )
    handler.handleClient()
}


class ClientHandler(channel: Channel, token: String?) {
    private val blockingStub: GameHandlerBlockingStub = GameHandlerGrpc.newBlockingStub(channel)
    private val commandImpl: CommandImpl
    private var ai: AI? = null
    private var turn = 1
    private var hasMoved = false

    init {
        commandImpl = CommandImpl(token!!)
    }

    fun handleClient() {
        val watchCommand = commandImpl.createWatchCommand()
        val gameViews: Iterator<GameView>
        try {
            gameViews = blockingStub.watch(watchCommand)
            var isFirstTurn = true
            while (gameViews.hasNext()) {
                val gameView = gameViews.next()
                if (turn != gameView.turn.turnNumber) {
                    turn = gameView.turn.turnNumber
                    hasMoved = false
                }
                if (gameView.status == GameStatus.FINISHED) return
                if (gameView.viewer.isDead) return
                if (isFirstTurn) {
                    initialize(gameView)
                    isFirstTurn = false
                } else if (gameView.status == GameStatus.ONGOING && canMove(gameView)) {
                    move(gameView)
                } else if (gameView.status == GameStatus.FINISHED) {
                    break
                }
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
            throw ex
        }
    }

    private fun canMove(gameView: GameView): Boolean {
        if (gameView.turn.turnType == TurnType.POLICE_TURN && gameView.viewer.type == AgentType.THIEF) return false
        if (gameView.turn.turnType == TurnType.THIEF_TURN && gameView.viewer.type == AgentType.POLICE) return false
        return if (gameView.turn.turnNumber == turn) {
            !hasMoved
        } else true
    }

    fun sendMessage(message: String?) {
        val chatCommand = commandImpl.createChatCommand(message)
        try {
            blockingStub.sendMessage(chatCommand)
        } catch (e: Exception) {
            println(e.message)
        }
    }

    private fun initialize(gameView: GameView) {
        setAIMethod(gameView.viewer.type == AgentType.POLICE)
        val startingNodeId = ai!!.getStartingNode(gameView)
        val declareReadinessCommand = commandImpl.declareReadinessCommand(startingNodeId)
        try {
            blockingStub.declareReadiness(declareReadinessCommand)
        } catch (e: Exception) {
            println(e.message)
        }
    }

    private fun setAIMethod(isPolice: Boolean) {
        if (ai != null) {
            return
        }
        val phone = Phone(this)
        ai = if (isPolice) PoliceAI(phone) else ThiefAI(phone)
    }

    private fun move(gameView: GameView) {
        val destinationNodeId = ai!!.move(gameView)
        val moveCommand = commandImpl.createMoveCommand(destinationNodeId)
        try {
            blockingStub.move(moveCommand)
            hasMoved = true
        } catch (e: Exception) {
            println(e.message)
        }
    }
}

class CommandImpl(private val token: String) {
    fun createWatchCommand(): WatchCommand {
        return WatchCommand.newBuilder()
            .setToken(token)
            .build()
    }

    fun declareReadinessCommand(startingNodeId: Int): DeclareReadinessCommand {
        return DeclareReadinessCommand.newBuilder()
            .setStartNodeId(startingNodeId)
            .setToken(token)
            .build()
    }

    fun createMoveCommand(nodeId: Int): MoveCommand {
        return MoveCommand.newBuilder()
            .setToken(token)
            .setToNodeId(nodeId)
            .build()
    }

    fun createChatCommand(message: String?): ChatCommand {
        return ChatCommand.newBuilder()
            .setToken(token)
            .setText(message)
            .build()
    }
}