package racingcar

import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import racingcar.domain.Name

class NameTest {
    @ParameterizedTest
    @ValueSource(strings = ["element", "racingcar"])
    fun `자동차 이름이 5자 이하가 아닌 경우 예외가 발생한다`(value: String) {
        assertThrows<IllegalArgumentException> {
            Name(value)
        }
    }
}