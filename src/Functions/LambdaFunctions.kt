package Functions

// Full sintax
val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

val sum2 = { x: Int, y: Int -> x + y }
fun main() {
    println(sum(2, 2))
    println(sum2(4, 4))

    val items = arrayOf("Perfume", "Lápis", "Mouse", "Notebook")
    val result = items.filter { it.equals("Perfume") }
    for (item in result) {
        println(item)
    }

    val response = listOf<Int>(1, 2, 3, 4).map { it + 2 }
    println(response)
}