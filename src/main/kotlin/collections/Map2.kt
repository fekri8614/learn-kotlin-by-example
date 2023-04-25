package collections

/** [Collections ( >map)](https://play.kotlinlang.org/byExample/05_Collections/04_map) */
private val numbers = listOf(1, -2, 3, -4, 5, -6)

private val doubles = numbers.map { x -> x * 2 }

private val tripled = numbers.map { it * 3 }
