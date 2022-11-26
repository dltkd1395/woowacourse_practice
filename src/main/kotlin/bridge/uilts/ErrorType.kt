package bridge.uilts

enum class ErrorType(val errorMessage: String) {
    POSITIVE_NUMBER(ERROR.format(BRIDGE_SIZE + ERROR_POSITIVE_NUMBER)),
    NUMBER_RANGE(ERROR.format(BRIDGE_SIZE + ERROR_NUMBER_RANGE))
}