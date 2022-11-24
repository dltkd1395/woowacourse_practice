package lotto

import lotto.domain.Money
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class MoneyTest {
    @Test
    fun `로또 구입 금액이 1000원보다 작은 경우 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            Money(900)
        }
    }
}