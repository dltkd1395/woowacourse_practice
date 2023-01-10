package subway.domain

import subway.utils.ErrorType
import subway.utils.STATIONS

data class Station(private val name: String) {

    init {
        require(isBlank()) { ErrorType.BLANK_STATION.errorMessage }
    }

    override fun toString(): String =
        this.name

    fun isSameStation(otherStation: Station) {
        if (name == otherStation.toString()) {
            throw IllegalArgumentException(ErrorType.SAME_STATION.errorMessage)
        }
    }

    private fun isBlank(): Boolean =
        !name.isBlank()
}