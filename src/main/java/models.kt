import protobuf.AIProto

interface Phone {
    fun sendMessage(message: String)
}

abstract class AI {
    protected abstract val phone: Phone
    abstract fun getStartingNode(gameView: GameView): Int
    abstract fun move(gameView: GameView): Int
}

val JOKER_OR_THIEF = setOf(AIProto.AgentType.JOKER, AIProto.AgentType.THIEF)
val BATMAN_OR_POLICE = setOf(AIProto.AgentType.BATMAN, AIProto.AgentType.POLICE)

data class GameView(
    val status: GameStatus,
    val result: GameResult,
    val turn: Turn,
    val config: GameConfig,
    val viewer: Agent,
    val balance: Double,
    val visibleAgents: List<Agent>,
    val chatBox: List<Chat>
)

fun gameViewFromProto(proto: AIProto.GameView): GameView {
    return GameView(statusFromProto(proto.status),
        resultFromProto(proto.result),
        turnFromProto(proto.turn),
        gameConfigFromProto(proto.config),
        agentFromProto(proto.viewer),
        proto.balance,
        proto.visibleAgentsList.map { agentFromProto(it) },
        proto.chatBoxList.map { chatFromProto(it) })
}

fun statusFromProto(proto: AIProto.GameStatus) = when (proto) {
    AIProto.GameStatus.FINISHED -> GameStatus.FINISHED
    AIProto.GameStatus.ONGOING -> GameStatus.ONGOING
    AIProto.GameStatus.PENDING -> GameStatus.PENDING
    else -> throw Exception()
}

fun resultFromProto(proto: AIProto.GameResult) = when (proto) {
    AIProto.GameResult.FIRST_WINS -> GameResult.FIRST_WINS
    AIProto.GameResult.SECOND_WINS -> GameResult.SECOND_WINS
    AIProto.GameResult.TIE -> GameResult.TIE
    AIProto.GameResult.UNKNOWN -> GameResult.UNKNOWN
    else -> throw Exception()
}

fun turnTypeFromProto(proto: AIProto.TurnType) = when (proto) {
    AIProto.TurnType.POLICE_TURN -> TurnType.POLICE_TURN
    AIProto.TurnType.THIEF_TURN -> TurnType.THIEF_TURN
    else -> throw Exception()
}

fun chatFromProto(proto: AIProto.Chat) = Chat(proto.id, proto.fromAgentId, proto.text, proto.timeStamp)

fun turnFromProto(proto: AIProto.Turn) = Turn(proto.turnNumber, turnTypeFromProto(proto.turnType))

fun gameConfigFromProto(proto: AIProto.GameConfig) = GameConfig(
    graphFromProto(proto.graph),
    incomeFromProto(proto.incomeSettings),
    turnSettingsFromProto(proto.turnSettings),
    chatSettingsFromProto(proto.chatSettings)
)

fun graphFromProto(proto: AIProto.Graph) =
    Graph(
        proto.pathsList.map { pathFromProto(it) },
        proto.nodesList.map { nodeFromProto(it) },
        proto.visibleRadiusXPoliceThief,
        proto.visibleRadiusYPoliceJoker,
        proto.visibleRadiusZThiefBatman
    )

fun incomeFromProto(proto: AIProto.IncomeSettings) =
    IncomeSettings(proto.policeIncomeEachTurn, proto.thievesIncomeEachTurn)

fun turnSettingsFromProto(proto: AIProto.TurnSettings) = TurnSettings(proto.maxTurns, proto.visibleTurnsList)
fun chatSettingsFromProto(proto: AIProto.ChatSettings) = ChatSettings(proto.chatBoxMaxSize, proto.chatCostPerCharacter)

fun nodeFromProto(proto: AIProto.Node) = Node(proto.id)
fun pathFromProto(proto: AIProto.Path) = Path(proto.id, proto.firstNodeId, proto.secondNodeId, proto.price)

fun agentFromProto(proto: AIProto.Agent) =
    Agent(proto.id, teamFromProto(proto.team), agentTypeFromProto(proto.type), proto.nodeId, proto.isDead)

fun teamFromProto(proto: AIProto.Team) = when (proto) {
    AIProto.Team.FIRST -> Team.FIRST
    AIProto.Team.SECOND -> Team.SECOND
    else -> throw Exception()
}

fun agentTypeFromProto(proto: AIProto.AgentType) = when (proto) {
    AIProto.AgentType.POLICE -> AgentType.POLICE
    AIProto.AgentType.THIEF -> AgentType.THIEF
    AIProto.AgentType.JOKER -> AgentType.JOKER
    AIProto.AgentType.BATMAN -> AgentType.BATMAN
    else -> throw Exception()
}

data class GameConfig(
    val graph: Graph, val IncomeSettings: IncomeSettings, val TurnSettings: TurnSettings, val chatSettings: ChatSettings
)

data class IncomeSettings(val policeIncomeEachTurn: Double, val thiefIncomeEachTurn: Double)
data class TurnSettings(val maxTurns: Int, val visibleTurns: List<Int>)
data class ChatSettings(val chatBoxMaxSize: Int, val chatCostPerCharacter: Double)

data class Agent(
    val id: Int, val team: Team, val type: AgentType, val nodeId: Int, val isDead: Boolean
)

data class Chat(
    val id: String,
    val fromAgentId: Int,
    val text: String,
    val timeStamp: com.google.protobuf.Timestamp,
)

data class Turn(val turnNumber: Int, val turnType: TurnType)

fun Turn.next() = Turn(turnNumber + 1, turnType.next())


data class Graph(
    val paths: List<Path>, val nodes: List<Node>,
    val visibleRadiusXPoliceThief: Int,
    val visibleRadiusYPoliceJoker: Int,
    val visibleRadiusZThiefBatman: Int
)

data class Node(val id: Int)
data class Path(
    val id: Int, val firstNodeId: Int, val secondNodeId: Int, val price: Double
)

enum class Team { FIRST, SECOND }
enum class TurnType { THIEF_TURN, POLICE_TURN }
enum class AgentType { THIEF, POLICE, JOKER, BATMAN }
enum class GameStatus { PENDING, ONGOING, FINISHED }
enum class GameResult { UNKNOWN, FIRST_WINS, SECOND_WINS, TIE }


fun TurnType.next() = when (this) {
    TurnType.THIEF_TURN -> TurnType.POLICE_TURN
    TurnType.POLICE_TURN -> TurnType.THIEF_TURN
}

