package lotto.view

import lotto.domain.*
import lotto.utils.*

object OutputView {

    fun printLottos(lottos: List<Lotto>) {
        println("${lottos.size}" + OUTPUT_LOTTO_COUNT)
        lottos.forEach { lotto ->
            println(lotto.toList().map { number ->
                number.value
            })
        }
    }

    fun printStatistics(lottos: LottoResult) {
        println(OUTPUT_STATISTICS)
        Prize.values().filter { it != Prize.NO_WINNING_AMOUNT }.forEach { prize ->
            print(OUTPUT_MATCHING_RESULT.format(prize.matchedCount))
            print(isPrintMatchingBonus(prize))
            printMatching(lottos, prize)
        }
        println(OUTPUT_PROFIT_RESULT.format(lottos.profitRate) + OUTPUT_PROFIT)
    }

    private fun printMatching(lottos: LottoResult, prize: Prize) {
        val money =  Money(prize.amount).divideUnit()
        val count =  lottos.lottoPrize.count { it.matchedCount == prize.matchedCount
                && it.isMatchingBonus == prize.isMatchingBonus }
        println(OUTPUT_MONEY_COUNT.format(money, count))
    }

    private fun isPrintMatchingBonus(prize: Prize): String {
        if (prize.isMatchingBonus) {
            return OUTPUT_MATCHING_BONUS
        }
        return ""
    }
}