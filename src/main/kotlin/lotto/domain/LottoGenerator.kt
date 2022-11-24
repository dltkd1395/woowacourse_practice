package lotto.domain

import camp.nextstep.edu.missionutils.Randoms
import lotto.utils.LOTTO_MAX_NUMBER
import lotto.utils.LOTTO_MIN_NUMBER
import lotto.utils.MAX_LENGTH

class LottoGenerator(private val count: Int) {
    fun generate(): List<List<Int>> {
        val lottos = mutableListOf<List<Int>>()
        while (lottos.size < count) {
            val randomNumbers = Randoms.pickUniqueNumbersInRange(LOTTO_MIN_NUMBER, LOTTO_MAX_NUMBER, MAX_LENGTH)
            lottos.add(randomNumbers)
        }
        return lottos
    }

}