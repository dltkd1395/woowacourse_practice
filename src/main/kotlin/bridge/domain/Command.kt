package bridge.domain

import bridge.COMMAND
import bridge.ERROR
import bridge.utils.*

class Command(val value: String) {

    init {
        CommandVaildator(COMMAND, value)
        require(isRightCommand()) { ERROR.format(COMMAND + ErrorType.COMMAND.errorMessage) }
    }

    private fun isRightCommand(): Boolean =
        value == RETRY || value == QUIT
}