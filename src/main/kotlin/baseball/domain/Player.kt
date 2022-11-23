package baseball.domain

import baseball.util.*

class Player(private val number: String) {
    init {
        require(isNumberRange()) { ErrorType.BASEBALL_NUMBER_RANGE.errorMessage }
        require(isNumberSize()) { ErrorType.BASEBALL_NUMBER_SIZE.errorMessage }
        require(isNumberDuplication()) { ErrorType.BASEBALL_NUMBER_DUPLICATION.errorMessage }
    }

    private fun isNumberRange(): Boolean {
        number.map { num ->
            if (num.digitToInt() !in ONE until TEN) {
                return false
            }
        }
        return true
    }

    private fun isNumberSize(): Boolean =
        number.length == THREE

    private fun isNumberDuplication(): Boolean =
        number.length == number.toList().distinct().size
}