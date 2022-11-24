package lotto.utils

enum class ErrorType(val errorMessage: String) {
    LOTTO_SIZE(ERROR.format(LOTTO + ERROR_LOTTO_NUMBER_SIZE)),
    LOTTO_DUPLICATION(ERROR.format(LOTTO + ERROR_LOTTO_DUPLICATION)),
    LOTTO_RANGE(ERROR.format(LOTTO + ERROR_LOTTO_NUMBER_RANGE)),
    MONEY_AMOUNT(ERROR.format(MONEY + ERROR_MONEY_AMOUNT)),
    MONEY_DIVIDE(ERROR.format(MONEY + ERROR_MONEY_DIVIDE))
}