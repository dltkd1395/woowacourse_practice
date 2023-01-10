package pairmatching.domain

import pairmatching.utils.*
import java.util.function.Predicate

enum class Level(val value: String, val missions: List<Mission> = listOf()) {
    Level1(LEVEL_1, listOf(Mission.RACING, Mission.LOTTO, Mission.BASEBALL)),
    Level2(LEVEL_2, listOf(Mission.SHOPPING_BASKET, Mission.PAYMENT, Mission.SUBWAY_MAP)),
    Level3(LEVEL_3),
    Level4(LEVEL_4, listOf(Mission.IMPROVEMENT, Mission.DISTRIBUTION)),
    Level5(LEVEL_5);

    companion object {
        fun of(name: String): Level {
            return values().find { level ->
                level.value.equals(name)
            } ?: throw IllegalArgumentException(ErrorType.LEVEL.errorMessage)
        }
    }
}