package vendingmachine.domain

import vendingmachine.utils.MIN_COIN
import vendingmachine.utils.ZERO

data class Coins(
    var values: MutableMap<Int, Int> = Coin.toList().associate { coin -> coin to ZERO }
        .toMutableMap()
) {

    fun makeRandomCoins(numberGenerator: NumberGenerator, retentionAmount: RetentionAmount): Coins {
        while (retentionAmount.value >= MIN_COIN) {
            val coin = numberGenerator.generate(coinAmounts)
            removeCoinAmounts(retentionAmount, coin)
            useCoinAmount(retentionAmount, coin)
        }
        return Coins(values)
    }

    private fun removeCoinAmounts(retentionAmount: RetentionAmount, coin: Int) {
        if (!isUseAmount(retentionAmount, coin)) {
            coinAmounts.remove(coin)
        }
    }

    private fun useCoinAmount(retentionAmount: RetentionAmount, coin: Int) {
        if (isUseAmount(retentionAmount, coin)) {
            retentionAmount.minus(coin)
            values.computeIfPresent(coin) { _, value -> value + 1 }
        }
    }

    private fun isUseAmount(retentionAmount: RetentionAmount, coin: Int): Boolean {
        if (retentionAmount.value - coin >= ZERO) {
            return true
        }
        return false
    }

    companion object {
        private val coinAmounts = Coin.toList().toMutableList()
    }
}