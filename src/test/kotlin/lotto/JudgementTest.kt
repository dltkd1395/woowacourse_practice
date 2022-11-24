package lotto

import lotto.domain.Judgement
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class JudgementTest {
    @ParameterizedTest
    @CsvSource("1,[1,2,3,4,5,6],true", "2,[1,2,3,4,5,6],true", "8,[1,2,3,4,5,6],false")
    fun `로또 번호와 당첨 번호를 비교한다`(lottoNumber: Int, winningNumber: List<Int>, expected: Boolean) {
        val actual = Judgement(lottoNumber, winningNumber).isLottoMatching()
        assertThat(actual).isEqualTo(expected)
    }
}