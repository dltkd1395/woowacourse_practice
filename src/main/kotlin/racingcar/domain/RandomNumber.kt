package racingcar.domain

import racingcar.utils.MAX_RANDOM_NUMBER
import racingcar.utils.MIN_RANDOM_NUMBER
import racingcar.utils.THRESHOLD


class RandomNumber(
    private val randomNumber: Int = (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random(),
    private val threshold: Int = THRESHOLD
): Movement {
    override fun isMovable(): Boolean =
        randomNumber >= threshold
}