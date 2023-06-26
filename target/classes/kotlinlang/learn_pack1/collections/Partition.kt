package kotlinlang.learn_pack1.collections

/** [Collections ( >partition](https://play.kotlinlang.org/byExample/05_Collections/11_partition) */
fun main() {

    val numbers = listOf<Int>(1, -2, 3, -4, 5, -6)

    val evenOdd = numbers.partition { it % 2 == 0 }
    val (positives, negatives) = numbers.partition { it > 0 }

    println("Numbers: $numbers")
    println("Even numbers: ${evenOdd.first}")
    println("Odd numbers: ${evenOdd.second}")
    println("Positive numbers: $positives")
    println("Negative numbers: $negatives")

}