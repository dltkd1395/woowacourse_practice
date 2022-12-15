package subway.repository

import subway.domain.Station
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
            station.name.equals(name)
        }

    fun deleteAll() {
        stations.clear()
    }
}