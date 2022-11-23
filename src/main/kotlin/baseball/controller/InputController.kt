package baseball.controller

import baseball.domain.Command
import baseball.domain.Player
import baseball.view.InputView

class InputController {
    fun getBaseBallNumber(): Int {
        val number = InputView().readBaseBallNumber()
        Player(number)
        return number.toInt()
    }

    fun getCommandNumber(): Int {
        val number = InputView().readGameCommand()
        Command(number)
        return number.toInt()
    }
}