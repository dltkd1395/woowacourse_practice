package vendingmachine

import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import vendingmachine.domain.InputAmount

class InputAmountTest {
    @ParameterizedTest
    @ValueSource(strings = ["", "a", "@"])
    fun `투입 금액을 잘못 입력한 경우 예외가 발생한다`(value: String) {
        assertThrows<IllegalArgumentException> {
            InputAmount(value)
        }
    }
}