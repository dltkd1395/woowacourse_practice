package vendingmachine.controller

import vendingmachine.domain.*
import vendingmachine.view.OutputView

class VendingMachineController {
    private val inputController = InputController()
    private lateinit var vendingMachine: VendingMachine
    private lateinit var coins: Coins
    private lateinit var amount: Amount

    fun run() {
        makeMachine()
        workMachine()
        showResult()
    }

    fun makeMachine() {
        val coins = makeCoins()
        val products = askProducts()
        vendingMachine = VendingMachine(coins, products)
    }

    fun workMachine() {
        amount = askInputAmount()
        while (vendingMachine.isSellProduct(amount)) {
            buyProduct()
        }

    }

    fun showResult() {
        OutputView.printInputAmount(amount)
        coins = vendingMachine.makeChagnge(amount)
        OutputView.printRetentionCoin(coins)
    }

    private fun makeCoins(): Coins {
        val retentionAmount = inputController.getRetentionAmount()
        coins = Coins().makeRandomCoins(RandomNumberGenerator(), retentionAmount)
        OutputView.printRetentionCoin(coins)
        println()
        return coins
    }

    private fun askProducts(): Products {
        val products = inputController.getProducts()
        println()
        return products
    }

    private fun askInputAmount(): Amount  {
        val inputAmount = inputController.getInputAmount()
        println()
        return inputAmount
    }

    private fun askPurchaseProduct(inputAmount: Amount): PurchaseProduct {
        OutputView.printInputAmount(inputAmount)
        val purchaseProduct = inputController.getPurchaseProduct()
        vendingMachine.puchaseProduct(purchaseProduct.name, inputAmount)
        println()
        return purchaseProduct
    }

    private fun buyProduct() {
        val purchaseProduct = askPurchaseProduct(amount)
        amount = amount.useAmount(purchaseProduct.findPrice(vendingMachine.products).value)
    }
}