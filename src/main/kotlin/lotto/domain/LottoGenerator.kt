package lotto.domain

import camp.nextstep.edu.missionutils.Randoms
import lotto.utils.LOTTO_MAX_NUMBER
import lotto.utils.LOTTO_MIN_NUMBER
import lotto.utils.MAX_LENGTH
import lotto.utils.THOUSAND

class LottoGenerator {

    fun create(count: Int): List<Lotto> =
        List(count) {
            generate()
        }

    fun generate(): Lotto =
        Lotto(
            Randoms.pickUniqueNumbersInRange(LOTTO_MIN_NUMBER, LOTTO_MAX_NUMBER, MAX_LENGTH)
                .sorted()
                .map { number -> LottoNumber(number) }
        )
}
