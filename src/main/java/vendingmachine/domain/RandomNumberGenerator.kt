package vendingmachine.domain

import camp.nextstep.edu.missionutils.Randoms

class RandomNumberGenerator: NumberGenerator {
    override fun generate(numbers: List<Int>): Int =
        Randoms.pickNumberInList(numbers)
}