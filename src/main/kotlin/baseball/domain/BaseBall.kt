package baseball.domain

import baseball.util.THREE
import baseball.util.ZERO

data class BaseBall(
    val strike: Int = ZERO,
    val ball: Int = ZERO,
) {
    fun play(strike: Int, ball: Int): BaseBall =
        BaseBall(strike, ball)

    fun reset(): BaseBall =
        BaseBall(ZERO, ZERO)

    fun retry(): Boolean =
        strike != THREE
}
