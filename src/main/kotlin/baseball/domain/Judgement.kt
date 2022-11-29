package baseball.domain

class Judgement : PlayBall {
    override fun getStrike(
        playerNumbers: List<BaseBallNumber>,
        computerNumbers: List<BaseBallNumber>
    ): Int =
        playerNumbers.zip(computerNumbers)
            .filter { (player, computer) ->
                player.value == computer.value
            }.size

    override fun getBall(
        playerNumbers: List<BaseBallNumber>,
        computerNumbers: List<BaseBallNumber>
    ): Int =
        playerNumbers.zip(computerNumbers)
            .filter { (player, computer) ->
                player.value != computer.value && computerNumbers.contains(player)
            }.size
}