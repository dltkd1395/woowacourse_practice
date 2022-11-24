package lotto.view

import lotto.domain.*
import lotto.utils.OUTPUT_LOTTO_COUNT
import lotto.utils.OUTPUT_MATCHING_RESULT
import lotto.utils.OUTPUT_PROFIT_RESULT
import lotto.utils.OUTPUT_STATISTICS

class OutputView {

    fun printLottos(lottos: List<List<Int>>) {
        println("${lottos.size}" + OUTPUT_LOTTO_COUNT)
        lottos.forEach { lotto ->
            println(lotto)
        }
    }

    fun printTotalStatistics(prizeResult: PrizeResult) {
        println(OUTPUT_STATISTICS)
        printMatchingStatistics(prizeResult)
    }

    fun printProfitResult(prizeResult: PrizeResult, money: Int) {
        val profit = Profit(prizeResult.amount, money).calculate()
        println(OUTPUT_PROFIT_RESULT.format())
    }

    private fun printMatchingStatistics(prizeResult: PrizeResult) {
        val prizeValue = Prize.values()
        prizeValue.forEach { prize ->
            printStatisticsResult(prize, prizeResult)
        }
    }

    private fun printStatisticsResult(prize: Prize, prizeResult: PrizeResult) {
        println(
            OUTPUT_MATCHING_RESULT.format(
                prize.matchedCount,
                MoneyUnit(prize.amount).divideUnit(),
                prizeResult.fifthPrizeCount
            )
        )
    }
}