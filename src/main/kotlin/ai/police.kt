package ai

import AI
import GameView
import Phone


class PoliceAI(override val phone: Phone) : AI() {
    override  fun getStartingNode(gameView: GameView): Int {
        return 1
    }

    override  fun move(gameView: GameView): Int {
        TODO("write your police ai code here")
    }

}



