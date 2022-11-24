package lotto.domain

import lotto.utils.ZERO

data class LottoResult(
    var matchedCount: Int = ZERO,
    var isBonusMatching: Boolean = false
)
