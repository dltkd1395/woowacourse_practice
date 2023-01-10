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

    fun decrease(): Int =
        this.value--

    fun isGameOver(): Boolean =
        this.value <= ZERO

    private fun isPositiveNumber(): Boolean =
        value > ZERO
}