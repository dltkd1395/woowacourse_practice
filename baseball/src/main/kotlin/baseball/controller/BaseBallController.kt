package baseball.controller

import baseball.domain.*
import baseball.util.ONE
import baseball.util.THREE
import baseball.util.TWO
import baseball.view.OutputView

class BaseBallController {
    private var baseBall = BaseBall()
    private val inputController = InputController()
    private val outputView = OutputView()
    private var command: Command = Command()
    private val judgement = Judgement()

    fun start() {
        outputView.printGameStart()
        while (!command.isGameOver()) {
            baseBall = baseBall.reset()
            play()
            command = Command(inputController.getCommandNumber())
        }
    }

    private fun play() {
        val computerNumbers = BaseBallNumberGenerator().generate()
        while (baseBall.retry()) {
            throwBall(computerNumbers)
        }
        outputView.printResult()
    }

    private fun throwBall(computerNumbers: List<BaseBallNumber>) {
        val playerNumbers = inputController.getBaseBallNumber()
        baseBall = baseBall.play(
            judgement.getStrike(playerNumbers, computerNumbers),
            judgement.getBall(playerNumbers, computerNumbers)
        )
        outputView.printBaseBall(baseBall.strike, baseBall.ball)
    }
}
