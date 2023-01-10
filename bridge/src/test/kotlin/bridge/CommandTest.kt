package bridge

import bridge.domain.Command
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class CommandTest {
    @ParameterizedTest
    @ValueSource(strings = ["D", "U"])
    fun `재시작 여부 명령어가 R또는 Q가 아닌 경우 에러가 발생한다`(type: String) {
        assertThrows<IllegalArgumentException> {
            Command(type)
        }
    }

    @Test
    fun `재시작 여부 명령어에 값을 입력하지 않은 경우 에러가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            Command("")
        }
    }

    @ParameterizedTest
    @ValueSource(strings = ["d", "r", "q"])
    fun `재시작 여부 명령어가 소문자인 경우 에러가 발생한다`(type: String) {
        assertThrows<IllegalArgumentException> {
            Command(type)
        }
    }

    @ParameterizedTest
    @ValueSource(strings = ["3", "4", "5"])
    fun `재시작 여부 명령어가 숫자인 경우 에러가 발생한다`(type: String) {
        assertThrows<IllegalArgumentException> {
            Command(type)
        }
    }

    @ParameterizedTest
    @ValueSource(strings = ["QQ", "RR"])
    fun `재시작 여부 명령어가 1글자가 아닌 경우 에러가 발생한다`(type: String) {
        assertThrows<IllegalArgumentException> {
            Command(type)
        }
    }
}