package bridge.utils

const val MOVING_SUCCESS = "O"
const val MOVING_FAILURE = "X"
const val GAME_SUCCESS = "성공"
const val GAME_FAILURE = "실패"
const val RETRY = "R"
const val QUIT = "Q"
const val UP = "U"
const val DOWN = "D"
const val NO_VAULE = ""

const val ZERO = 0
const val ONE = 1
const val MIN_LENGTH = 3
const val MAX_LENGTH = 20

const val INPUT_BRIDGE_SIZE = "다리의 길이를 입력해주세요."
const val INPUT_BRIDGE_MOVEMENT = "이동할 칸을 선택해주세요. (위: U, 아래: D)"
const val INPUT_BRIDGE_RETRY = "게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)"

const val OUTPUT_GAME_START = "다리 건너기 게임을 시작합니다."
const val OUTPUT_GAME_SUCCESS = "게임 성공 여부: %s"
const val OUTPUT_GAME_RETRY = "총 시도한 횟수: %d"
const val OUTPUT_GAME_RESULT = "최종 게임 결과"