package subway.view

import subway.domain.Station
import subway.utils.*

object OutputView {
    fun printResult(distance: Int, time: Int, path: List<Station>) {
        println(OUTPUT_RESULT)
        printLine()
        printTotalDistance(distance)
        printTotalTime(time)
        printLine()
        printPath(path)
    }

    private fun printLine() {
        println(OUTPUT_INFO.format("---"))
    }

    private fun printTotalDistance(totalDistance: Int) {
        println(OUTPUT_INFO.format(OUTPUT_TOTAL_DISTANCE.format(totalDistance)))
    }

    private fun printTotalTime(totalTime: Int) {
        println(OUTPUT_INFO.format(OUTPUT_TOTAL_TIME.format(totalTime)))
    }

    private fun printPath(path: List<Station>) {
        path.forEach { station ->
            println(OUTPUT_INFO.format(station.toString()))
        }
    }
}