package lotto

import lotto.domain.Profit
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class ProfitTest {
    @ParameterizedTest
    @CsvSource("5000,8000,62.5", "2_000_000_000,8000,'25,000,000.0'")
    fun `수익률을 계산한다`(prize: Int, money: Int, expected: String) {
        val actual = Profit(prize, money).calculate()
        assertThat(actual).isEqualTo(expected)
    }
}