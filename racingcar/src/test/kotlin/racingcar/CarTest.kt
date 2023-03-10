package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.Car
import racingcar.domain.Position
import racingcar.domain.Judgement

class CarTest {
    @Test
    fun `자동차가 전진한다`() {
        val name = "poni"
        val position = 0
        val car = Car(name, position)
        val random = Judgement((0..9), 0)
        val carDistance = car.moveForwod(random)
        assertThat(carDistance.isSamePosition(Position(1))).isTrue()
    }
}