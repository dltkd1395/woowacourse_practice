package baseball.domain

import baseball.util.ErrorType
import baseball.util.ONE
import baseball.util.TWO

class Command(private val number: String) {
    init {
        require(isRetryNumber()) { ErrorType.BASEBALL_RETRY_NUMBER.errorMessage }
    }

    private fun isRetryNumber(): Boolean =
        number.toInt() == ONE || number.toInt() == TWO
}