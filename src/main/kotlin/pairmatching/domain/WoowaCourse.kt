package pairmatching.domain

import pairmatching.utils.*
import java.io.File
import java.io.IOException

data class WoowaCourse(val course: Course, val level: Level, val mission: Mission) {
    companion object {
        fun from(matchingMenu: MatchingMenu): WoowaCourse {
            val (course, level, mission) = matchingMenu.values

            return WoowaCourse(Course.of(course), Level.of(level), Mission.of(mission))
        }
    }

    init {
        require(isContainMission()) { ErrorType.MISSIONS.errorMessage }
    }

    fun loadCrews(): List<String> {
        try {
            return readCrewsFile().readText().split(" ")
        } catch (e: IOException) {
            throw IllegalArgumentException(ErrorType.FILE.errorMessage)
        }
    }

    fun isSameLevel(woowaCourse: WoowaCourse): Boolean =
        this.level == woowaCourse.level

    private fun readCrewsFile(): File {
        return when (course.value) {
            BACKEND_COURCE -> File(PATH + FILE_BACKEND)
            FRONTEND_COURCE -> File(PATH + FILE_FRONTEND)
            else -> throw IOException()
        }
    }

    private fun isContainMission(): Boolean =
        level.missions.contains(mission)
}