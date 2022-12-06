package pairmatching.domain

import pairmatching.utils.*

enum class Mission(val value: String) {
    RACING(RACING_MINSSION),
    LOTTO(LOTTO_MINSSION),
    BASEBALL(BASEBALL_MINSSION),
    SHOPPING_BASKET(SHOPPING_BASKET_MINSSION),
    PAYMENT(PAYMENT_MINSSION),
    SUBWAY_MAP(SUBWAY_MAP_MINSSION),
    IMPROVEMENT(IMPROVEMENT_MINSSION),
    DISTRIBUTION(DISTRIBUTION_MINSSION);

    companion object {
        fun of(name: String): Mission {
            return values().find { mission ->
                mission.value.equals(name)
            } ?: throw IllegalArgumentException(ErrorType.MISSION.errorMessage)
        }
    }

}