package bridge.domain

import bridge.utils.ONE
import bridge.utils.ZERO

data class Bridge(
    var up: MutableList<String> = mutableListOf(),
    var down: MutableList<String> = mutableListOf(),
    var size: Int = ZERO
) {
    fun setUpBridge(result: String) {
        up.add(result)
    }

    fun setDownBridge(result: String) {
        down.add(result)
    }

    fun setBridgeSize() {
        size += ONE
    }

    fun resetBridge() {
        size = ZERO
        up = mutableListOf()
        down = mutableListOf()
    }
}