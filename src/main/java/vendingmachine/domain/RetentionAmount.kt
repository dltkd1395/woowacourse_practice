package vendingmachine.domain

import vendingmachine.utils.ErrorType
import vendingmachine.utils.ZERO

data class RetentionAmount(var value: Int) {
    constructor(input: String) : this(
        input.toIntOrNull() ?: throw IllegalArgumentException(
            ErrorType.RETENTION.errorMessage
        )
    )

    operator fun minus(amount: Int) {
        val result = this.value - amount
        if (result >= ZERO) {
            this.value -= amount
        }
    }
}