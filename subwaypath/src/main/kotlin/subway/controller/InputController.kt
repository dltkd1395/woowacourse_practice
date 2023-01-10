package subway.controller

import subway.domain.InquiryType
import subway.domain.PathInquiry
import subway.domain.Station
import subway.view.InputView

class InputController {

    fun getPathInquiry(): PathInquiry {
        try {
            val pathInquiry = InputView.readPathInquiry()
            println()
            return pathInquiry
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getPathInquiry()
        }
    }

    fun getInquiryType(): InquiryType {
        try {
            val inquiryType = InputView.readInquiryType()
            println()
            return inquiryType
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getInquiryType()
        }
    }

    fun getDepartureStation(): Station {
        try {
            val departureStation = InputView.readDepartureStation()
            println()
            return departureStation
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getDepartureStation()
        }
    }

    fun getArrivalStation(): Station {
        try {
            val arrivalStation = InputView.readArrivalStation()
            println()
            return arrivalStation
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return getArrivalStation()
        }
    }
}