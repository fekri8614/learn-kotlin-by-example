package kotlinlang.learn_pack1.collections

/** [Collections ( >Filter)](https://play.kotlinlang.org/byExample/05_Collections/04_filter) */

private val numbers = listOf<Int>(1, -2, 3, -4, 5, -6)

private val positives = numbers.filter { x -> x > 0 }

private val negatives = numbers.filter { it < 0 }
