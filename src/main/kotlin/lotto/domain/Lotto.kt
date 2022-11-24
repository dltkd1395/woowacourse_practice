package lotto.domain

import lotto.utils.ErrorType

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6) { ErrorType.LOTTO_SIZE.errorMessage }
    }
}
