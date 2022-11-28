package racingcar.domain

import racingcar.utils.ErrorType

class Cars(val cars: List<Car>, private val movement: Movement = Judgement()) {
    companion object {
        fun from(carNames: List<String>): Cars {
            return Cars(carNames.map { Car(it) })
        }
    }

    init {
        require(isDuplication()) { ErrorType.NAME_DUPLICATION.errorMessage }
    }

    fun move(): Cars =
        Cars(cars.map { car ->
            car.moveForwod(movement)
        })

    private fun isDuplication(): Boolean =
        cars.size == cars.distinct().size
}