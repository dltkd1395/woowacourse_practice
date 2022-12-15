package subway.view

import camp.nextstep.edu.missionutils.Console
import subway.domain.PathInquiry
import subway.utils.INPUT_FEATURE
import subway.utils.INPUT_PATH_INQUIRY

object InputView {

    fun readPathInquiry(): PathInquiry {
        println(INPUT_PATH_INQUIRY)
        println(INPUT_FEATURE)
        return PathInquiry(Console.readLine())
    }
}