package pairmatching.domain

import pairmatching.utils.BACKEND_COURCE
import pairmatching.utils.ErrorType
import pairmatching.utils.FRONTEND_COURCE

enum class Course(val value: String) {
    BACKEND(BACKEND_COURCE),
    FRONTEND(FRONTEND_COURCE);

    companion object {
        fun of(name: String): Course {
            return values().find { cource ->
                cource.value.equals(name)
            } ?: throw IllegalArgumentException(ErrorType.COURCE.errorMessage)
        }
    }
}