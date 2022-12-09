package pairmatching.service

import camp.nextstep.edu.missionutils.Randoms
import pairmatching.Repository.WoowaCourseRepository
import pairmatching.domain.Crew
import pairmatching.domain.Matching
import pairmatching.domain.WoowaCourse
import pairmatching.domain.Pair
import pairmatching.utils.ErrorType
import java.util.*

class PairMatchingService(private val repository: WoowaCourseRepository = WoowaCourseRepository()) {

    fun match(woowaCourse: WoowaCourse): List<Pair> {
        val load = woowaCourse.loadCrews()
        while (MAX_TRY >= 0) {
            val pairs = shuffleCrews(load)
            if (isMatchable(pairs, woowaCourse)) {
                return pairs
            }
            MAX_TRY--
        }
        throw IllegalArgumentException(ErrorType.MATCHING.errorMessage)
    }

    private fun isMatchable(pairs: List<Pair>, woowaCourse: WoowaCourse): Boolean {
        val map = repository.get()
        return map.entries
            .filter { entry -> entry.key.isSameLevel(woowaCourse) && !entry.key.equals(woowaCourse) }
            .all { entry -> isNotDuplication(entry.value, pairs) }
    }

    private fun isNotDuplication(matching: Matching, candidates: List<Pair>): Boolean {
        for (candidate in candidates) {
            if (matching.contains(candidate)) {
                return true
            }
        }
        return false
    }

    private fun shuffleCrews(load: List<String>): List<Pair> =
        doMatch(Randoms.shuffle(load)
            .map { crew -> Crew(crew) })


    private fun doMatch(crews: List<Crew>): List<Pair> {
        val pairs = arrayListOf<Pair>()
        for (i in 0 until crews.size - 1 step 2) {
            val firstCrew = crews.get(i)
            val secondCrew = crews.get(i + 1)
            pairs.add(Pair(Arrays.asList(firstCrew,secondCrew)))
        }
        addLastCrew(crews, pairs)
        return pairs
    }

    private fun addLastCrew(crews: List<Crew>, pairs: List<Pair>) {
        if (crews.size % 2 != 0) {
            pairs.last().add(crews.last())
        }
    }

    companion object {
        private var MAX_TRY = 3
    }
}