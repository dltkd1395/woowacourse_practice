package subway

import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import subway.domain.PathInquiry

class PathInquiryTest {
    @ParameterizedTest
    @ValueSource(strings = ["", "2", "q", "B"])
    fun `경로 조회 명령어를 잘못 입력한 경우 예외가 발생한다`(value: String) {
        assertThrows<IllegalArgumentException> {
            PathInquiry(value)
        }
    }

}