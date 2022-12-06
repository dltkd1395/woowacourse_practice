package pairmatching

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import pairmatching.domain.Course

class CourseTest {
    @Test
    fun `해당 코스가 없는 경우 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            Course.of("안드로이드")
        }
    }
}