package Basic

fun main(array: Array<String>) {
    println("Enter two numbers")
        var (a, b) = readLine()!!.split(' ') // !! this operator use for NullPointerException
        println("Max number is : ${maxNum(a.toInt(), b.toInt())}")
}
fun maxNum(a:Int, b: Int): Int {
    var max = if (a > b) {
        println("The value is $a")
        a
    } else {
        println("the value is $b")
        b
    }
    return max
}