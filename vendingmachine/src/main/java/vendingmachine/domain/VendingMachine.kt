package vendingmachine.domain

data class VendingMachine(var coins: Coins, var products: Products) {

    fun puchaseProduct(name: String, amount: Amount) {
        val product = products.findPurchaseProduct(name, amount)
        product.purchase()
    }

    fun isSellProduct(amount: Amount): Boolean =
        products.findMinPrice().isPurchase(amount) && !products.isAllSoldOut()

    fun makeChagnge(amount: Amount): Coins =
        coins.makeChange(amount)
}