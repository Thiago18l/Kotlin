package Collections

class UsingList {
    companion object {
        @JvmStatic
        fun main (args: Array<String>) {
            val list = listOf("Item 1", "Item2", "Item 3")
            println(list)
        }
    }
}

class UsingMap {
    companion object {
    @JvmStatic
    fun main(args: Array<String>) {
        val map = mapOf<Int, String>(Pair(1, "Item 1"), Pair(2, "Item 2"), Pair(3, "Item 3"))
        println(map.values)
        }
    }
}

class UsingSet {
    companion object {
        @JvmStatic
        fun main(args: Array<String>){
            val set = setOf(1, 2, 3)
            println(set)
        }
    }
}
