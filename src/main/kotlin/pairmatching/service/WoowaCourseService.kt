package pairmatching.service

import pairmatching.Repository.WoowaCourseRepository
import pairmatching.domain.Matching
import pairmatching.domain.WoowaCourse


class WoowaCourseService {
    private val woowaCourseRepository = WoowaCourseRepository()

    fun isDuplication(woowaCourse: WoowaCourse): Boolean =
        find(woowaCourse).size >= 1

    fun addMatching(woowaCourse: WoowaCourse, matching: Matching): Matching {
        woowaCourseRepository.add(woowaCourse, matching)
        return matching
    }

    fun getPairMatch(woowaCourse: WoowaCourse): Matching {
        val one = find(woowaCourse)
        if (one.size < 1) {
            throw IllegalArgumentException()
        }
        return one.last().value
    }

    private fun find(woowaCourse: WoowaCourse) =
        woowaCourseRepository.find(woowaCourse)
}