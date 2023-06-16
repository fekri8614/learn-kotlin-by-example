package kotlinlang.learn_pack1.collections

/** [Collections ( >count](https://play.kotlinlang.org/byExample/05_Collections/08_count) */
fun main() {

    val numbers = listOf<Int>(1, -2, 3, -4, 5, -6)

    val totalCount = numbers.count()
    val evenCount = numbers.count { it % 2 == 0 }

    println("Total number of elements: $totalCount")
    println("Number of even elements: $evenCount")

}