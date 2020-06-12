package Functions

fun addTwo(x: Int): Int {
    return x + 2
}

fun main() {
    val numbers = listOf(1, 2, 3, 4).map(::addTwo)
    println(numbers)
}
