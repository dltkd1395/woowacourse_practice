package bridge.uilts.vaildator

import bridge.uilts.ErrorType

class CommandVaildator(private val command: String) {
    init {
        require(isEmpty()) { ErrorType.EMPTY.errorMessage }
        isLetter()
        isUpperCase()
    }

    private fun isEmpty(): Boolean =
        command.isNotEmpty() || !command.equals("")

    private fun isUpperCase() {
        command.map { char ->
            require(char.isUpperCase()) { ErrorType.UPPER.errorMessage }
        }
    }

    private fun isLetter() {
        command.map { char ->
            require(char.isLetter()) { ErrorType.LETTER.errorMessage }
        }
    }
}