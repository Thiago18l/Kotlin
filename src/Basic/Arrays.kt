package Basic

import java.util.*

// Generic Arrays

val empty = emptyArray<String>()

fun main(args: Array<String>) {
    println(empty.size)
    // Using constructor
    var strings = Array<String>(size = 5, init = { index -> "Item $index"})
    print(strings.size)
}