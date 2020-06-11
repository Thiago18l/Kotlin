package Basic

fun main(args: Array<String>) {
    println("Hello World")
}

class App {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            println("Hello World")
        }
    }
}

class App2 {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            App2().run()
        }
    }
    fun run () {
        println("Hello World of App2")
    }
}

object App3 {
    @JvmStatic fun main (args: Array<String>) {
        println("Hello World from APp3")
    }
}