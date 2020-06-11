package Basic

fun printHello (name: String?): Unit {
    if (name != null) {
        println("Hello ${name}")
    }
}

fun double (x: Int): Int = x * 2

fun main(args: Array<String>) {
    var result = double(2)
    println(result)

    println(s)

    var a: String = "abc"
    // a = null  error!

    var b: String? = "abc"
    b = null
    println(b)

   var resultado = variable1?.equals(variable2) ?: (b === null)
    println(resultado) // true
    println(if (variable1 == variable2) true else false)

}

// String interpolation

val num = 10
val s = "i $num"

// equals

val variable1 = 10
val variable2 = 10
