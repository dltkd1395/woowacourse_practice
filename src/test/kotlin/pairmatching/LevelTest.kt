package pairmatching

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import pairmatching.domain.Level

class LevelTest {
    @Test
    fun `해당 레벨이 없는 경우 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            Level.of("6")
        }
    }
}