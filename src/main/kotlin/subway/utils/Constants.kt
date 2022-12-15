package subway.utils

val STATIONS = listOf("교대역", "강남역", "역삼역", "남부터미널역", "양재역", "양재시민의숲역", "매봉역")
val LINES = listOf("2호선", "3호선", "신분당선")
val DISTANCES = listOf(
    listOf("교대역", "강남역", 2),
    listOf("강남역", "역삼역", 2),
    listOf("교대역", "남부터미널역", 3),
    listOf("남부터미널역", "양재역", 6),
    listOf("양재역", "매봉역", 1),
    listOf("강남역", "양재역", 2),
    listOf("양재역", "양재시민의숲역", 10)
)

val TIMES = listOf(
    listOf("교대역", "강남역", 3),
    listOf("강남역", "역삼역", 3),
    listOf("교대역", "남부터미널역", 2),
    listOf("남부터미널역", "양재역", 5),
    listOf("양재역", "매봉역", 1),
    listOf("강남역", "양재역", 8),
    listOf("양재역", "양재시민의숲역", 3)
)
