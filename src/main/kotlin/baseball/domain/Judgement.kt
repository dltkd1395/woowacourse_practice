package baseball.domain

class Judgement {
    fun isStrike(player: Int, computer: Int): Boolean =
        player == computer

    fun isBall(player: Int, computer: List<Int>): Boolean =
        computer.contains(player)
}