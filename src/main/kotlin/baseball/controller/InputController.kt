package baseball.controller

import baseball.domain.Command
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

    fun getCommandNumber(): Int {
        try {
            val number = InputView().readGameCommand()
            Command(number)
            return number.toInt()
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getCommandNumber()
        }
    }
}