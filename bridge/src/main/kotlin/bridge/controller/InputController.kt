package bridge.controller

import bridge.domain.BridgeNumber
import bridge.domain.Command
import bridge.domain.Direction
import bridge.view.InputView

class InputController {
    fun getBridgeSize(): BridgeNumber {
        try {
            val size = BridgeNumber(InputView.readBridgeSize())
            return size
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getBridgeSize()
        }
    }

    fun getDirection(): Direction {
        try {
            val direction = Direction(InputView.readMoving())
            return direction
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getDirection()
        }
    }

    fun getCommand(): Command {
        try {
            val command = Command(InputView.readGameCommand())
            return command
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getCommand()
        }
    }
}