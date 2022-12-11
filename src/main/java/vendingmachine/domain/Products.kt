package vendingmachine.domain

import vendingmachine.utils.ErrorType

data class Products(val products: List<Product>) {

    fun containProduct(productName: String) {
        if (products.filter { product -> product.productName.name == productName }.isEmpty()) {
            throw IllegalArgumentException(ErrorType.PRODUCT_CONTAIN.errorMessage)
        }
    }
}