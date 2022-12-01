package lotto.domain

import lotto.utils.TEN

data class LottoResult(
    val lottoPrize: List<Prize>,
    val profitRate: String
) {
    companion object {
        fun of(lottos: List<Lotto>, winningLotto: WinningLotto): LottoResult {
            val prize = lottos.map { lotto -> lotto.matchs(winningLotto) }
                .map { result -> Prize.of(result) }
            val rate = String.format(
                "%,.1f",
                prize.sumOf { it.amount }.toFloat() / (lottos.size * TEN)
            )
            return LottoResult(prize, rate)
        }
    }
}