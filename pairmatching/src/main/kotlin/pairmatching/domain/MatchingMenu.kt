package pairmatching.domain

import pairmatching.utils.ErrorType
import pairmatching.utils.THREE

data class MatchingMenu(val values: List<String>) {
    init {
        require(isSize()) { ErrorType.INFORMATION_SIZE.errorMessage }
    }

    private fun isSize(): Boolean =
        values.size.equals(THREE)
}