package vendingmachine.domain

interface NumberGenerator {
    fun generate(numbers: List<Int>): Int
}