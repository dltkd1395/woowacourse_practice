package lotto.domain

import lotto.utils.ErrorType

data class Lotto(private val numbers: List<LottoNumber>) {

    init {
        require(numbers.size == 6) { ErrorType.LOTTO_SIZE.errorMessage }
        require(isDuplication()) { ErrorType.LOTTO_DUPLICATION.errorMessage }
    }

    fun isMatchingBonus(bonus: LottoNumber): Boolean =
        !numbers.contains(bonus)

    fun matchs(winningLotto: WinningLotto): MatchResult =
        MatchResult(
            numbers.count { number ->
                winningLotto.lotto.match(number)
            },
            isMatchingBonus(winningLotto.bonus)
        )

    fun toList() = numbers.toList()

    private fun match(lotto: LottoNumber): Boolean =
        numbers.contains(lotto)

    private fun isDuplication(): Boolean =
        numbers.size == numbers.distinct().size
}
