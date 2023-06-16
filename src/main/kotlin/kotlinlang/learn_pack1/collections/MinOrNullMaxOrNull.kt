package kotlinlang.learn_pack1.collections

/** [Collections ( >minOrNull, maxOrNull)](https://play.kotlinlang.org/byExample/05_Collections/13_max) */
fun main() {

    val numbers = listOf<Int>(1, 2, 3)
    val empty = emptyList<Int>()
    val only = listOf<Int>(3)

    println("Numbers: $numbers, min = ${numbers.minOrNull()} max = ${numbers.maxOrNull()}")
    println("Empty: $empty, min = ${empty.minOrNull()}, max = ${empty.maxOrNull()}")
    println("Only: $only, min = ${only.minOrNull()}, max = ${only.maxOrNull()}")

}

