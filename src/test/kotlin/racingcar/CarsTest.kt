package racingcar

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import racingcar.domain.Cars

class CarsTest {

    @Test
    fun `자동차 이름이 중복되는 이름이 있는 경우 예외가 발생한다`() {
        val carNames = listOf("pobi", "pobi", "woni", "jun", "pobi")
        assertThrows<IllegalArgumentException> {
            Cars.from(carNames)
        }
    }
}