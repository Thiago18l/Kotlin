package Basic

import java.util.*

// Generic Arrays

val empty = emptyArray<String>()

fun main(args: Array<String>) {
    println(empty.size)
    // Using constructor
    var strings = Array<String>(size = 5, init = { index -> "Item $index"})
    print(strings.size)

    strings.set(2, "ChangeItem")
    print(strings.get(2))

    //using subscription
    strings[2] = "Another item"
    print(strings.get(2))

    // create array
    val a = arrayOf(1, 2, 3) // create an Array<Int> of size 3 containing [1, 2, 3]
    println("\n" + a.get(1))
    for (item in a) {
        println(item)
    }

    // Create array using a clousure
    val closure = Array(3) { i -> i * 2 }
    for (itens in closure) {
        print("$itens ")
    }

    val uni = arrayOfNulls<Int>(3) // creates an Array<Int> of [null, null, null]


}

fun Primitive (args: Array<String>) {
    booleanArrayOf(true, false) // JVM type: boolean[]
    byteArrayOf(1, 2, 3) // JVM type: byte[]
    charArrayOf('a', 'b', 'c') // JVM type: char[]
}

class Extensions {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val doubles = doubleArrayOf(1.5, 3.0)
            println(doubles.average())
            val integers = intArrayOf(1, 4)
            println(integers.average())
        }
    }
}

class Iterate {
    companion object {
        @JvmStatic
        fun main (args: Array<String>) {
            val asc = Array(5, { i -> (i * i).toString() })
            for (item : String in asc) {
                println(item)
            }
        }
    }
}