package subway.controller

import subway.domain.Station
import subway.repository.DistanceRepository
import subway.repository.TimeRepository
import subway.view.OutputView

class OutputController {

    fun getResult(path: List<Station>) {
        OutputView.printResult(getTotalDistance(path), getTotalTime(path), path)
        println()
    }

    private fun getTotalDistance(path: List<Station>): Int {
        var distance = 0
        for (index in 0 until path.size - 1) {
            distance += DistanceRepository.findDistance(path.get(index), path.get(index + 1))
        }
        return distance
    }

    private fun getTotalTime(path: List<Station>): Int {
        var time = 0
        for (index in 0 until path.size - 1) {
            time += TimeRepository.findTime(path.get(index), path.get(index + 1))
        }
        return time
    }
}