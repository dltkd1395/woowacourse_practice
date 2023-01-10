package subway.controller

import subway.domain.Line
import subway.domain.Station
import subway.repository.DistanceRepository
import subway.repository.LineRepository
import subway.repository.StationRepository
import subway.repository.TimeRepository
import subway.utils.DISTANCES
import subway.utils.LINES
import subway.utils.STATIONS
import subway.utils.TIMES

class Init {
    fun initite() {
        setStationRepository()
        setLineRepository()
        setDistanceRepository()
        setTimeRepository()
    }

    private fun setStationRepository() {
        STATIONS.forEach { station ->
            StationRepository.addStation(Station(station))
        }
        DistanceRepository.addAllVertex()
        TimeRepository.addAllVertex()
    }

    private fun setLineRepository() {
        LINES.forEach { line ->
            LineRepository.addLine(Line(line))
        }
    }

    private fun setDistanceRepository() {
        DISTANCES.forEach { (departureStation, arrivalStation, weight) ->
            DistanceRepository.addConnection(
                StationRepository.getStation(Station(departureStation.toString())),
                StationRepository.getStation(Station(arrivalStation.toString())),
                weight.toString().toDouble()
            )
        }
    }

    private fun setTimeRepository() {
        TIMES.forEach { (departureStation, arrivalStation, weight) ->
            TimeRepository.addConnection(
                StationRepository.getStation(Station(departureStation.toString())),
                StationRepository.getStation(Station(arrivalStation.toString())),
                weight.toString().toDouble()
            )
        }
    }
}