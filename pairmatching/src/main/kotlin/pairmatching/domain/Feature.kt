package pairmatching.domain

import pairmatching.utils.*

enum class Feature(val command: String) {
    PAIR_MATCHING("1"),
    PAIR_INQUIY("2"),
    PAIR_INITIALIZATION("3"),
    QUIT("Q");

    companion object {
        fun of(command: String): Feature {
            return values()
                .find { feature ->
                    feature.command.equals(command)
                } ?: throw IllegalArgumentException(ErrorType.FEARTURE.errorMessage)
        }
    }
}