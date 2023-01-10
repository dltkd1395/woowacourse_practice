package racingcar.domain

import racingcar.utils.ZERO

data class Car(val name: Name, val position: Position = Position()) {

    constructor(name: String, position: Int = ZERO) : this(Name(name), Position(position))

    fun moveForwod(movement: Movement): Car {
        return Car(name, position.increase(movement))
    }

    fun isSamePosition(position: Position): Boolean =
        this.position == position
}