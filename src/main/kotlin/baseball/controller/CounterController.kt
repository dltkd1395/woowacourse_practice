package baseball.controller

import baseball.domain.BaseBall
import baseball.domain.Judgement

class CounterController {
    fun getResult(player: List<Int>, computer: List<Int>): BaseBall {
        val combination = player.zip(computer)
        combination.forEach { (playerNumber, computerNumber) ->
            countBaseBall(playerNumber, computerNumber, computer)
        }
        return baseBall
    }

    private fun countBaseBall(playerNumber: Int, computerNumber: Int, computer: List<Int>) {
        if (jugement.isStrike(playerNumber, computerNumber)) {
            baseBall.strike++
            return
        }
        if (jugement.isBall(playerNumber, computer)) {
            baseBall.ball++
        }
    }

    companion object {
        private val jugement = Judgement()
        private val baseBall = BaseBall()
    }
}