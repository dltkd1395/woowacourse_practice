package baseball.domain

import baseball.util.NINE
import baseball.util.ONE
import baseball.util.THREE
import camp.nextstep.edu.missionutils.Randoms

class BaseBallNumberGenerator {
    fun generate(): List<Int> {
        val computer = mutableSetOf<Int>()
        while (computer.size < THREE) {
            val randomNumber = Randoms.pickNumberInRange(ONE, NINE)
            computer.add(randomNumber)
        }
        return computer.toList()
    }
}