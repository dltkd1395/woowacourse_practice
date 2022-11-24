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
}