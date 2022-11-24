package lotto

import lotto.domain.Prize
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class PrizeTest {
    @ParameterizedTest
    @CsvSource(
        "3,true,5000",
        "4,true,50000",
        "5,false,1500000",
        "5,true,30000000",
        "6,true,2000000000",
        "0,true,0"
    )
    fun `로또 번호와 보너스 번호를 비교하여 당첨금을 확인하다`(
        matchedCount: Int,
        isMaching: Boolean,
        winningAmount: Int
    ) {
        val result = Prize.of(matchedCount, isMaching).amount
        assertThat(result).isEqualTo(winningAmount)
    }
}