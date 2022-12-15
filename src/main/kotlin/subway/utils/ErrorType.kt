package subway.utils

enum class ErrorType(val errorMessage: String) {
    INQUIRY_COMMAND(ERROR.format(ERROR_PATH_INQUIRY))
}