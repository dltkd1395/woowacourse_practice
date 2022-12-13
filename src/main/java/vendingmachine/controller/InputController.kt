package vendingmachine.controller

import vendingmachine.domain.Amount
import vendingmachine.domain.Products
import vendingmachine.domain.PurchaseProduct
import vendingmachine.view.InputView

class InputController {
    fun getRetentionAmount(): Amount {
        try {
            return InputView.readRetentionAmount()
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getRetentionAmount()
        }
    }

    fun getProducts(): Products {
        try {
            return InputView.readProducts()
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getProducts()
        }
    }

    fun getInputAmount(): Amount {
        try {
            return InputView.readInputAmount()
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getInputAmount()
        }
    }

    fun getPurchaseProduct(): PurchaseProduct {
        try {
            return InputView.readPurchaseProduct()
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getPurchaseProduct()
        }
    }
}
