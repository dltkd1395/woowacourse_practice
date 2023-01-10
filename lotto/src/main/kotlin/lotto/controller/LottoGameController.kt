package lotto.controller

import lotto.domain.*
import lotto.view.OutputView

class LottoGameController {

    private val inputController = InputController()

    fun run() {
        val money = inputController.getMoneyAmount()
        val lottos = LottoStore().buy(money)
        OutputView.printLottos(lottos)
        play(lottos)
    }

    private fun play(lottos: List<Lotto>) {
        val winningNumbers = inputController.getWinningLotto()
        val bonus = inputController.getBounusNumber()
        val winningLotto = WinningLotto(winningNumbers, bonus)
        val lottoResult = LottoResult.of(lottos, winningLotto)
        OutputView.printStatistics(lottoResult)
    }
}