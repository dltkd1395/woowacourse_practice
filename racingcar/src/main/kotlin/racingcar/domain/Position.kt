package racingcar.domain

import racingcar.utils.ONE
import racingcar.utils.ZERO

data class Position(val distance: Int = ZERO): Comparable<Position> {

    fun increase(movement: Movement): Position {
        if (movement.isMovable()) {
            return Position(distance + ONE)
        }
        return Position(distance)
    }

    override fun compareTo(other: Position): Int {
        return this.distance.compareTo(other.distance)
    }
}