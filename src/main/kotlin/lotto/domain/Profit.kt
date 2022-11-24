package lotto.domain

import lotto.utils.HUNDRED

class Profit(private val totalPrize: Int, private val money: Int) {
    fun calculate(): String {
        val result = (totalPrize.toFloat() / money * HUNDRED)
        return "%,.1f".format(result)
    }
}