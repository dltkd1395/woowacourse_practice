package vendingmachine.domain

import vendingmachine.utils.ErrorType
import vendingmachine.utils.ZERO

data class RetentionAmount(var value: Int) {

    init {
        require(isPositiveNumber()) { ErrorType.POSITIVE.errorMessage }
    }

    constructor(input: String) : this(
        input.toIntOrNull() ?: throw IllegalArgumentException(
            ErrorType.RETENTION.errorMessage
        )
    )

    private fun isPositiveNumber(): Boolean =
        value > ZERO

    operator fun minus(amount: Int) {
        val result = this.value - amount
        if (result >= ZERO) {
            this.value -= amount
        }
    }
}