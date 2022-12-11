package vendingmachine.domain

import vendingmachine.utils.ErrorType

data class InputAmount(val value: Int) {
    constructor(input: String) : this(
        input.toIntOrNull() ?: throw IllegalArgumentException(
            ErrorType.INPUT_AMOUNT.errorMessage
        )
    )
}