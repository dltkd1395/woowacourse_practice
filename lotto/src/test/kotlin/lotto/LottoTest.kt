package lotto

import lotto.domain.Lotto
import lotto.domain.LottoNumber
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows


class LottoTest {
    @Test
    fun `로또 번호의 개수가 6개가 넘어가면 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            val lottoNumber = listOf(1, 2, 3, 4, 5, 6, 7).map { LottoNumber(it) }
            Lotto(lottoNumber)
        }
    }

    // TODO: 이 테스트가 통과할 수 있게 구현 코드 작성
    @Test
    fun `로또 번호에 중복된 숫자가 있으면 예외가 발생한다`() {
        val lottoNumber = listOf(1, 2, 3, 4, 5, 6, 7).map { LottoNumber(it) }
        assertThrows<IllegalArgumentException> {
            Lotto(lottoNumber)
        }
    }

    @Test
    fun `로또 번호의 숫자가 1부터 45까지의 숫자가 아닌 경우 예외가 발생한다`() {
        val lottoNumber = listOf(1, 2, 3, 4, 5, 6, 7).map { LottoNumber(it) }
        assertThrows<IllegalArgumentException> {
            Lotto(lottoNumber)
        }
    }
}
