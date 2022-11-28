package racingcar.domain

import racingcar.utils.ErrorType
import racingcar.utils.MAX_NAME_RANGE
import java.util.regex.Pattern

data class Name(val value: String) {
    init {
        require(isNumberRange()) { ErrorType.NAME_RANGE.errorMessage }
        require(isSpecialCharacter()) { ErrorType.NAME_PATTERN.errorMessage }
    }

    private fun isNumberRange(): Boolean =
        value.length <= MAX_NAME_RANGE

    private fun isSpecialCharacter(): Boolean {
        val regex = "[가-핳\\w_]*"
        if (!Pattern.matches(regex, value)) {
            return false
        }
        return true
    }
}