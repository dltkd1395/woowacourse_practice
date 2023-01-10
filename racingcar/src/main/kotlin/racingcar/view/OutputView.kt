package racingcar.view

import racingcar.domain.Car
import racingcar.utils.DISTANCE
import racingcar.utils.OUTPUT_RESULT
import racingcar.utils.WINNER

object OutputView {
    fun printResult() {
        println(OUTPUT_RESULT)
    }

    fun printMoving(cars: List<Car>) {
        for (car in cars) {
            println("${car.name.value} : ${DISTANCE.repeat(car.position.distance)}")
        }
        println()
    }

    fun printWinners(winners: List<Car>) {
        println("${WINNER} : ${winners.joinToString(separator = ", ") { car -> car.name.value}}")
    }
}