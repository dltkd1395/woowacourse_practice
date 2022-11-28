package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.Position
import racingcar.domain.RandomNumber

class PositionTest {
    @Test
    fun `자동차 전진 후 위치`() {
        val randomNumber = RandomNumber()
        val position = Position().increase(randomNumber)
        assertThat(position.distance).isEqualTo(1)
    }
}