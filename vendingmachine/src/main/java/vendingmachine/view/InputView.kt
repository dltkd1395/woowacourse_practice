package vendingmachine.view

import camp.nextstep.edu.missionutils.Console
import vendingmachine.domain.*
import vendingmachine.utils.INPUT_INPUT_AMOUNT
import vendingmachine.utils.INPUT_PRODUCTS
import vendingmachine.utils.INPUT_PURCHASE_PRODUCT
import vendingmachine.utils.INPUT_RETENTION_AMOUNT

object InputView {
    fun readRetentionAmount(): Amount {
        println(INPUT_RETENTION_AMOUNT)
        return Amount(Console.readLine())
    }

    fun readProducts(): Products {
        println(INPUT_PRODUCTS)
        val products = Products(Console.readLine()
            .split(";")
            .map { products -> products.substring(1, products.lastIndex) }
            .map { product ->
                val (name, price, quantity) = product.split(",")
                Product(name, price, quantity)
            })
        return products
    }

    fun readInputAmount(): Amount {
        println(INPUT_INPUT_AMOUNT)
        return Amount(Console.readLine())
    }

    fun readPurchaseProduct(): PurchaseProduct {
        println(INPUT_PURCHASE_PRODUCT)
        return PurchaseProduct(Console.readLine())
    }
}