package Functions

import java.text.FieldPosition

data class IntListWrapper (val wrapped: List<Int>) {
    operator fun get(position: Int): Int = wrapped[position]
}

fun main() {
    val a = IntListWrapper(listOf(1, 2, 3))
    println(a[1])
}