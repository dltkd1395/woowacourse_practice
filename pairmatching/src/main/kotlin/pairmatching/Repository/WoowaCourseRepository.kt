package pairmatching.Repository

import pairmatching.domain.Matching
import pairmatching.domain.WoowaCourse


class WoowaCourseRepository {
    fun find(woowaCourse: WoowaCourse): List<MutableMap.MutableEntry<WoowaCourse, Matching>> {
        return woowaCourses.entries
            .filter { course -> course.key.equals(woowaCourse) }
    }

    fun get(): Map<WoowaCourse, Matching> {
        return HashMap<WoowaCourse, Matching>(woowaCourses)
    }

    fun add(woowaCourse: WoowaCourse, matching: Matching) {
        woowaCourses[woowaCourse] = matching
    }

    fun clearAll() {
        woowaCourses.clear()
    }

    companion object {
        private val woowaCourses: MutableMap<WoowaCourse, Matching> =
            HashMap()
    }
}