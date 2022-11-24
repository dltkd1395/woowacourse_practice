package lotto.domain

class Judgement(
    private val lottoNumber: Int,
    private val winningNumber: List<Int>
) {
    fun isLottoMatching(): Boolean =
        winningNumber.contains(lottoNumber)
}