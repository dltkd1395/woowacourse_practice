package racingcar.view

import racingcar.utils.INPUT_CAR_NAMES
import racingcar.utils.INPUT_TRY_NUMBER


object InputView {
    fun readCarNames(): List<String> {
        println(INPUT_CAR_NAMES)
        return readln().split(",")
    }

    fun readTryNumber(): String {
        println(INPUT_TRY_NUMBER)
        return readln()
    }
}