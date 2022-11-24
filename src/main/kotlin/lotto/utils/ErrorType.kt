package lotto.utils

enum class ErrorType(val errorMessage: String) {
    LOTTO_SIZE(ERROR.format(LOTTO + ERROR_LOTTO_NUMBER_SIZE))
}