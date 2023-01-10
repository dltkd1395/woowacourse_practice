package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
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

    @ParameterizedTest
    @ValueSource(strings = ["a", "!", "b"])
    fun `시도 횟수가 숫자가 아닌 경우 예외가 발생한다`(value: String) {
        assertThrows<IllegalArgumentException> {
            TryNumber(value)
        }
    }

    @Test
    fun `게임을 종료한다`() {
        val tryNumber = TryNumber(1)
        tryNumber.decrease()
        assertThat(tryNumber.isGameOver()).isTrue()
    }
}