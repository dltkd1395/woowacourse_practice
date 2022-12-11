package vendingmachine.domain

import vendingmachine.utils.ErrorType
import vendingmachine.utils.ZERO

data class PurchaseProduct(val name: String) {
    init {
        require(isNameRange()) { ErrorType.PRODUCT_NAME_LENGTH.errorMessage }
    }

    private fun isNameRange(): Boolean =
        name.length > ZERO
}