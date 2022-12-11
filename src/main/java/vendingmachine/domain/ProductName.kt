package vendingmachine.domain

import vendingmachine.utils.ErrorType
import vendingmachine.utils.ZERO

data class ProductName(val name: String) {
    init {
        require(isNameLength()) { ErrorType.PRODUCT_NAME_LENGTH.errorMessage }
    }

    private fun isNameLength(): Boolean =
        name.length > ZERO
}