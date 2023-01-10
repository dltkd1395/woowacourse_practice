package subway.domain

import subway.utils.ErrorType

data class InquiryType(val command: String) {
    init {
        require(isCorrectInquiryType()) { ErrorType.INQUIRY_TYPE_COMMAND.errorMessage }
    }

    private fun isCorrectInquiryType(): Boolean =
        when (command) {
            SHORTEST_DISTANCE_COMMAND -> true
            SHORTEST_TIME_COMMAND -> true
            BACK_COMMAND -> true
            else -> false
        }

    companion object {
        private const val SHORTEST_DISTANCE_COMMAND = "1"
        private const val SHORTEST_TIME_COMMAND = "2"
        private const val BACK_COMMAND = "B"
    }
}
