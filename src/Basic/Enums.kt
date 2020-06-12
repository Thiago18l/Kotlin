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