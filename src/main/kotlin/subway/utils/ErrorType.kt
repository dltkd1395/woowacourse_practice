package subway.utils

enum class ErrorType(val errorMessage: String) {
    INQUIRY_COMMAND(ERROR.format(ERROR_PATH_INQUIRY)),
    INQUIRY_TYPE_COMMAND(ERROR.format(ERROR_INQUIRY_TYPE))
}