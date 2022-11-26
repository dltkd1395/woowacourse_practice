package bridge.domain

import bridge.uilts.ErrorType
import bridge.uilts.MAX_SIZE
import bridge.uilts.MIN_SIZE
import bridge.uilts.ZERO

class BridgeNumber(private val number: Int) {
    init {
        require(isPositiveNumber()) { ErrorType.POSITIVE_NUMBER.errorMessage }
        require(isNumberRange()) { ErrorType.NUMBER_RANGE.errorMessage }
    }

    private fun isPositiveNumber(): Boolean =
        number >= ZERO

    private fun isNumberRange(): Boolean =
        number in MIN_SIZE..MAX_SIZE
}