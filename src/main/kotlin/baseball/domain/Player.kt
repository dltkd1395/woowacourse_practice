package baseball.domain

import baseball.util.*

class Player(private val number: String) {
    init {
        require(isNumberRange()) { ErrorType.BASEBALL_NUMBER_RANGE.errorMessage }
    }

    private fun isNumberRange(): Boolean =
        number.toInt() in ONE until TEN
}