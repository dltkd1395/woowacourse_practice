package baseball

import baseball.domain.Command
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class CommandTest {
    @ParameterizedTest
    @ValueSource(strings = ["0", "3", "10"])
    fun `1또는 2가 아닌 경우 테스트`(number: String) {
        assertThrows<IllegalArgumentException> {
            Command(number)
        }
    }

    @ParameterizedTest
    @ValueSource(strings = ["22", "33", "44"])
    fun `1글자가 아닌 경우 테스트`(number: String) {
        assertThrows<IllegalArgumentException> {
            Command(number)
        }
    }
}