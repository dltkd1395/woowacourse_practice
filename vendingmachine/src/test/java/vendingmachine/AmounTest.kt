package vendingmachine

import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import vendingmachine.domain.Amount

class AmounTest {
    @ParameterizedTest
    @ValueSource(strings = ["", "a", "@", "-1"])
    fun `금액을 잘못 입력한 경우 예외가 발생한다`(value: String) {
        assertThrows<IllegalArgumentException> {
            Amount(value)
        }
    }
}