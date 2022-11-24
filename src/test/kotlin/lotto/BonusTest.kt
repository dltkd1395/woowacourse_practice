package lotto

import lotto.domain.Bonus
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class BonusTest {
    @Test
    fun `보너스 번호가 로또 번호와 중복되는 숫자가 있으면 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            Bonus(listOf(1, 2, 3, 4, 5), 5)
        }
    }
}