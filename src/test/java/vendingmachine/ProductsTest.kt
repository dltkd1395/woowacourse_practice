package vendingmachine

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import vendingmachine.domain.*

class ProductsTest {
    @Test
    fun `구입 상품이 포함되는 경우 예외가 발생한다`() {
        val products = listOf(Product(ProductName("콜라"), ProductPrice(1500), ProductQuantity(20)))
        assertThrows<IllegalArgumentException> {
            Products(products).containProduct("사이다")
        }.printStackTrace()
    }
}