package pairmatching.view

import camp.nextstep.edu.missionutils.Console
import pairmatching.utils.INPUT_FEATURE_SELECTION

object InputView {
    fun readFeature(): String {
        println(INPUT_FEATURE_SELECTION)
        return Console.readLine()
    }

}