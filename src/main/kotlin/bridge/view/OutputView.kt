package bridge.view

import bridge.domain.Bridge
import bridge.domain.Player
import bridge.uilts.*

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
class OutputView {

    fun printGameStart() {
        println(OUTPUT_GAME_START)
        println()
    }

    fun printGameSuccess(player: Player) {
        when (player.isSuccess) {
            true -> println(OUTPUT_GAME_SUCCESS + GAME_SUCCESS)
            false -> println(OUTPUT_GAME_SUCCESS + GAME_FAILURE)
        }
    }

    fun printGameRetry(player: Player) {
        println(OUTPUT_GAME_RETRY + "${player.retryCount}")
    }

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     *
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */

    fun printMap(bridge: Bridge) {
        println("[${bridge.up}]")
        println("[${bridge.down}]")
        println()
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     *
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    fun printResult(bridge: Bridge, player: Player) {
        println(OUTPUT_GAME_RESULT)
        printMap(bridge)
        printGameSuccess(player)
        printGameRetry(player)
    }
}
