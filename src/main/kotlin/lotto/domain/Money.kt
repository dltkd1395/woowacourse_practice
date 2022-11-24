package lotto.domain

import lotto.utils.ErrorType
import lotto.utils.ONE
import lotto.utils.THOUSAND
import lotto.utils.ZERO


class Money(private val number: Int) {
    init {
        require(isAmount()) { ErrorType.MONEY_AMOUNT.errorMessage }
        require(isDivide()) { ErrorType.MONEY_DIVIDE.errorMessage }
    }

    private fun isAmount(): Boolean =
        number >= THOUSAND

    private fun isDivide(): Boolean =
        number / THOUSAND >= ONE && number % THOUSAND == ZERO
}