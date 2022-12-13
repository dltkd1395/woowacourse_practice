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

    fun useAmount(amount: Int): Amount =
        Amount(value - amount)

    fun isUseAmount(coin: Int): Boolean =
        (value - coin) >= ZERO

    private fun isPositiveNumber(): Boolean =
        value >= ZERO

}