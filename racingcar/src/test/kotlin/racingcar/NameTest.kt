package racingcar

import org.junit.jupiter.api.Test
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

    @ParameterizedTest
    @ValueSource(strings = ["이!@", "noA!!", "1@%"])
    fun `자동차 이름이 특수문자를 쓰인 경우 예외가 발생한다`(value: String) {
        assertThrows<IllegalArgumentException> {
            Name(value)
        }
    }

    @Test
    fun `자동차 이름을 넣지 않은 경우 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            Name("")
        }
    }
}