package vendingmachine

import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import vendingmachine.domain.RetentionAmount

class RetentionAmountTest {
    @ParameterizedTest
    @ValueSource(strings = ["", "a", "@", "-1"])
    fun `보유 금액을 잘못 입력한 경우 예외가 발생한다`(amount: String) {
        assertThrows<IllegalArgumentException> {
            RetentionAmount(amount)
        }
    }
}