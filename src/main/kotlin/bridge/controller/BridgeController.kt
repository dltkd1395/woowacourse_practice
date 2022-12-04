package bridge.controller

import bridge.BridgeMaker
import bridge.BridgeRandomNumberGenerator
import bridge.domain.*
import bridge.utils.MOVING_FAILURE
import bridge.view.OutputView

class BridgeController {
    fun start() {
        OutputView.printGameStart()
        val size = InputController().getBridgeSize()
        val createdBridge = BridgeMaker(BridgeRandomNumberGenerator()).makeBridge(size.value).map { Direction(it) }
        move(size, createdBridge)
    }

    private fun move(size: BridgeNumber, createdBridge: List<Direction>) {
        while (player.isGameOver) {
            val direction = InputController().getDirection()
            val result = BridgeGame().move(bridge, direction, createdBridge)
            OutputView.printMap(bridge)
            retry(result)
            quit(size)
        }
    }

    private fun retry(result: String) {
        if (result == MOVING_FAILURE) {
            val command = InputController().getCommand()
            BridgeGame().retry(command, player, bridge)
        }
    }

    private fun quit(size: BridgeNumber) {
        if (bridge.size == size.value || !player.isGameOver) {
            player.setGameQuit()
            OutputView.printResult(player, bridge, BridgeGame().isSuccess(player))
        }
    }

    companion object {
        private val bridge = Bridge()
        private val player = Player()
    }
}