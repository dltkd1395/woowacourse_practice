package bridge.domain

import bridge.uilts.EMPTY
import bridge.uilts.ZERO

data class Bridge(
    var up: String = EMPTY,
    var down: String = EMPTY,
    var size: Int = ZERO
) {
    fun resetBridge() {
        up = EMPTY
        down = EMPTY
        size = ZERO
    }
}
