package subway.controller

import subway.domain.InquiryType
import subway.domain.PathInquiry
import subway.domain.Station
import subway.repository.DijkstraRepository

class SubwayController {

    private val init = Init()
    private val inputController = InputController()
    private val outputController = OutputController()
    private lateinit var dijkstraRepository: DijkstraRepository


    fun run() {
        init.initite()
        val pathInquiry = inputController.getPathInquiry()
        if (pathInquiry.command.equals("Q")) {
            return
        }
        start()
        run()
    }

    private fun start() {
        val inquiryType = inputController.getInquiryType()
        back(inquiryType)
        inputStation()
        val path = getPath(inquiryType)
        outputController.getResult(path)
    }

    private fun back(inquiryType: InquiryType) {
        if (inquiryType.command.equals("B")) {
            run()
        }
    }

    private fun inputStation() {
        val departureStation = inputController.getDepartureStation()
        val arrivalStation = inputController.getArrivalStation()
        departureStation.isSameStation(arrivalStation)
        dijkstraRepository = DijkstraRepository(departureStation, arrivalStation)
    }

    private fun getPath(inquiryType: InquiryType): List<Station> {
        if (inquiryType.command.equals("1")) {
            return dijkstraRepository.getDistancePath()
        }
        return dijkstraRepository.getTimePath()
    }
}