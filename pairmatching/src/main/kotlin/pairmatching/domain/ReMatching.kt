package pairmatching.domain

import pairmatching.utils.ErrorType
import pairmatching.utils.NO
import pairmatching.utils.YES

data class ReMatching(val value: String) {
    init {
        require(isCorrectReMatching()) { ErrorType.REMATCHING.errorMessage }
    }

    private fun isCorrectReMatching(): Boolean =
        when (value) {
            YES -> true
            NO -> true
            else -> false
        }
}