package bridge.uilts.vaildator

import bridge.uilts.ErrorType

class CommandVaildator(private val command: String) {
    init {
        require(isEmpty()) { ErrorType.EMPTY.errorMessage }
        isUpperCase()
    }

    private fun isEmpty(): Boolean =
        command.isNotEmpty() || !command.equals("")

    private fun isUpperCase() {
        command.map { char ->
            require(char.isUpperCase()) { ErrorType.UPPER.errorMessage }
        }
    }
}