package bridge.domain

import bridge.uilts.ErrorType
import bridge.uilts.QUIT
import bridge.uilts.RETRY
import bridge.uilts.vaildator.CommandVaildator

class Command(private val type: String) {
    init {
        CommandVaildator(type)
        require(isCorrectRetry()) { ErrorType.RETRY_COMMAND.errorMessage }
    }

    private fun isCorrectRetry(): Boolean =
        type == RETRY || type == QUIT
}