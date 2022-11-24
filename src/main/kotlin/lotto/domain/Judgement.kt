package lotto.domain

class Judgement(
    private val lottoNumber: Int,
    private val winningNumber: Int
) {
    fun isLottoMatching(): Boolean =
        lottoNumber == winningNumber
}