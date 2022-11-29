package baseball.view

import baseball.util.ONE
import camp.nextstep.edu.missionutils.Console

class InputView {
    fun readBaseBallNumber(): List<String> {
        print("숫자를 입력해주세요 : ")
        val numbers = Console.readLine().split("")
        return numbers.subList(ONE, numbers.size - 1)
    }

    fun readGameCommand(): String {
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        return Console.readLine()
    }
}