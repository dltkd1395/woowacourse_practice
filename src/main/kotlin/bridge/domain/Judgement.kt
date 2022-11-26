package bridge.domain

import bridge.uilts.FAILURE
import bridge.uilts.SUCCESS

class Judgement(private val computerDirection: String, private val pleyerDirection: String) {
    fun compareDirection(): String {
        if (computerDirection == pleyerDirection) {
            return SUCCESS
        }
        return FAILURE
    }
}