package ai

import ClientHandler
import protobuf.AIProto.GameView

abstract class AI {
    @JvmField
    protected var phone: Phone? = null
    abstract fun getStartingNode(gameView: GameView?): Int
    abstract fun move(gameView: GameView?): Int
}


/**
 * Class for sending message to server.
 */
class Phone(private val client: ClientHandler) {
    /**
     * Call this function wherever you want to send a message.
     *
     * @param message The message we want to send.
     */
    fun sendMessage(message: String?) {
        client.sendMessage(message)
    }
}