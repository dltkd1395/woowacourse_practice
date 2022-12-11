package vendingmachine.utils

enum class ErrorType(val errorMessage: String) {
    RETENTION(ERROR.format(ERROR_RETENTION))
}