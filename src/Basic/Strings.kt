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

    // ELements of String
    val str = "Thiago"
    println(str[1]) // prints h
    //String elements can be iterated with a for loop
    for (char in str) {
        print(char)
    }
    // String templates
    val i = 10
    val value = "i = $i"
    println("\n" + value)
    println("$str.length is ${str.length}")

}