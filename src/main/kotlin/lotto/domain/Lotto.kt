package lotto.domain

import lotto.utils.ErrorType
import lotto.utils.LOTTO_MAX_NUMBER
import lotto.utils.LOTTO_MIN_NUMBER

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6) { ErrorType.LOTTO_SIZE.errorMessage }
        require(isDuplication()) { ErrorType.LOTTO_DUPLICATION.errorMessage }
        require(isNumberRange()) { ErrorType.LOTTO_RANGE.errorMessage }
    }

    private fun isDuplication(): Boolean =
        numbers.size == numbers.distinct().size

    private fun isNumberRange(): Boolean {
        numbers.map { number ->
            if (number !in LOTTO_MIN_NUMBER..LOTTO_MAX_NUMBER) {
                return false
            }
        }
        return true
    }
}
