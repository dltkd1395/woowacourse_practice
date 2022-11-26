package bridge

import bridge.domain.Command
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
}