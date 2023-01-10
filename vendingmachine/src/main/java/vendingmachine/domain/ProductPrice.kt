package vendingmachine.domain

import vendingmachine.utils.ErrorType
import vendingmachine.utils.PRODUCT_DIVISIBLE_VALUE
import vendingmachine.utils.PRODUCT_MIN_AMOUNT
import vendingmachine.utils.ZERO

data class ProductPrice(val value: Int) {

    init {
        require(isPriceRange()) { ErrorType.PRODUCT_PRICE_RANGE.errorMessage }
        require(isDivided()) { ErrorType.PRODUCT_DIVIDED_PRICE.errorMessage }
    }

    constructor(input: String) : this(
        input.toIntOrNull() ?: throw IllegalArgumentException(
            ErrorType.PRODUCT_PRICE.errorMessage
        )
    )

    private fun isPriceRange(): Boolean =
        value >= PRODUCT_MIN_AMOUNT

    private fun isDivided(): Boolean =
        value % PRODUCT_DIVISIBLE_VALUE == ZERO

}