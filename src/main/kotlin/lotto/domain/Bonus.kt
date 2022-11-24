package lotto.domain

import lotto.utils.ErrorType

class Bonus(private val lotto: List<Int>, private val number: Int) {
    init {
        require(isLottoInclusion()) { ErrorType.BONUS_NUMBER.errorMessage }
    }

    private fun isLottoInclusion(): Boolean =
        number !in lotto
}