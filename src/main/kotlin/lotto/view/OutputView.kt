package lotto.view

import lotto.domain.*
import lotto.utils.*

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
        println(OUTPUT_PROFIT_RESULT.format(profit) + OUTPUT_PROFIT)
    }

    private fun printMatchingStatistics(prizeResult: PrizeResult) {
        val prizeValue =
            Prize.values().filter { prize -> prize != Prize.NO_WINNING_AMOUNT }.reversed()
        prizeValue.forEach { prize ->
            printStatisticsResult(prize, prizeResult)
        }
    }

    private fun printStatisticsResult(prize: Prize, prizeResult: PrizeResult) {
        val unit = MoneyUnit(prize.amount).divideUnit()
        val count = prizeResult.getCount(prize.matchedCount, prize.isBonusMathing)
        print(OUTPUT_MATCHING_RESULT.format(prize.matchedCount))
        if (prize.matchedCount == FIVE && prize.isBonusMathing) {
            print(OUTPUT_MATCHING_BONUS)
        }
        println(OUTPUT_MONEY_COUNT.format(unit, count))
    }
}