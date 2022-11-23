package baseball

import baseball.domain.Player
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
}