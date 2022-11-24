package lotto.domain

import lotto.utils.ZERO

data class LottoResult(
    var matchedCount: Int = ZERO,
    var isBonusMatching: Boolean = false
) {
    fun resetLottoResult() {
        matchedCount = ZERO
        isBonusMatching = false
    }
}
