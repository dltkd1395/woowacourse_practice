package bridge.view

import bridge.utils.INPUT_BRIDGE_MOVEMENT
import bridge.utils.INPUT_BRIDGE_RETRY
import bridge.utils.INPUT_BRIDGE_SIZE
import camp.nextstep.edu.missionutils.Console

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
object InputView {
    /**
     * 다리의 길이를 입력받는다.
     */
    fun readBridgeSize(): String {
        println(INPUT_BRIDGE_SIZE)
        return Console.readLine()
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    fun readMoving(): String {
        println(INPUT_BRIDGE_MOVEMENT)
        return Console.readLine()
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    fun readGameCommand(): String {
        println(INPUT_BRIDGE_RETRY)
        return Console.readLine()
    }
}
