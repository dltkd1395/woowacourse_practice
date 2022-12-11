package vendingmachine.view

import camp.nextstep.edu.missionutils.Console
import vendingmachine.domain.InputAmount
import vendingmachine.domain.Product
import vendingmachine.domain.Products
import vendingmachine.domain.RetentionAmount

object InputView {
    fun readRetentionAmount(): RetentionAmount =
        RetentionAmount(Console.readLine())

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

    fun readInputAmount(): InputAmount =
        InputAmount(Console.readLine())
}