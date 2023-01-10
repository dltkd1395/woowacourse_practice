package pairmatching.view

import pairmatching.domain.Matching
import pairmatching.utils.OUTPUT_INITIALIZAION
import pairmatching.utils.OUTPUT_MATCHING_RESULT

object OutputView {
    fun printMatching(pairMatching: Matching) {
        println(OUTPUT_MATCHING_RESULT)
        println(pairMatching.toString())
    }

    fun printInitialization() {
        println(OUTPUT_INITIALIZAION)
    }
}