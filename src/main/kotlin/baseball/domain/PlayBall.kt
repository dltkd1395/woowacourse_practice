package baseball.domain

interface PlayBall {
    fun getStrike(playerNumbers: List<BaseBallNumber>, computerNumbers: List<BaseBallNumber>): Int
    fun getBall(playerNumbers: List<BaseBallNumber>, computerNumbers: List<BaseBallNumber>): Int
}