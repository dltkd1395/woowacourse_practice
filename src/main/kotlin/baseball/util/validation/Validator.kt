package baseball.util.validation

import baseball.util.ErrorType
import baseball.util.ONE
import java.util.regex.Pattern

class Validator(private val inputValue: String) {
    init {
        require(isEmpty()) { ErrorType.EMPTY.errorMessage }
        require(isLetter()) { ErrorType.NUMBER.errorMessage }
    }

    fun isEmpty(): Boolean =
        inputValue.isNotEmpty() || inputValue.length >= ONE

    fun isLetter(): Boolean {
        val letter = "^[0-9]$"
        val pattern = Pattern.compile(letter)
        inputValue.map { number ->
            if (!pattern.matcher(number.toString()).find()) {
                return false
            }
        }
        return true
    }
}