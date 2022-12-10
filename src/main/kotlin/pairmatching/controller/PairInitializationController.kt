package pairmatching.controller

import pairmatching.service.WoowaCourseService
import pairmatching.view.OutputView

class PairInitializationController : Controller {
    override fun excute() {
        WoowaCourseService().clearAll()
        OutputView.printInitialization()
    }
}