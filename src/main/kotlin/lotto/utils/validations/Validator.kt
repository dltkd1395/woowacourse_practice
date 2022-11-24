package lotto.utils.validations

import lotto.utils.ErrorType
import lotto.utils.LOTTO_MAX_NUMBER
import lotto.utils.LOTTO_MIN_NUMBER

object Validator {

    fun validateEmpty(inputValue: String) {
        require(inputValue.isNotEmpty() || !inputValue.equals("")) {
            ErrorType.EMPTY.errorMessage
        }
    }

    fun validateNumber(inputValue: String) {
        inputValue.map { number ->
            require(number.isDigit()) {
                ErrorType.NUMBER.errorMessage
            }
        }
    }

    fun validateNumberRange(inputValue: Int) {
        require(inputValue >= LOTTO_MIN_NUMBER && inputValue <= LOTTO_MAX_NUMBER) {
            ErrorType.LOTTO_RANGE.errorMessage
        }
    }

}