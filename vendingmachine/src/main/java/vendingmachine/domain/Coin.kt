package vendingmachine.domain

import vendingmachine.utils.ZERO

enum class Coin(private val amount: Int) {
    COIN_500(500),
    COIN_100(100),
    COIN_50(50),
    COIN_10(10);

    companion object {
        fun toList(): List<Int> =
            values().map(Coin::amount).toList()

        fun toMutableMap(): MutableMap<Int, Int> =
            values().associate { coin -> coin.amount to ZERO }.toMutableMap()
    }
}