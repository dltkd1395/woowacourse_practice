package vendingmachine.domain

import vendingmachine.utils.ErrorType

data class Products(val products: List<Product>) {

    fun findPurchaseProduct(name: String, amount: Amount): Product =
        products.filter { product -> product.isSameName(name) }
            .filter { product -> product.isPurchase(amount) }
            .firstOrNull() ?: throw IllegalArgumentException(ErrorType.PRODUCT_CONTAIN.errorMessage)

    fun findProductPrice(name: String): ProductPrice =
        products.filter { product -> product.isSameName(name) }
            .first()
            .price

    fun findMinPrice(): Product =
        products.reduce { firstProduct, secondProduct ->
            comparePrice(firstProduct, secondProduct)
        }


    fun isAllSoldOut(): Boolean =
        products.all { product -> product.isSoldOut() }

    private fun comparePrice(firstProduct: Product, secondProduct: Product): Product {
        if (firstProduct.price.value > secondProduct.price.value) {
            return secondProduct
        }
        return firstProduct
    }
}