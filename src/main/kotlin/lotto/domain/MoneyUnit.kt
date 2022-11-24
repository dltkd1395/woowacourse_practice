package lotto.domain

class MoneyUnit(private val money: Int) {
    fun divideUnit(): String {
        val result =  "%,2d".format(money)
        return result
    }
}