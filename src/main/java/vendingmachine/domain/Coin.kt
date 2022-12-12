package vendingmachine.domain

import vendingmachine.utils.ZERO

enum class Coin(private val amount: Int) {
    COIN_500(500),
    COIN_100(100),
    COIN_50(50),
    COIN_10(10);

    companion object {
        fun of(amount: Int): Coin = values()
            .filter { coin -> coin.amount == amount }
            .first()

        fun toList(): List<Int> =
            values().map(Coin::amount).toList()
    }
}