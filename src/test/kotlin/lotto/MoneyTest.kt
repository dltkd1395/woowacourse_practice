package lotto

import lotto.domain.Money
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class MoneyTest {
    @Test
    fun `로또 구입 금액이 1000원보다 작은 경우 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            Money(900)
        }
    }

    @ParameterizedTest
    @ValueSource(ints = [1100, 2500, 14100])
    fun `로또 구입 금액이 1000원 단위로 나누어 떨어지지 않는 경우 예외가 발생한다`(amount: Int) {
        assertThrows<IllegalArgumentException> {
            Money(amount)
        }
    }
}