package pairmatching.view

import camp.nextstep.edu.missionutils.Console
import pairmatching.utils.INPUT_FEATURE_SELECTION
import pairmatching.utils.INPUT_PAIR_MATCHING
import pairmatching.utils.INPUT_REMATCHING

object InputView {
    fun readFeature(): String {
        println(INPUT_FEATURE_SELECTION)
        return Console.readLine()
    }

    fun readMatching(): List<String> {
        println(INPUT_PAIR_MATCHING)
        return Console.readLine().split(", ")
    }

    fun readReMatching(): String {
        println(INPUT_REMATCHING)
        return Console.readLine()
    }

}