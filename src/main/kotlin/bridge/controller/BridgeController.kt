package bridge.controller

import bridge.*
import bridge.domain.Bridge
import bridge.domain.BridgeGame
import bridge.domain.Judgement
import bridge.domain.Player
import bridge.uilts.FAILURE
import bridge.uilts.QUIT
import bridge.uilts.RETRY
import bridge.view.OutputView

class BridgeController {
    private val inputController = InputController()
    private val outputView = OutputView()
    private val player = Player()
    private val bridge = Bridge()
    private val bridgeGame = BridgeGame()

    fun run() {
        outputView.printGameStart()
        val size = inputController.getBridgeSize()
        val createdBridge = BridgeMaker(BridgeRandomNumberGenerator()).makeBridge(size)
        while (player.isRetry && bridge.size < createdBridge.size) {
            play(createdBridge)
        }
        outputView.printResult(bridge, player)
    }

    private fun play(createdBridge: List<String>) {
        val playerDirection = inputController.getBridgeMoving()
        val result = Judgement(createdBridge[bridge.size], playerDirection).compareDirection()
        bridgeGame.move(playerDirection, result, bridge)
        outputView.printMap(bridge)
        failBridge(result)
    }

    private fun failBridge(result: String) {
        if (result == FAILURE) {
            val command = inputController.getBridgeCommand()
            setGameState(command)
        }
    }

    private fun setGameState(command: String) {
        when (command) {
            QUIT -> quit()
            RETRY -> retry()
        }
    }

    private fun retry() {
        bridgeGame.retry(player, bridge)
    }

    private fun quit() {
        bridgeGame.quit(player)
        player.setGameState()
    }
}