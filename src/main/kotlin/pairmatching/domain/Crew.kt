package pairmatching.domain

data class Crew(val name: String) : Comparable<Crew> {
    override fun compareTo(other: Crew): Int {
        return this.name.compareTo(other.name)
    }

    override fun toString(): String {
        return this.name
    }
}