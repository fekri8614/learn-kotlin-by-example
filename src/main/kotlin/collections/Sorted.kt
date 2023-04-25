package collections

import kotlin.math.abs

/** [Collections ( >sorted)](https://play.kotlinlang.org/byExample/05_Collections/14_sorted) */
fun main() {

    val shuffled = listOf<Int>(5, 4, 2, 1, 3, -10)
    val natural = shuffled.sorted()
    val inverted = shuffled.sortedBy { -it }
    val descending = shuffled.sortedDescending()
    val descendingBy = shuffled.sortedByDescending { abs(it) }

    println("Shuffled: $shuffled")
    println("Natural order: $natural")
    println("Inverted natural order: $inverted")
    println("Inverted natural order value: $descending")
    println("Inverted natural order of absolute values: $descendingBy")

}