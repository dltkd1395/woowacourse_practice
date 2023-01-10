package baseball

import baseball.domain.Player
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class PlayerTest {
    @Test
    fun `1부터 9까지의 숫자 범위가 아닌 경우 테스트`() {
        val numbers = listOf("10", "11", "12")
        assertThrows<IllegalArgumentException> {
            Player.from(numbers)
        }
    }

    @Test
    fun `3자리가 아닌 경우 테스트`() {
        val numbers = listOf("1", "2", "3", "4")
        assertThrows<IllegalArgumentException> {
            Player.from(numbers)
        }
    }

    @Test
    fun `중복되는 숫자가 있는 경우 테스트`() {
        val numbers = listOf("1", "2", "2")
        assertThrows<IllegalArgumentException> {
            Player.from(numbers)
        }
    }

    @Test
    fun `값을 입력하지 않은 경우 테스트`() {
        val numbers = listOf("")
        assertThrows<IllegalArgumentException> {
            Player.from(numbers)
        }
    }


    @Test
    fun `숫자가 아닌 경우 테스트`() {
        val numbers = listOf("@", "A", "B")
        assertThrows<IllegalArgumentException> {
            Player.from(numbers)
        }
    }
}