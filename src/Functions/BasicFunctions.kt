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
}

