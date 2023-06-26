package kotlinlang.learn_pack1.controlFlow

/** [When](https://play.kotlinlang.org/byExample/02_control_flow/01_When) */
fun main() {
    // When Statement
    case("Hello")
    case(1)
    case(0L)
    case(MyClass())
    case("hello")

    println("\n------------\n")

    // When Expression
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

/** [When ( >When Statement)](https://play.kotlinlang.org/byExample/02_control_flow/01_When) */
fun case(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}

/** [When ( >When Expression)](https://play.kotlinlang.org/byExample/02_control_flow/01_When) */
fun whenAssign(obj: Any): Any {
    return when (obj) {
        1 -> "One"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
}


class MyClass