package racingcar.domain

import racingcar.utils.MAX_RANDOM_NUMBER
import racingcar.utils.MIN_RANDOM_NUMBER
import racingcar.utils.THRESHOLD


class Judgement(
    private val randomNumber: IntRange = (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER),
    private val threshold: Int = THRESHOLD
): Movement {
    override fun isMovable(): Boolean =
        randomNumber.random() >= threshold
}