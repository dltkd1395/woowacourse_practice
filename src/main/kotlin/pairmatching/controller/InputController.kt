package pairmatching.controller

import pairmatching.domain.Feature
import pairmatching.domain.Matching
import pairmatching.domain.MatchingMenu
import pairmatching.domain.ReMatching
import pairmatching.view.InputView
import java.awt.event.ItemListener

class InputController {
    fun getFeature(): Feature {
        try {
            val feature = Feature.of(InputView.readFeature())
            return feature
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getFeature()
        }
    }

    fun getMatching(): MatchingMenu {
        try {
            val matching = MatchingMenu(InputView.readMatching())
            return matching
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getMatching()
        }
    }

    fun getReMatching(): ReMatching {
        try {
            val rematching = ReMatching(InputView.readReMatching())
            return rematching
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getReMatching()
        }
    }
}