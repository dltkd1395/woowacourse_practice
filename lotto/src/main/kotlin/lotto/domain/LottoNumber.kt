package lotto.domain

import lotto.utils.ErrorType
import lotto.utils.LOTTO_MAX_NUMBER
import lotto.utils.LOTTO_MIN_NUMBER

data class LottoNumber(val value: Int) {

    constructor(number: String) : this(
        number.toIntOrNull() ?: throw IllegalArgumentException("${ErrorType.NUMBER.errorMessage}")
    )

    init {
        require(isNumberRange()) { ErrorType.LOTTO_RANGE.errorMessage }
    }

    private fun isNumberRange(): Boolean =
        this.value in LOTTO_MIN_NUMBER..LOTTO_MAX_NUMBER
}