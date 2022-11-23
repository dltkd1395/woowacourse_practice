package baseball

import baseball.domain.Command
import baseball.domain.Player
import baseball.util.ErrorType
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class PlayerTest {
    @ParameterizedTest
    @ValueSource(strings =["0", "10", "11", "100"])
    fun `1부터 9까지의 숫자 범위가 아닌 경우 테스트`(number: String) {
        assertThrows<IllegalArgumentException> {
            Player(number)
        }
    }

    @ParameterizedTest
    @ValueSource(strings = ["1", "1234", "12"])
    fun `3자리가 아닌 경우 테스트`(number: String) {
        assertThrows<IllegalArgumentException> {
            Player(number)
        }
    }

    @ParameterizedTest
    @ValueSource(strings = ["122", "233", "455"])
    fun `중복되는 숫자가 있는 경우 테스트`(number: String) {
        assertThrows<IllegalArgumentException> {
            Player(number)
        }
    }

    @Test
    fun `값을 입력하지 않은 경우 테스트`() {
        assertThrows<IllegalArgumentException> {
            Player("")
        }
    }


    @ParameterizedTest
    @ValueSource(strings = ["a", "!", "A"])
    fun `숫자가 아닌 경우 테스트`(number: String) {
        assertThrows<IllegalArgumentException> {
            Player(number)
        }
    }
}