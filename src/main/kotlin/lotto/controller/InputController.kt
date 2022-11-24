package lotto.controller

import lotto.domain.Bonus
import lotto.domain.Lotto
import lotto.domain.Money
import lotto.utils.validations.Validator
import lotto.view.InputView
import net.bytebuddy.asm.Advice.OffsetMapping.Factory.Illegal

class InputController {
    private val inputView = InputView()

    fun getInputAmount(): Int {
        try {
            val amount = inputView.readLottoAmount().toInt()
            Money(amount)
            return amount
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getInputAmount()
        }
    }

    fun getInputWinningNumbers(): List<Int> {
        try {
            val winningNumbers = splitNumbers(inputView.readWinningNumber())
            Lotto(winningNumbers)
            return winningNumbers
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getInputWinningNumbers()
        }
    }

    fun getInputBonusNumber(lottoNumbers: List<Int>): Int {
        try {
            val number = inputView.readBonusNumber().toInt()
            Bonus(lottoNumbers, number)
            return number
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getInputBonusNumber(lottoNumbers)
        }
    }

    private fun splitNumbers(winningNumbers: String): List<Int> =
        winningNumbers
            .split(",")
            .map { number ->
                number.toInt()
            }


}