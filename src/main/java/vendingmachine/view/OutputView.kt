package vendingmachine.view


import vendingmachine.domain.Coins
import vendingmachine.utils.OUTPUT_RETENTION_COIN
import vendingmachine.utils.OUTPUT_RETENTION_COINS

object OutputView {
    fun printRetentionCoin(coins: Coins) {
        println(OUTPUT_RETENTION_COINS)
        coins.values
            .entries
            .map { (coin, count) ->
                println(OUTPUT_RETENTION_COIN.format(coin, count))
            }
    }
}