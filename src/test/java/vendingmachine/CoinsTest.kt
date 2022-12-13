package vendingmachine

import camp.nextstep.edu.missionutils.test.NsTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import vendingmachine.domain.Amount
import vendingmachine.domain.Coins

class CoinsTest : NsTest() {
    @Test
    fun `보유 금액으로 무작위 동전 생성 후 개수 카운터한다`() {
        camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInListTest({
            run("450")
            assertThat(output()).contains(
                "자판기가 보유한 동전",
                "500원 - 0개",
                "100원 - 4개",
                "50원 - 1개",
                "10원 - 0개"
            )
        }, 100, 100, 100, 100, 50)
    }

    @Test
    fun `잔돈으로 돌려준다`() {
        val actual = Coins(mutableMapOf(500 to 0, 100 to 4, 50 to 1, 10 to 0))
            .makeChange(Amount(500))
        val expected = Coins(mutableMapOf(100 to 4, 50 to 1))
        assertThat(actual).isEqualTo(expected)
    }

    override fun runMain() {
        main()
    }
}