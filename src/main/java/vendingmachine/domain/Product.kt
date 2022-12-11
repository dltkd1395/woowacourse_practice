package vendingmachine.domain

data class Product(
    val productName: ProductName,
    val price: ProductPrice,
    val quantity: ProductQuantity
) {

    constructor(productName: String, productPrice: String, productQuantity: String) : this(
        ProductName(productName),
        ProductPrice(productPrice),
        ProductQuantity(productQuantity)
    )

}