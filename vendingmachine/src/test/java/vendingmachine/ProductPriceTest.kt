package vendingmachine

import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import vendingmachine.domain.ProductPrice

class ProductPriceTest {
    @ParameterizedTest
    @ValueSource(strings = ["a", "@", "9", "90", "108", ""])
    fun `상품 가격을 잘못 입력한 경우 예외가 발생한다`(value: String) {
        assertThrows<IllegalArgumentException> {
            ProductPrice(value)
        }
    }
}