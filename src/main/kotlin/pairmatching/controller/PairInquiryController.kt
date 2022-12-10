package pairmatching.controller

import pairmatching.domain.WoowaCourse
import pairmatching.service.WoowaCourseService
import pairmatching.view.OutputView

class PairInquiryController : Controller {
    override fun excute() {
        val woowaCourse = WoowaCourse.from(InputController().getMatching())
        val inquiry = WoowaCourseService().getPairMatch(woowaCourse)
        OutputView.printMatching(inquiry)
    }

}