package vendingmachine.domain

import vendingmachine.utils.ErrorType

data class ProductQuantity(val value: Int) {
    constructor(input: String) : this(
        input.toIntOrNull() ?: throw IllegalArgumentException(
            ErrorType.PRODUCT_QUANTITY.errorMessage
        )
    )
}