package pairmatching

import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import pairmatching.domain.Feature

class FeatureTest {
    @ParameterizedTest
    @ValueSource(strings = ["0", "4", "q", "R"])
    fun `기능 명령어를 잘못 입력한 경우 예외가 발생한다`(command: String) {
        assertThrows<IllegalArgumentException> {
            Feature(command)
        }
    }
}