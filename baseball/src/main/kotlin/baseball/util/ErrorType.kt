package baseball.util

enum class ErrorType(val errorMessage: String) {
    BASEBALL_NUMBER_RANGE(ERROR.format(BASEBALL_NUMBER + ERRORL_BASEBALL_NUMBER_RANGE)),
    BASEBALL_NUMBER_SIZE(ERROR.format(BASEBALL_NUMBER + ERROR_BASEBALL_NUMBER_SIZE)),
    BASEBALL_NUMBER_DUPLICATION(ERROR.format(BASEBALL_NUMBER + ERROR_BASEBALL_DUPLICATION)),
    BASEBALL_RETRY_NUMBER(ERROR.format(BASEBALL_RETRY + ERROR_RETRY_NUMBER)),
    BASEBALL_RETRY_SIZE(ERROR.format(BASEBALL_RETRY + ERROR_RETRY_NUMBER_SIZE)),
    EMPTY(ERROR.format(ERROR_EMPTY)),
    NUMBER(ERROR.format(ERROR_NUMBER))
}