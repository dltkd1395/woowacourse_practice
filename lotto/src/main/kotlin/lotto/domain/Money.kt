package lotto.domain

import lotto.utils.ErrorType
import lotto.utils.ONE
import lotto.utils.THOUSAND
import lotto.utils.ZERO


data class Money(val value: Int) {

    constructor(input: String) : this(
        input.toIntOrNull() ?: throw IllegalArgumentException("${ErrorType.NUMBER.errorMessage}")
    )

    init {
        require(isAmount()) { ErrorType.MONEY_AMOUNT.errorMessage }
        require(isDivide()) { ErrorType.MONEY_DIVIDE.errorMessage }
    }

    fun divideUnit(): String =
       "%,2d".format(this.value)

    private fun isAmount(): Boolean =
        this.value >= THOUSAND

    private fun isDivide(): Boolean =
        this.value / THOUSAND >= ONE && this.value % THOUSAND == ZERO
}