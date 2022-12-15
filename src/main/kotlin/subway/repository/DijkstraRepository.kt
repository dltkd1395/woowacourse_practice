package subway.repository

import org.jgrapht.alg.shortestpath.DijkstraShortestPath
import subway.domain.Station

class DijkstraRepository(val departureStation: Station, val arrivalStation: Station) {

    fun getDistancePath(): List<Station> =
        DijkstraShortestPath(DistanceRepository.graph)
            .getPath(
                StationRepository.getStation(departureStation),
                StationRepository.getStation(arrivalStation)
            ).vertexList

    fun getTimePath(): List<Station> =
        DijkstraShortestPath(TimeRepository.graph)
            .getPath(
                StationRepository.getStation(departureStation),
                StationRepository.getStation(arrivalStation)
            ).vertexList
}