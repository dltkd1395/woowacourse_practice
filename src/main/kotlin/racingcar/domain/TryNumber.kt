package racingcar.domain

import racingcar.utils.ErrorType
import racingcar.utils.ZERO

data class TryNumber(private var value: Int) {

    constructor(input: String) : this(
        input.toIntOrNull()
            ?: throw IllegalArgumentException("${ErrorType.TRY_NOT_NUMBER.errorMessage}")
    )

    init {
        require(isPositiveNumber()) { ErrorType.TRY_POSITIVE_NUMBER.errorMessage }
    }

    private fun isPositiveNumber(): Boolean =
        value > ZERO
}