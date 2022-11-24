package lotto.controller

import lotto.domain.*
import lotto.view.OutputView

class LottoGameController {
    private val inputController = InputController()
    private val outputView = OutputView()
    private val prizeResult = PrizeResult()
    private val lottoResult = LottoResult()

    fun start() {
        val money = inputController.getInputAmount()
        println()
        val lottos = LottoGenerator(money).generate()
        play(lottos, money)
    }

    private fun play(lottos: List<List<Int>>, money: Int) {
        outputView.printLottos(lottos)
        val winningNumbers = inputController.getInputWinningNumbers()
        val bonusNumber = inputController.getInputBonusNumber(winningNumbers)
        compareLottoNumbers(lottos, winningNumbers, bonusNumber)
        outputView.printTotalStatistics(prizeResult)
        outputView.printProfitResult(prizeResult, money)
    }

    private fun compareLottoNumbers(
        lottos: List<List<Int>>,
        winningNumbers: List<Int>,
        bonusNumber: Int
    ) {
        lottos.forEach { lotto ->
            lotto.map { number ->
                judgeLottoNumber(number, winningNumbers, bonusNumber)
            }
            setResult()
        }
    }

    private fun judgeLottoNumber(lottoNumber: Int, winningNumbers: List<Int>, bonusNumber: Int) {
        if (Judgement(lottoNumber, winningNumbers).isLottoMatching()) {
            lottoResult.matchedCount++
            lottoResult.isBonusMatching = lottoNumber == bonusNumber
        }
    }

    private fun setResult() {
        prizeResult.setCount(lottoResult.matchedCount, lottoResult.isBonusMatching)
        prizeResult.amount += Prize.of(
            lottoResult.matchedCount,
            lottoResult.isBonusMatching
        ).amount
        lottoResult.resetLottoResult()
    }
}