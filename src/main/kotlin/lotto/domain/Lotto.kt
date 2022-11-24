package lotto.domain

import lotto.utils.ErrorType
import lotto.utils.LOTTO_MAX_NUMBER
import lotto.utils.LOTTO_MIN_NUMBER

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6) { ErrorType.LOTTO_SIZE.errorMessage }
        require(isDuplication()) { ErrorType.LOTTO_DUPLICATION.errorMessage }
    }

    private fun isDuplication(): Boolean =
        numbers.size == numbers.distinct().size
}
