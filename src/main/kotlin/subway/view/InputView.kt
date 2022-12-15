package subway.view

import camp.nextstep.edu.missionutils.Console
import subway.domain.InquiryType
import subway.domain.PathInquiry
import subway.domain.Station
import subway.utils.*

object InputView {

    fun readPathInquiry(): PathInquiry {
        println(INPUT_PATH_INQUIRY)
        println(INPUT_FEATURE)
        return PathInquiry(Console.readLine())
    }

    fun readInquiryType(): InquiryType {
        println(INPUT_INQUIRY_TYPE)
        println(INPUT_FEATURE)
        return InquiryType(Console.readLine())
    }

    fun readDepartureStation(): Station {
        println(INPUT_DEPARTURE_STATION)
        return Station(Console.readLine())
    }

    fun readArrivalStation(): Station {
        println(INPUT_ARRIVAL_STATION)
        return Station(Console.readLine())
    }
}