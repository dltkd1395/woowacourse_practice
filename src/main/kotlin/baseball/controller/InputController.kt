package baseball.controller

import baseball.domain.Player
import baseball.view.InputView

class InputController {
    fun getBaseBallNumber(): Int {
        try {
            val number = InputView().readBaseBallNumber()
            Player(number)
            return number.toInt()
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getBaseBallNumber()
        }
    }
}