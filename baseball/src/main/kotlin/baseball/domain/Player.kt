package baseball.domain

import baseball.util.*

class Player(val baseBallNumbers: List<BaseBallNumber>) {

    companion object {
        fun from(playerNumbers: List<String>): Player {
            return Player(playerNumbers.map { BaseBallNumber(it) })
        }
    }

    init {
        require(isNumberSize()) { ErrorType.BASEBALL_NUMBER_SIZE.errorMessage }
        require(isNumberDuplication()) { ErrorType.BASEBALL_NUMBER_DUPLICATION.errorMessage }
    }

    private fun isNumberSize(): Boolean =
        baseBallNumbers.size == THREE

    private fun isNumberDuplication(): Boolean =
        baseBallNumbers.size == baseBallNumbers.distinct().size

}