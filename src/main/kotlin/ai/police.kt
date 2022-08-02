package ai

import protobuf.AIProto.GameView

class PoliceAI(phone: Phone?) : AI() {
    init {
        this.phone = phone
    }

    /**
     * This function always returns zero (Polices can not set their starting node).
     */
    override fun getStartingNode(gameView: GameView?): Int {
        return 1
    }

    /**
     * Implement this function to move your police agent based on current game view.
     */
    override fun move(gameView: GameView?): Int {
        return 1
    }
}