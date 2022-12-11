package vendingmachine

import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import vendingmachine.domain.ProductQuantity

class ProductQuantityTest {
    @ParameterizedTest
    @ValueSource(strings = ["a", "@"])
    fun `상품 수량을 잘못 입력한 경우 예외가 발생한다`(value: String) {
        assertThrows<IllegalArgumentException> {
            ProductQuantity(value)
        }
    }
}