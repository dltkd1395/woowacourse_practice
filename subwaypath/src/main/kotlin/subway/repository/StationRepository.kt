package subway.repository

import subway.domain.Station
import subway.utils.ErrorType
import java.util.Collections


object StationRepository {
    private val stations: MutableList<Station> = ArrayList()
    fun stations(): List<Station> =
        Collections.unmodifiableList(stations)

    fun addStation(station: Station) {
        stations.add(station)
    }

    fun deleteStation(name: String?): Boolean =
        stations.removeIf { station ->
            station.toString().equals(name)
        }

    fun deleteAll() {
        stations.clear()
    }

    fun getStation(otherStation: Station): Station =
        stations.filter { station ->
            station == otherStation
        }.firstOrNull() ?: throw IllegalArgumentException(ErrorType.CONTAINS_STATION.errorMessage)
}