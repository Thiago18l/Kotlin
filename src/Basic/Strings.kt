package Basic
// String Chapter
fun main (args: Array<String>) {
    val str1 = "Oi"
    println(str1)
    // String literals
        // Escaped String
        val s = "Hello you!\n"
        // Raw String
        val text = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
        """.trimMargin()
        println(text)
}