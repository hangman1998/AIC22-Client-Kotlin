package ai

import protobuf.AIProto.GameView

class ThiefAI(phone: Phone?) : AI() {
    init {
        this.phone = phone
    }

    /**
     * Used to select the starting node.
     */
    override fun getStartingNode(gameView: GameView?): Int {
        return 2
    }

    /**
     * Implement this function to move your thief agent based on current game view.
     */
    override fun move(gameView: GameView?): Int {
        return 2
    }
}