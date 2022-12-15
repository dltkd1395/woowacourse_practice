package subway.repository

import org.jgrapht.graph.DefaultWeightedEdge
import org.jgrapht.graph.WeightedMultigraph
import subway.domain.Station
import subway.utils.DISTANCES
import subway.utils.ErrorType
import subway.utils.TIMES

object TimeRepository {
    val graph =
        WeightedMultigraph<Station, DefaultWeightedEdge>(DefaultWeightedEdge::class.java)

    fun addStation(station: Station) {
        graph.addVertex(station)
    }

    fun addConnection(departureStation: Station, arrivalStation: Station, weight: Double) {
        graph.setEdgeWeight(graph.addEdge(departureStation, arrivalStation), weight)
    }

    fun addAllVertex() {
        StationRepository.stations()
            .forEach(TimeRepository::addStation)
    }

    fun findTime(station1: Station, station2: Station): Int {
        TIMES.forEach { (startStation, endStation, weight) ->
            if (station1.toString() == startStation.toString() && station2.toString() == endStation.toString()) {
                return weight.toString().toInt()
            }
        }
        throw IllegalArgumentException(ErrorType.CONNECTION_STATION.errorMessage)
    }
}