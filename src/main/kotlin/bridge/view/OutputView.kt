package bridge.view

import bridge.domain.Bridge
import bridge.domain.Player

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
object OutputView {
    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     *
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */

    fun printGameStart() {
        println("다리 건너기 게임을 시작합니다.\n")
    }

    fun printMap(bridge: Bridge) {
        println("[ ${bridge.up.joinToString(" | ")} ]")
        println("[ ${bridge.down.joinToString(" | ")} ]")
        println()
    }
    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     *
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    fun printResult(player: Player, bridge: Bridge, gameResult: String) {
        println("최종 게임 결과")
        printMap(bridge)
        println("게임 성공 여부: ${gameResult}")
        println("총 시도한 횟수: ${player.retryCount}")
    }
}