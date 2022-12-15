package subway.domain

import subway.utils.ErrorType
import subway.utils.STATIONS

class Station(private val name: String) {

    init {
        require(isBlank()) { ErrorType.BLANK_STATION.errorMessage }
        require(isExistStation()) { ErrorType.CONTAINS_STATION.errorMessage }
    }

    override fun toString(): String =
        this.name

    private fun isBlank(): Boolean =
        !name.isBlank()

    private fun isExistStation(): Boolean =
        STATIONS.contains(name)
}