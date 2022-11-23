package baseball.domain

import baseball.util.ZERO

data class BaseBall(
    var strike: Int = ZERO,
    var ball: Int = ZERO,
    var isRetry: Boolean = true
) {
    fun setQuit() {
        isRetry = false
    }

    fun resetBaseBall() {
        strike = ZERO
        ball = ZERO
    }
}
