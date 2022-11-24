package lotto.domain

import lotto.utils.ErrorType
import lotto.utils.THOUSAND


class Money(private val number: Int) {
    init {
        require(isAmount()) { ErrorType.MONEY_AMOUNT.errorMessage }
    }

    private fun isAmount(): Boolean =
        number >= THOUSAND
}