package lotto.view

import camp.nextstep.edu.missionutils.Console
import lotto.utils.INPUT_BONUS_NUMBER
import lotto.utils.INPUT_LOTTO_AMOUNT
import lotto.utils.INPUT_WINNING_NUMBER

object InputView {
    fun readLottoAmount(): String {
        println(INPUT_LOTTO_AMOUNT)
        return Console.readLine()
    }

    fun readWinningNumber(): List<String> {
        println(INPUT_WINNING_NUMBER)
        return Console.readLine().split(",")
    }

    fun readBonusNumber(): String {
        println(INPUT_BONUS_NUMBER)
        return Console.readLine()
    }
}