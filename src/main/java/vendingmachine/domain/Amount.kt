package vendingmachine.domain

import vendingmachine.utils.ErrorType
import vendingmachine.utils.ZERO

data class Amount(val value: Int) {
    init {
        require(isPositiveNumber()) { ErrorType.POSITIVE.errorMessage }
    }

    constructor(input: String) : this(
        input.toIntOrNull() ?: throw IllegalArgumentException(
            ErrorType.AMOUNT.errorMessage
        )
    )

    fun buyProduct(amount: Int): Amount =
        Amount(value - amount)

    private fun isPositiveNumber(): Boolean =
        value > ZERO
}