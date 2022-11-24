package lotto.domain

import lotto.utils.*

enum class Prize(
    val matchedCount: Int,
    val amount: Int,
    val isBonusMathing: Boolean = false
) {
    FIRST(SIX, FIRST_PRIZE),
    SECOND(FIVE, SECOND_PRIZE, true),
    THIRD(FIVE, THIRD_PRIZE),
    FOURTH(FOUR, FOURTH_PRIZE),
    FIFTH(THREE, FIFTH_PRZE),
    NO_WINNING_AMOUNT(ZERO, ZERO);

    private fun isCorrectMatching(count: Int, isMatching: Boolean): Boolean =
        count == FIVE && isMatching

    private fun isMatchingLottoNumber(count: Int, isMatchingBonus: Boolean): Boolean =
        isCorrectMatching(count, isMatchingBonus) == isBonusMathing

    companion object {
        fun of(count: Int, isBonusMatching: Boolean): Prize {
            return values()
                .firstOrNull { prize ->
                    prize.matchedCount == count &&
                            prize.isMatchingLottoNumber(count, isBonusMatching)
                } ?: NO_WINNING_AMOUNT
        }
    }
}