package racingcar.domain

import racingcar.utils.ZERO

data class Car(private val name: Name, private val position: Position = Position()) {

    constructor(name: String, position: Int = ZERO) : this(Name(name), Position(position))

    fun move(movement: Movement): Car {
        return Car(name, position.increase(movement))
    }

    fun isSamePosition(position: Position): Boolean =
        this.position == position
}