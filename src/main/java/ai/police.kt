package ai

import AI
import GameView
import Phone


class PoliceAI(override val phone: Phone) : AI() {
    override fun getStartingNode(gameView: GameView): Int {
        return 1
    }

    override fun move(gameView: GameView): Int {
        val currentLoc = gameView.viewer.nodeId
        val path = gameView.config.graph.paths.filter { it.firstNodeId == currentLoc || it.secondNodeId == currentLoc }
            .filter { it.price <= gameView.balance }.randomOrNull()
        if (path != null) {
            return if (currentLoc == path.firstNodeId)
                path.secondNodeId
            else
                path.firstNodeId
        }
        return currentLoc
    }

}



