package vendingmachine.domain

import vendingmachine.utils.ErrorType

data class RetentionAmount(val value: Int) {
    constructor(input: String) : this(
        input.toIntOrNull() ?: throw IllegalArgumentException(
            ErrorType.RETENTION.errorMessage
        )
    )
}