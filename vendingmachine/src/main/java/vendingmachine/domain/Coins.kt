package vendingmachine.domain

import vendingmachine.utils.MIN_COIN
import vendingmachine.utils.ONE
import vendingmachine.utils.ZERO

data class Coins(var values: MutableMap<Int, Int> = Coin.toMutableMap()) {

    private lateinit var amount: Amount

    fun makeRandomCoins(numberGenerator: NumberGenerator, amount: Amount): Coins {
        this.amount = amount
        while (this.amount.isUseAmount(MIN_COIN)) {
            val coin = numberGenerator.generate(coinAmounts)
            removeCoinAmounts(coin)
            useCoinAmount(coin)
        }
        return Coins(values)
    }

    fun makeChange(amount: Amount): Coins {
        this.amount = amount
        val coins = values.filter { coin -> coin.value > ZERO }
        val initCoins = initCoins(coins)
        for (coin in coins.keys) {
            initCoins[coin] = exchange(coin)
        }
        return Coins(initCoins.filter { coin -> coin.value > ZERO }.toMutableMap())
    }

    private fun exchange(coin: Int): Int {
        val count = this.amount.value.div(coin)
        val coinNumber = values.get(coin) ?: ZERO
        if (coinNumber <= count) {
            this.amount = this.amount.useAmount(coin * coinNumber)
            return values.get(coin) ?: ZERO
        }
        this.amount = this.amount.useAmount(coin * count)
        return count
    }

    private fun initCoins(coins: Map<Int, Int>): MutableMap<Int, Int> =
        coins.keys.associate { coin -> coin to ZERO }.toMutableMap()


    private fun removeCoinAmounts(coin: Int) {
        if (!this.amount.isUseAmount(coin)) {
            coinAmounts.remove(coin)
        }
    }

    private fun useCoinAmount(coin: Int) {
        if (this.amount.isUseAmount(coin)) {
            this.amount = this.amount.useAmount(coin)
            values.computeIfPresent(coin) { _, value -> value + ONE }
        }
    }

    companion object {
        private val coinAmounts = Coin.toList().toMutableList()
    }
}