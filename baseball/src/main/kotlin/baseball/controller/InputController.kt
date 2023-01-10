package baseball.controller

import baseball.domain.BaseBallNumber
import baseball.domain.Command
import baseball.domain.Player
import baseball.view.InputView

class InputController {
    fun getBaseBallNumber(): List<BaseBallNumber> {
        val number = Player.from(InputView().readBaseBallNumber()).baseBallNumbers
        return number
    }

    fun getCommandNumber(): Int {
        val number = Command(InputView().readGameCommand()).number
        return number
    }
}