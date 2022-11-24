package lotto

import lotto.domain.Judgement
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class JudgementTest {
    @ParameterizedTest
    @CsvSource("1,1,true", "2,2,true", "3,4,false")
    fun `로또 번호와 당첨 번호를 비교한다`(lottoNumber: Int, winningNumber: Int, expected: Boolean) {
        val actual = Judgement(lottoNumber, winningNumber).isLottoMatching()
        assertThat(actual).isEqualTo(expected)
    }
}