package bridge.uilts.vaildator

import bridge.uilts.ErrorType

class CommandVaildator(private val command: String) {
    init {
        require(isEmpty()) { ErrorType.EMPTY.errorMessage }
    }

    private fun isEmpty(): Boolean =
        command.isNotEmpty() || !command.equals("")
}