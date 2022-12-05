package pairmatching.domain

import pairmatching.utils.*

class Feature(private val command: String) {
    init {
        require(isCommand()) { ErrorType.FEARTURE.errorMessage }
    }

    private fun isCommand(): Boolean =
        when (command) {
            PAIR_MATCHING_COMMAND -> true
            PAIR_INQUIY_COMMAND -> true
            PAIR_INITIALIZATION_COMMAND -> true
            QUIT_COMMAND -> true
            else -> false
        }
}