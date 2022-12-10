package pairmatching.controller

import pairmatching.domain.WoowaCourse
import pairmatching.service.WoowaCourseService
import pairmatching.view.OutputView

class PairInquiryController : Controller {
    override fun excute() {
        try {
            val woowaCourse = WoowaCourse.from(InputController().getMatching())
            val inquiry = WoowaCourseService().getPairMatch(woowaCourse)
            OutputView.printMatching(inquiry)
        } catch (e: IllegalArgumentException) {
            println(e.message)
            excute()
        }
    }
}