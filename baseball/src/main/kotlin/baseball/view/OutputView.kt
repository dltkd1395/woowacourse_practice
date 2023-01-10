package baseball.view

import baseball.util.BALL
import baseball.util.NOTHING
import baseball.util.STRIKE
import baseball.util.ZERO

class OutputView {
    fun printGameStart() {
        println("숫자 야구 게임을 시작합니다.")
    }

    fun printBaseBall(strike: Int, ball: Int) {
        when {
            strike == ZERO && ball == ZERO -> println(NOTHING)
            strike == ZERO && ball > ZERO  -> println("${ball}${BALL}")
            strike > ZERO && ball == ZERO -> println("${strike}${STRIKE}")
            else -> println("${ball}${BALL} ${strike}${STRIKE}")
        }
    }

    fun printResult() {
        println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
    }
}