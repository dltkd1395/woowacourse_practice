package pairmatching.domain


class Pair(crews: List<Crew>) {
    private val crews: MutableList<Crew>

    init {
        this.crews = ArrayList(crews)
    }

    fun add(crew: Crew) {
        crews.add(crew)
    }

    override fun toString(): String =
        crews.map(Crew::toString).joinToString(" : ")


    fun isSame(candidate: Pair): Boolean {
        this.crews.sorted()
        candidate.crews.sorted()
        return crews == candidate.crews
    }
}