package vendingmachine.domain

data class Product(
    val productName: ProductName,
    var price: ProductPrice,
    var quantity: ProductQuantity
) {

    constructor(productName: String, productPrice: String, productQuantity: String) : this(
        ProductName(productName),
        ProductPrice(productPrice),
        ProductQuantity(productQuantity)
    )

    fun purchase() {
        quantity.decrease()
    }

    fun isSoldOut(): Boolean =
        !quantity.isRemain()

    fun isSameName(name: String): Boolean =
        productName.name.equals(name)

    fun isPurchase(amount: Amount): Boolean =
        price.value <= amount.value
}