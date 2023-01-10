package pairmatching

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import pairmatching.domain.MatchingMenu
import pairmatching.domain.WoowaCourse

class WoowaCourseTest {
    @Test
    fun `레벨에 맞지 않는 미션이 있는 경우 예외가 발생한다`() {
        val menu = MatchingMenu(listOf("백엔드", "레벨1", "성능개선"))
        assertThrows<IllegalArgumentException> {
            WoowaCourse.from(menu)
        }
    }

}