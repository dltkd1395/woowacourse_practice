package pairmatching.controller

import pairmatching.domain.Matching
import pairmatching.domain.WoowaCourse
import pairmatching.service.PairMatchingService
import pairmatching.service.WoowaCourseService
import pairmatching.view.OutputView

class PairMatchingController: Controller {
    private val woowaCourseService = WoowaCourseService()

    override fun excute() {
        val woowaCourse = WoowaCourse.from(InputController().getMatching())
        if (isExists(woowaCourse)) {
            return
        }
        match(woowaCourse)
    }

    private fun match(woowaCourse: WoowaCourse) {
        val pairMatching = Matching(PairMatchingService().match(woowaCourse))
        woowaCourseService.addMatching(woowaCourse, pairMatching)
        OutputView.printMatching(pairMatching)
    }

    private fun isExists(woowaCourse: WoowaCourse): Boolean =
        woowaCourseService.isDuplication(woowaCourse)
}