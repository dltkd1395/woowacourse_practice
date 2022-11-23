package baseball.util.validation

import baseball.util.ErrorType
import baseball.util.ONE

class Validator(private val inputValue: String) {
    init {
        require(isEmpty()) { ErrorType.EMPTY.errorMessage }
    }

    fun isEmpty(): Boolean =
        inputValue.isNotEmpty() || inputValue.length >= ONE
}