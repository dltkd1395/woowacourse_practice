package baseball.controller

import baseball.domain.BaseBall
import baseball.domain.BaseBallNumberGenerator
import baseball.domain.Judgement
import baseball.util.ONE
import baseball.util.THREE
import baseball.util.TWO
import baseball.view.OutputView

class BaseBallController {
    fun start() {
        outputView.printGameStart()
        while (baseBall.isRetry) {
            val computerNumber = BaseBallNumberGenerator().generate()
            play(computerNumber)
            val command = inputController.getCommandNumber()
            isQuit(command)
        }
    }

    private fun play(computerNumber: List<Int>) {
        while (baseBall.strike != THREE) {
            baseBall.resetBaseBall()
            val playerNumber =
                inputController.getBaseBallNumber().toString().toList().map { it.digitToInt() }
            countBaseBall(playerNumber, computerNumber)
            outputView.printBaseBall(baseBall.strike, baseBall.ball)
        }
        outputView.printResult()
    }

    private fun countBaseBall(playerNumber: List<Int>, computerNumber: List<Int>) {
        baseBall = counterController.getResult(playerNumber, computerNumber)
    }

    private fun isQuit(command: Int) {
        when (command) {
            ONE -> retry()
            TWO -> quit()
        }
    }

    private fun retry() {
        baseBall.resetBaseBall()
    }

    private fun quit() {
        baseBall.setQuit()
    }

    companion object {
        private var baseBall = BaseBall()
        private val inputController = InputController()
        private val outputView = OutputView()
        private val counterController = CounterController()
    }
}
