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


const val INPUT_PATH_INQUIRY =
"""## 메인 화면
1. 경로 조회
Q. 종료
"""

const val INPUT_INQUIRY_TYPE =
"""## 경로 기준
1. 최단 거리
2. 최소 거리
B. 돌아가기
"""

const val INPUT_FEATURE = "## 원하는 기능을 선택하세요."

const val INPUT_DEPARTURE_STATION = "## 출발역을 입력하세요."
const val INPUT_ARRIVAL_STATION = "## 도착역을 입력하세요."

const val OUTPUT_RESULT = "## 조회 결과"
const val OUTPUT_INFO = "[INFO] %s"
const val OUTPUT_TOTAL_DISTANCE = "총 거리: %dkm"
const val OUTPUT_TOTAL_TIME = "총 소요 시간: %d분"
