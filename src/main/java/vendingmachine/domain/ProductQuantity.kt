package vendingmachine.domain

import vendingmachine.utils.ErrorType
import vendingmachine.utils.ONE
import vendingmachine.utils.ZERO

data class ProductQuantity(var value: Int) {

    init {
        require(isPositiveNumber()) { ErrorType.POSITIVE.errorMessage }
    }

    constructor(input: String) : this(
        input.toIntOrNull() ?: throw IllegalArgumentException(
            ErrorType.PRODUCT_QUANTITY.errorMessage
        )
    )

    fun decrease() =
        value--

    fun isRemain(): Boolean =
        value > ZERO

    private fun isPositiveNumber(): Boolean =
        value >= ZERO
}