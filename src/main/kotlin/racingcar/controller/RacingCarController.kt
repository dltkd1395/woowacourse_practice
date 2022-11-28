package racingcar.controller

import racingcar.domain.Cars
import racingcar.domain.TryNumber
import racingcar.view.InputView
import racingcar.view.OutputView

class RacingCarController {
    private var carNames = Cars.from(InputView.readCarNames())
    private val tryNumber = TryNumber(InputView.readTryNumber())

    fun run() {
        OutputView.printResult()
        while (!tryNumber.isGameOver()) {
            play()
        }
        OutputView.printWinners(carNames.findWinners())
    }

    private fun play() {
        carNames = carNames.move()
        tryNumber.decrease()
        OutputView.printMoving(carNames.cars)
    }
}