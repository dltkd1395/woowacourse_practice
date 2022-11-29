package baseball.domain

import baseball.util.ErrorType
import baseball.util.ONE
import baseball.util.TWO

data class Command(val number: Int = ONE): PlayGame {

    constructor(input: String) : this(
        input.toIntOrNull()
            ?: throw IllegalArgumentException("${ErrorType.NUMBER.errorMessage}")
    )

    init {
        require(isRetryNumber()) { ErrorType.BASEBALL_RETRY_NUMBER.errorMessage }
    }

    private fun isRetryNumber(): Boolean =
        this.number == ONE || this.number == TWO

    override fun isGameOver(): Boolean =
        this.number == TWO
}