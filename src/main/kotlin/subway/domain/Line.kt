package subway.domain

data class Line(private val name: String) {

    override fun toString(): String =
        this.name
}