package racingcar

import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import racingcar.domain.TryNumber

class TryNumberTest {
    @ParameterizedTest
    @ValueSource(ints = [0, -1, -2])
    fun `시도 횟수기 양수가 아닌 경우 예외가 발생한다`(value: Int) {
        assertThrows<IllegalArgumentException> {
            TryNumber(value)
        }
    }
}