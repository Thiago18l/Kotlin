package Functions

fun sayMyName(name: String): String {
    return "Your name is $name"
}

fun double(x: Int): Int {
    return x * 2
}

fun main() {
    println(sayMyName("Thiago"))
    println(double(20))
    println(makeList("Oi"))
}

fun makeList (last: String?): List<String> {
    val list =  mutableListOf("a", "b", "c")
    last?.let(list::add)
    return list
}

