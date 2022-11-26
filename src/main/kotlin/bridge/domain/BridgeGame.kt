package bridge.domain

import bridge.uilts.DOWN
import bridge.uilts.NOT_CROSS
import bridge.uilts.UP
import bridge.uilts.ZERO

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
class BridgeGame {
    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     *
     *
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    fun move(direction: String, result: String, bridge: Bridge) {
        setBridgeResult(direction, result, bridge)
        bridge.size++
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     *
     *
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    fun retry(player: Player, bridge: Bridge) {
        player.retryCount++
        bridge.resetBridge()
    }

    fun quit(player: Player) {
        player.setQuit()
    }

    private fun setBridgeResult(playerDirection: String, result: String, bridge: Bridge) {
        when (playerDirection) {
            UP -> setUpBridge(result, bridge)
            DOWN -> setDownBridge(result, bridge)
        }
    }

    private fun setUpBridge(result: String, bridge: Bridge) {
        bridge.up += setBridge(result, bridge)
        bridge.down += setBridge(NOT_CROSS, bridge)
    }

    private fun setDownBridge(result: String, bridge: Bridge) {
        bridge.down += setBridge(result, bridge)
        bridge.up += setBridge(NOT_CROSS, bridge)
    }

    private fun setBridge(result: String, bridge: Bridge): String {
        if (bridge.size == ZERO) {
            return " ${result} "
        }
        return "| ${result} "
    }
}
