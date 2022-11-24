package lotto.domain

import lotto.utils.ErrorType
import lotto.utils.validations.Validator

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6) { ErrorType.LOTTO_SIZE.errorMessage }
        require(isDuplication()) { ErrorType.LOTTO_DUPLICATION.errorMessage }
        isNumberRange()
    }

    private fun isDuplication(): Boolean =
        numbers.size == numbers.distinct().size

    private fun isNumberRange() {
        numbers.map { number ->
            Validator.validateNumberRange(number)
        }
    }
}
