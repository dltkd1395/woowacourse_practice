package racingcar.domain

import racingcar.utils.ErrorType
import racingcar.utils.ZERO

data class TryNumber(private var value: Int) {

    init {
        require(isPositiveNumber()) { ErrorType.TRY_POSITIVE_NUMBER.errorMessage }
    }

    private fun isPositiveNumber(): Boolean =
        value > ZERO
}