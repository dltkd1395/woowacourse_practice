package bridge.domain

import bridge.BridgeMaker
import bridge.BridgeRandomNumberGenerator
import bridge.uilts.DOWN
import bridge.uilts.ErrorType
import bridge.uilts.UP
import bridge.uilts.vaildator.CommandVaildator

data class Movement(val command: String) {
    init {
        CommandVaildator(command)
        require(isCorrectDriection()) { ErrorType.DIRECTION.errorMessage }
    }

    private fun isCorrectDriection(): Boolean =
        command == UP || command == DOWN
}