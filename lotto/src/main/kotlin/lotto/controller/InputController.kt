package lotto.controller

import lotto.domain.*
import lotto.view.InputView

class InputController {
    fun getMoneyAmount(): Money {
        try {
            val money = Money(InputView.readLottoAmount())
            return money
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getMoneyAmount()
        }
    }

    fun getWinningLotto(): Lotto {
        try {
            val winningLotto = Lotto(InputView.readWinningNumber().map { LottoNumber(it) })
            return winningLotto
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getWinningLotto()
        }
    }

    fun getBounusNumber(): LottoNumber {
        try {
            val bonus = LottoNumber(InputView.readBonusNumber())
            return bonus
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getBounusNumber()
        }
    }
}