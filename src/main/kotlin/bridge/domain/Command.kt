package bridge.domain

import bridge.uilts.ErrorType
import bridge.uilts.QUIT
import bridge.uilts.RETRY

class Command(private val type: String) {
    init {
        require(isCorrectRetry()) { ErrorType.RETRY_COMMAND.errorMessage }
    }

    private fun isCorrectRetry(): Boolean =
        type == RETRY || type == QUIT
}