package pairmatching

import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import pairmatching.domain.MatchingMenu

class MatchingMenu {
    @ParameterizedTest
    @MethodSource("provideMenu")
    fun `매칭 메뉴가 3개를 입력하지 않은 경우 예외가 발생한다`(menu: List<String>) {
        assertThrows<IllegalArgumentException> {
            MatchingMenu(menu)
        }
    }

    companion object {
        @JvmStatic
        fun provideMenu() = listOf(
            listOf(),
            listOf("백엔드", "레벨1", "자동차경주", "로또"),
            listOf("프론트엔드"),
            listOf("백엔드", "레벨2")
        )
    }
}