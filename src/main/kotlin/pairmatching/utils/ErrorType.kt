package pairmatching.utils

enum class ErrorType(val errorMessage: String) {
    FEARTURE(ERROR.format(ERROR_FEATURE_COMMAND)),
    COURCE(ERROR.format(ERROR_NOT_FIND_COURCE)),
    LEVEL(ERROR.format(ERROR_NOT_FIND_LEVEL)),
    MISSION(ERROR.format(ERROR_NOT_FIND_MISSION)),
    MISSIONS(ERROR.format(ERROR_NOT_CONTAIN_MISSION)),
    INFORMATION_SIZE(ERROR.format(ERROR_INFORMATION_SIZE)),
    FILE(ERROR.format(ERROR_NOT_FIND_FILE)),
    MATCHING(ERROR.format(ERROR_FAIL_MATCHING)),
    REMATCHING(ERROR.format(ERROR_REMATCHING)),
    INQUIRY(ERROR.format(ERROR_INQUIRY))
}