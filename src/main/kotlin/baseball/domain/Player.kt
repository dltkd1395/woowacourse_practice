package baseball.domain

import baseball.util.*

class Player(private val number: String) {
    init {
        require(isNumberRange()) { ErrorType.BASEBALL_NUMBER_RANGE.errorMessage }
        require(isNumberSize()) { ErrorType.BASEBALL_NUMBER_SIZE.errorMessage }
    }

    private fun isNumberRange(): Boolean =
        number.toInt() in ONE until TEN

    private fun isNumberSize(): Boolean =
        number.length == THREE
}