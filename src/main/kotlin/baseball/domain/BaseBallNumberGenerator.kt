package baseball.domain

import baseball.util.NINE
import baseball.util.ONE
import baseball.util.THREE
import camp.nextstep.edu.missionutils.Randoms

class BaseBallNumberGenerator {
    fun generate(): List<BaseBallNumber> {
        val computer = mutableSetOf<BaseBallNumber>()
        while (computer.size < THREE) {
            val randomNumber = Randoms.pickNumberInRange(ONE, NINE)
            computer.add(BaseBallNumber(randomNumber))
        }
        return computer.toList()
    }
}