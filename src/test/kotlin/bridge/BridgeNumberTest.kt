package bridge

import bridge.domain.BridgeNumber
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class BridgeNumberTest {
    @ParameterizedTest
    @ValueSource(ints = [-1, -2, -3])
    fun `다리길이가 음수인 경우 에러가 발생한다`(number: Int) {
        assertThrows<IllegalArgumentException> {
            BridgeNumber(number)
        }
    }

    @ParameterizedTest
    @ValueSource(ints = [1, 2, 21, 22, 23])
    fun `다리길이가 3부터 20 까지의 숫자가 아닌 경우 에러가 발생한다`(number: Int) {
        assertThrows<IllegalArgumentException> {
            BridgeNumber(number)
        }
    }
}