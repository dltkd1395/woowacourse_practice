package subway.domain

import subway.utils.ErrorType

data class PathInquiry(val command: String) {
    init {
        require(isCorrectPathInquiry()) { ErrorType.INQUIRY_COMMAND.errorMessage }
    }

    private fun isCorrectPathInquiry(): Boolean =
        when (command) {
            INQUIRY_COMMAND -> true
            QUIT_COMMAND -> true
            else -> false
        }

    companion object {
        private const val INQUIRY_COMMAND = "1"
        private const val QUIT_COMMAND = "Q"
    }
}