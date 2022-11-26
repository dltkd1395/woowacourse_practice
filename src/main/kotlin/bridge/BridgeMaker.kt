package bridge

import bridge.uilts.DOWN
import bridge.uilts.ONE
import bridge.uilts.UP
import bridge.uilts.ZERO

/**
 * 다리의 길이를 입력 받아서 다리를 생성해주는 역할을 한다.
 */
class BridgeMaker(private val bridgeNumberGenerator: BridgeNumberGenerator) {
    /**
     * @param size 다리의 길이
     * @return 입력받은 길이에 해당하는 다리 모양. 위 칸이면 "U", 아래 칸이면 "D"로 표현해야 한다.
     */
    fun makeBridge(size: Int): List<String> {
        val bridge = mutableListOf<String>()
        while (bridge.size < size) {
            val direction = getDirection(bridgeNumberGenerator.generate())
            bridge.add(direction)
        }
        return bridge
    }

    private fun getDirection(value: Int): String {
        if (value == ZERO) {
            return DOWN
        }
        return UP
    }
}
