package baseball.domain

import baseball.util.*

data class BaseBallNumber(val value: Int) {

    constructor(input: String) : this(
        input.toIntOrNull()
            ?: throw IllegalArgumentException("${ErrorType.NUMBER.errorMessage}")
    )

    init {
        require(isNumberRange()) { ErrorType.BASEBALL_NUMBER_RANGE.errorMessage }
    }

    private fun isNumberRange(): Boolean =
        this.value in ONE..NINE
}