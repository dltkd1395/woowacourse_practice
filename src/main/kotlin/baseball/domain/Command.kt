package baseball.domain

import baseball.util.ErrorType
import baseball.util.ONE
import baseball.util.TWO
import baseball.util.validation.Validator

class Command(private val number: String) {
    init {
        Validator(number)
        require(isRetrySize()) { ErrorType.BASEBALL_RETRY_SIZE.errorMessage }
        require(isRetryNumber()) { ErrorType.BASEBALL_RETRY_NUMBER.errorMessage }
    }

    private fun isRetryNumber(): Boolean =
        number.toInt() == ONE || number.toInt() == TWO

    private fun isRetrySize(): Boolean =
        number.length == ONE
}