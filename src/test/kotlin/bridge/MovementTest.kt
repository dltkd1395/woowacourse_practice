package bridge

import bridge.domain.Movement
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class MovementTest {
    @ParameterizedTest
    @ValueSource(strings = ["Q", "T"])
    fun `이동 방향이 U 또는 D가 아닌 경우 에러가 발생한다`(direction: String) {
        assertThrows<IllegalArgumentException> {
            Movement(direction)
        }
    }

    @Test
    fun `이동 방향 값을 입력하지 않은 경우 에러가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            Movement("")
        }
    }

    @ParameterizedTest
    @ValueSource(strings = ["u", "d", "q"])
    fun `이동 방향은 소문자인 경우 에러가 발생한다`(direction: String) {
        assertThrows<IllegalArgumentException> {
            Movement(direction)
        }
    }

    @ParameterizedTest
    @ValueSource(strings = ["3", "4", "5"])
    fun `이동 방향은 숫자인 경우 에러가 발생한다`(direction: String) {
        assertThrows<IllegalArgumentException> {
            Movement(direction)
        }
    }
}