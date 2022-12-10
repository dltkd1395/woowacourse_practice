package vendingmachine

import camp.nextstep.edu.missionutils.test.NsTest
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class ApplicationTest : NsTest() {
    @Test
    fun 기능_테스트() {
        camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInListTest(
            {
                run("450", "[콜라,1500,20];[사이다,1000,10]", "3000", "콜라", "사이다")
                Assertions.assertThat(output()).contains(
                    "자판기가 보유한 동전", "500원 - 0개", "100원 - 4개", "50원 - 1개", "10원 - 0개",
                    "투입 금액: 3000원", "투입 금액: 1500원"
                )
            },
            100, 100, 100, 100, 50
        )
    }

    @Test
    fun 예외_테스트() {
        camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest {
            runException("-1")
            Assertions.assertThat(output()).contains(ERROR_MESSAGE)
        }
    }

    override fun runMain() {
        main()
    }

    companion object {
        private const val ERROR_MESSAGE = "[ERROR]"
    }
}