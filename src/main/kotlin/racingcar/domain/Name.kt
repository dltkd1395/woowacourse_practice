package racingcar.domain

import racingcar.utils.ErrorType
import racingcar.utils.MAX_NAME_RANGE

class Name(private val value: String) {
    init {
        require(isNumberRange()) { ErrorType.NAME_RANGE.errorMessage }
    }

    private fun isNumberRange(): Boolean =
        value.length <= MAX_NAME_RANGE
}