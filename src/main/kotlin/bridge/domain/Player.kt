package bridge.domain

import bridge.uilts.ONE

data class Player(
    var isRetry: Boolean = true,
    var retryCount: Int = ONE,
    var isSuccess: Boolean = true
) {
    fun setGameState() {
        isSuccess = false
    }

    fun setQuit() {
        isRetry = false
    }

    fun countRetry() {
        retryCount += ONE
    }
}
