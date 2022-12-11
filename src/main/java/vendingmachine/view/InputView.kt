package vendingmachine.view

import camp.nextstep.edu.missionutils.Console
import vendingmachine.domain.RetentionAmount

object InputView {
    fun readRetentionAmount(): RetentionAmount {
        val amount = RetentionAmount(Console.readLine())
        return amount
    }
}