package lotto.domain

import lotto.utils.ErrorType

data class WinningLotto(val lotto: Lotto, val bonus: LottoNumber) {

    init {
        require(isMathcingBonus()) { ErrorType.BONUS_NUMBER.errorMessage }
    }

    private fun isMathcingBonus(): Boolean =
        lotto.isMatchingBonus(bonus)
}