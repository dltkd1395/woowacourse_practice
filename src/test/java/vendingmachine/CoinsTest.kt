package vendingmachine

import camp.nextstep.edu.missionutils.test.NsTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

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

    override fun runMain() {
        main()
    }
}