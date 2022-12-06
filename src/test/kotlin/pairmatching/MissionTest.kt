package pairmatching

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import pairmatching.domain.Mission

class MissionTest {
    @Test
    fun `해당 미션이 없는 경우 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            Mission.of("페어매칭")
        }
    }
}