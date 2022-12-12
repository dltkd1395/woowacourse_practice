package vendingmachine.domain

import vendingmachine.utils.ErrorType
import vendingmachine.utils.ZERO

data class InputAmount(val value: Int) {

    init {
        require(isPositiveNumber()) { ErrorType.POSITIVE.errorMessage }
    }

    constructor(input: String) : this(
        input.toIntOrNull() ?: throw IllegalArgumentException(
            ErrorType.INPUT_AMOUNT.errorMessage
        )
    )

    private fun isPositiveNumber(): Boolean =
        value > ZERO
}