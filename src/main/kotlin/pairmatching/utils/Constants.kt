package pairmatching.utils

const val PAIR_MATCHING_COMMAND = "1"
const val PAIR_INQUIY_COMMAND = "2"
const val PAIR_INITIALIZATION_COMMAND = "3"
const val QUIT_COMMAND = "Q"

const val THREE = 3

const val INPUT_FEATURE_SELECTION =
    """기능을 선택하세요.
1. 페어 매칭
2. 페어 조회
3. 페어 초기화
Q. 종료"""

const val INPUT_PAIR_MATCHING =
    """
#############################################
과정: 백엔드 | 프론트엔드
미션:
  - 레벨1: 자동차경주 | 로또 | 숫자야구게임
  - 레벨2: 장바구니 | 결제 | 지하철노선도
  - 레벨3: 
  - 레벨4: 성능개선 | 배포
  - 레벨5: 
############################################
과정, 레벨, 미션을 선택하세요.
ex) 백엔드, 레벨1, 자동차경주"""

const val BACKEND_COURCE = "백엔드"
const val FRONTEND_COURCE = "프론트엔드"
const val LEVEL_1 = "레벨1"
const val LEVEL_2 = "레벨2"
const val LEVEL_3 = "레벨3"
const val LEVEL_4 = "레벨4"
const val LEVEL_5 = "레벨5"
const val RACING_MINSSION = "자동차경주"
const val LOTTO_MINSSION = "로또"
const val BASEBALL_MINSSION = "숫자야구게임"
const val SHOPPING_BASKET_MINSSION = "장바구니"
const val PAYMENT_MINSSION = "결제"
const val SUBWAY_MAP_MINSSION = "지하철노선도"
const val IMPROVEMENT_MINSSION = "성능개선"
const val DISTRIBUTION_MINSSION = "배포"

const val PATH = "src/main/resource/"
const val FILE_BACKEND = "backend-crew.md"
const val FILE_FRONTEND = "frontend-crew.md"

const val OUTPUT_MATCHING_RESULT = "페어 매칭 결과입니다."

const val YES = "네"
const val NO = "아니오"

const val INPUT_REMATCHING =
    """
매칭 정보가 있습니다. 다시 매칭하시겠습니까?
네 | 아니오"""