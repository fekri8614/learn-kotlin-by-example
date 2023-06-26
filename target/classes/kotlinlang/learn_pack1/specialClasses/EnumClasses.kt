package kotlinlang.learn_pack1.specialClasses

/** [Special Classes ( >Enum Classes)](https://play.kotlinlang.org/byExample/01_introduction/07_Inheritance) */
// sample 1
enum class State {
    IDLE,
    RUNNING,
    FINISHED
}

// sample 2
enum class Color(private val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

fun main() {
    // sample 1
    val message = when (State.RUNNING) {
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)

    println("\n*****\n")

    // sample 2
    val red = Color.RED
    println(red)
    println(red.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())
}