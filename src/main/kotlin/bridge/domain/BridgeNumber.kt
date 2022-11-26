package bridge.domain

import bridge.uilts.ErrorType
import bridge.uilts.MAX_SIZE
import bridge.uilts.MIN_SIZE
import bridge.uilts.ZERO

class BridgeNumber(private val number: String) {
    init {
        isNotNumber()
        require(isPositiveNumber()) { ErrorType.POSITIVE_NUMBER.errorMessage }
        require(isNumberRange()) { ErrorType.NUMBER_RANGE.errorMessage }
    }

    private fun isPositiveNumber(): Boolean =
        number.toInt() >= ZERO

    private fun isNumberRange(): Boolean =
        number.toInt() in MIN_SIZE..MAX_SIZE

    private fun isNotNumber() {
        try {
            number.toInt()
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException("${ErrorType.NOT_NUMBER.errorMessage}")
        }
    }

}