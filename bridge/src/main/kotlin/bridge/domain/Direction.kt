package bridge.domain

import bridge.MOVEMENT
import bridge.utils.CommandVaildator
import bridge.utils.DOWN
import bridge.utils.ErrorType
import bridge.utils.UP

data class Direction(val command: String) {
    init {
        CommandVaildator(MOVEMENT, command)
        require(isCorrectDriection()) { ErrorType.DRIECTION.errorMessage }
    }

    private fun isCorrectDriection(): Boolean =
        command == UP || command == DOWN
}