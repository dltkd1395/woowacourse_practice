package lotto.domain

import lotto.utils.ZERO

data class PrizeResult(
    var amount: Int = ZERO,
    var firstPrizeCount: Int = ZERO,
    var secondPrizeCount: Int = ZERO,
    var thirdPrizeCount: Int = ZERO,
    var fourthPrizeCount: Int = ZERO,
    var fifthPrizeCount: Int = ZERO
)