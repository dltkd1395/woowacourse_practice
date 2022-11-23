package baseball.view

import camp.nextstep.edu.missionutils.Console

class InputView {
    fun readBaseBallNumber(): String {
        println("숫자 야구 게임을 시작합니다.")
        println("숫자를 입력해주세요 : ")
        return Console.readLine()
    }
}