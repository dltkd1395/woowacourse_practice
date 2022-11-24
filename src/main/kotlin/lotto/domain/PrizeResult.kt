package lotto.domain

import lotto.utils.*

data class PrizeResult(
    var amount: Int = ZERO,
    var firstPrizeCount: Int = ZERO,
    var secondPrizeCount: Int = ZERO,
    var thirdPrizeCount: Int = ZERO,
    var fourthPrizeCount: Int = ZERO,
    var fifthPrizeCount: Int = ZERO
) {
    fun setCount(matchedCount: Int, isMatchingBonus: Boolean) {
        when {
            matchedCount == SIX -> firstPrizeCount++
            matchedCount == FIVE && isMatchingBonus -> secondPrizeCount++
            matchedCount == FIVE && !isMatchingBonus -> thirdPrizeCount++
            matchedCount == FOUR -> fourthPrizeCount++
            matchedCount == THREE -> fifthPrizeCount++
        }
    }

    fun getCount(matchedCount: Int, isMatchingBonus: Boolean): Int {
        when {
            matchedCount == SIX -> return firstPrizeCount
            matchedCount == FIVE && isMatchingBonus -> return secondPrizeCount
            matchedCount == FIVE && !isMatchingBonus -> return thirdPrizeCount
            matchedCount == FOUR -> return fourthPrizeCount
            matchedCount == THREE -> return fifthPrizeCount
        }
        return ZERO
    }
}