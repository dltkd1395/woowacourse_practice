package bridge

import bridge.domain.BridgeNumber
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.ValueSource

class BridgeNumberTest {
    @ParameterizedTest
    @ValueSource(strings = ["-1", "-2", "-3"])
    fun `다리길이가 음수인 경우 에러가 발생한다`(number: String) {
        assertThrows<IllegalArgumentException> {
            BridgeNumber(number)
        }
    }

    @ParameterizedTest
    @ValueSource(strings = ["1", "2", "21", "22", "23"])
    fun `다리길이가 3부터 20 까지의 숫자가 아닌 경우 에러가 발생한다`(number: String) {
        assertThrows<IllegalArgumentException> {
            BridgeNumber(number)
        }
    }

    @ParameterizedTest
    @ValueSource(strings = ["a", "A", "BB", "1@"])
    fun `다리길이가 문자인 경우 에러가 발생한다`(expected: String) {
        assertThrows<IllegalArgumentException> {
            BridgeNumber(expected)
        }
    }
}