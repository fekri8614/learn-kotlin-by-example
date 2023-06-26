package kotlinlang.learn_pack1.controlFlow

/** [Conditional Expression](https://play.kotlinlang.org/byExample/02_control_flow/05_Conditional%20expression) */
fun max(a: Int, b: Int) = if (a > b) a else b

fun main() {
    println("which one is the biggest? 12 or 2?\n${max(12, 2)} is the biggest")
}