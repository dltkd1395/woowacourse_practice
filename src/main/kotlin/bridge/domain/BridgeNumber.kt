package bridge.domain

import bridge.uilts.ErrorType
import bridge.uilts.ZERO

class BridgeNumber(private val number: Int) {
    init {
        require(isPositiveNumber()) { ErrorType.POSITIVE_NUMBER.errorMessage }
    }

    private fun isPositiveNumber(): Boolean =
        number >= ZERO
}