package pairmatching.service

import pairmatching.Repository.WoowaCourseRepository
import pairmatching.domain.Matching
import pairmatching.domain.WoowaCourse
import pairmatching.utils.ErrorType


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
            throw IllegalArgumentException(ErrorType.INQUIRY.errorMessage)
        }
        return one.last().value
    }

    fun clearAll() =
        woowaCourseRepository.clearAll()

    private fun find(woowaCourse: WoowaCourse) =
        woowaCourseRepository.find(woowaCourse)
}