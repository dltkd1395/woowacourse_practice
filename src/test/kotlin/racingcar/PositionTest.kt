package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.Position
import racingcar.domain.Judgement

class PositionTest {
    @Test
    fun `자동차 전진 후 위치`() {
        val judgement = Judgement()
        val position = Position().increase(judgement)
        assertThat(position.distance).isEqualTo(1)
    }
}