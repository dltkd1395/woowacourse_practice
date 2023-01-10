package bridge.domain

import bridge.BRIDGE
import bridge.ERROR
import bridge.utils.ErrorType
import bridge.utils.MAX_LENGTH
import bridge.utils.MIN_LENGTH

class BridgeNumber(val value: Int) {

    constructor(input: String) : this(
        input.toIntOrNull()
            ?: throw IllegalArgumentException("${ErrorType.NUMBER.errorMessage}")
    )

    init {
        require(isNumberRange()) { ERROR.format(BRIDGE + ErrorType.RANGE.errorMessage) }
    }

    private fun isNumberRange(): Boolean =
        value in MIN_LENGTH..MAX_LENGTH
}