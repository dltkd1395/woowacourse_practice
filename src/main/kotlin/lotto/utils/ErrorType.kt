package lotto.utils

enum class ErrorType(val errorMessage: String) {
    LOTTO_SIZE(ERROR.format(LOTTO + ERROR_LOTTO_NUMBER_SIZE)),
    LOTTO_DUPLICATION(ERROR.format(LOTTO + ERROR_LOTTO_DUPLICATION))
}