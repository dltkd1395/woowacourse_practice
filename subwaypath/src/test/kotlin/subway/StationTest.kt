package subway

import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import subway.domain.Station

class StationTest {
    @ParameterizedTest
    @ValueSource(strings = ["", " ", "홍대입구역"])
    fun `지하철역을 잘못 입력한 경우 예외가 발생한다`(value: String) {
        assertThrows<IllegalArgumentException> {
            Station(value)
        }
    }
}