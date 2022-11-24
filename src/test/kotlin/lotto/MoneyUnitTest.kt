package lotto

import lotto.domain.MoneyUnit
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class MoneyUnitTest {
    @ParameterizedTest
    @CsvSource("1000,'1,000'", "2000000000,'2,000,000,000'", "3000000,'3,000,000'")
    fun `돈 단위로 나눈다`(money: Int, expected: String) {
        val actual = MoneyUnit(money).divideUnit()
        assertThat(actual).isEqualTo(expected)
    }
}