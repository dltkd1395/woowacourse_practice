package subway

import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import subway.domain.InquiryType

class InquiryTypeTest {
    @ParameterizedTest
    @ValueSource(strings = ["", "3", "b", "Q"])
    fun `경로 기준 명령어를 잘못 입력한 경우 예외가 발생한다`(value: String) {
        assertThrows<IllegalArgumentException> {
            InquiryType(value)
        }
    }
}