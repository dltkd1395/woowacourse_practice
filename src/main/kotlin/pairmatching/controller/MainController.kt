package pairmatching.controller

import pairmatching.domain.Feature
import pairmatching.utils.PAIR_INITIALIZATION_COMMAND
import pairmatching.utils.PAIR_INQUIY_COMMAND
import pairmatching.utils.PAIR_MATCHING_COMMAND
import pairmatching.utils.QUIT_COMMAND

class MainController {
    fun run() {
        while (true) {
            val feature = InputController().getFeature()
            if (feature.command.equals(QUIT_COMMAND)) {
                return
            }
            selectFeature(feature)
            println()
        }
    }

    private fun selectFeature(feature: Feature) {
        when (feature.command) {
            PAIR_MATCHING_COMMAND -> PairMatchingController().excute()
            PAIR_INQUIY_COMMAND -> PairInquiryController().excute()
            PAIR_INITIALIZATION_COMMAND -> PairInitializationController().excute()
        }
    }
}