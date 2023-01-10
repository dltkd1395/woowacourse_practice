package pairmatching.domain

class Matching(private val pairs: List<Pair>) {

    override fun toString(): String =
        pairs.map(Pair::toString).joinToString("\n")

    fun contains(candidate: Pair): Boolean {
        for (pair in pairs) {
            if (pair.isSame(candidate)) {
                return true
            }
        }
        return false
    }
}