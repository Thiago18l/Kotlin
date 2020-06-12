package Basic

enum class Color (val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class ColorFun {
    RED {
        override val rgb: Int = 0xFF0000
    },
    GREE {
        override val rgb: Int = 0x00FF00
    },
    BLUE {
        override val rgb: Int = 0x0000FF
    }
    ;
    abstract val rgb: Int

    fun colorString() = "#%06X".format(0xFFFFFF and rgb)
}

// Simple Enum

enum class Color2 {
    RED, GREEN, BLUE
}

// Mutability

enum class Planet(var population: Int = 0) {
    EARTH(7 * 100000000),
    MARS();

    override fun toString(): String {
        return "$name [Population = $population]"
    }
}

fun main() {
    val planet: Planet = Planet.EARTH
    println(planet)
    Planet.MARS.population = 40
    println(Planet.MARS) // prints 40
}