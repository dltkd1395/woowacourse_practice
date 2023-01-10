package baseball

import baseball.domain.BaseBallNumber
import baseball.domain.Judgement
import baseball.domain.Player
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class JudgementTest {
    @Test
    fun `스트라이크 확인 테스트`() {
        val playerNumbers = Player.from(listOf("1", "2", "3")).baseBallNumbers
        val computerNumbers = listOf("1", "2", "3").map { BaseBallNumber(it) }
        val result = Judgement().getStrike(playerNumbers, computerNumbers)
        assertThat(result).isEqualTo(3)
    }

    @ParameterizedTest
    @ValueSource(ints = [1, 2, 3])
    fun `볼 확인 테스트`(playerNumber: Int) {
        val playerNumbers = Player.from(listOf("1", "3", "2")).baseBallNumbers
        val computerNumbers = listOf("1", "2", "3").map { BaseBallNumber(it) }
        val result = Judgement().getBall(playerNumbers, computerNumbers)
        assertThat(result).isEqualTo(2)
    }
}