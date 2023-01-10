package lotto

import subway.controller.SubwayController

fun main() {
    try {
        SubwayController().run()
    } catch (e: IllegalArgumentException) {
        println(e.message)
        println()
        main()
    }
}
