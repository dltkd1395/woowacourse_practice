package lotto.domain

import lotto.utils.*

enum class Prize(
    val matchedCount: Int,
    val amount: Int,
    val isMatchingBonus: Boolean = false
) {
    FIRST(SIX, FIRST_PRIZE),
    SECOND(FIVE, SECOND_PRIZE, true),
    THIRD(FIVE, THIRD_PRIZE),
    FOURTH(FOUR, FOURTH_PRIZE),
    FIFTH(THREE, FIFTH_PRZE),
    NO_WINNING_AMOUNT(ZERO, ZERO);

    companion object {
        fun of(matchResult: MatchResult): Prize {
            return when(matchResult.matchedCount) {
                SIX -> FIRST
                FIVE -> isMatching(matchResult.isMatchable)
                FOUR -> FOURTH
                THREE -> FIFTH
                else -> NO_WINNING_AMOUNT
            }
        }

        private fun isMatching(isBonusMatching: Boolean): Prize {
            if (isBonusMatching) {
                return SECOND
            }
            return THIRD
        }
    }
}