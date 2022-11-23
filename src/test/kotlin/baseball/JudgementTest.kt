package baseball

import baseball.domain.Judgement
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class JudgementTest {
    @Test
    fun `스트라이크 확인 테스트`() {
        val result = Judgement().isStrike(1, 1)
        assertThat(result).isTrue()
    }

    @ParameterizedTest
    @ValueSource(ints = [1, 2, 3])
    fun `볼 확인 테스트`(playerNumber: Int) {
        val computerNumbers = listOf(1, 2, 3)
        val result = Judgement().isBall(playerNumber, computerNumbers)
        assertThat(result).isTrue()
    }
}