package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import racingcar.domain.Car
import racingcar.domain.Cars
import racingcar.domain.Judgement
import racingcar.domain.Position

class CarsTest {

    @Test
    fun `자동차 이름이 중복되는 이름이 있는 경우 예외가 발생한다`() {
        val carNames = listOf("pobi", "pobi", "woni", "jun", "pobi")
        assertThrows<IllegalArgumentException> {
            Cars.from(carNames)
        }
    }

    @Test
    fun `자동차들이 움직인다`() {
        val judgement = Judgement((0..9).random(), 0)
        val cars = listOf(Car("poni"), Car("wooni"))
        val movingCar = Cars(cars, judgement).move()
        movingCar.cars.map { car ->
            assertThat(car.isSamePosition(Position(1))).isTrue()
        }
    }
}