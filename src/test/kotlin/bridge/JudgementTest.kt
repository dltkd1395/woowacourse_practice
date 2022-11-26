package bridge

import bridge.domain.Judgement
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class JudgementTest {
    @ParameterizedTest
    @CsvSource("U,U,O", "D,U,X")
    fun `입력한 방향 값과 컴퓨터가 생성한 값을 비교한다`(computer: String, player: String, expected: String) {
        val actual = Judgement(computer, player).compareDirection()
        assertThat(actual).isEqualTo(expected)
    }
}