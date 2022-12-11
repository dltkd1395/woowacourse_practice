package vendingmachine.view

import camp.nextstep.edu.missionutils.Console
import vendingmachine.domain.Product
import vendingmachine.domain.Products
import vendingmachine.domain.RetentionAmount

object InputView {
    fun readRetentionAmount(): RetentionAmount {
        val amount = RetentionAmount(Console.readLine())
        return amount
    }

    fun readProducts(): Products {
        val products = Products(Console.readLine()
            .split(";")
            .map { products -> products.substring(1, products.lastIndex) }
            .map { product ->
                val (name, price, quantity) = product.split(",")
                Product(name, price, quantity)
            })
        return products
    }
}