package bridge.domain

import bridge.uilts.DOWN
import bridge.uilts.ErrorType
import bridge.uilts.UP

class Movement(private val command: String) {
    init {
        require(isCorrectDriection()) { ErrorType.DIRECTION.errorMessage }
    }

    private fun isCorrectDriection(): Boolean =
        command == UP || command == DOWN
}