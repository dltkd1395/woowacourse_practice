package pairmatching.domain

import pairmatching.utils.ErrorType

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

    private fun isContainMission(): Boolean =
        level.missions.contains(mission)
}