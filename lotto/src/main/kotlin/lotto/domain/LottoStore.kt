package lotto.domain

import lotto.utils.THOUSAND

class LottoStore {
    fun buy(money: Money): List<Lotto> =
        LottoGenerator().create(money.value / THOUSAND)
}