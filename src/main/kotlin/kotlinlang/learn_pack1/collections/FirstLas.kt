package kotlinlang.learn_pack1.collections

/** [Collections ( >first, last)](https://play.kotlinlang.org/byExample/05_Collections/07_firstlast) */
fun main() {
    // `first`, `last`
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val first = numbers.first()
    val last = numbers.last()

    val firstEven = numbers.first { it % 2 == 0 }
    val lastOdd = numbers.last { it % 2 != 0 }

    println("Numbers: $numbers")
    println("First $first, last $last, first even $firstEven, last odd $lastOdd")

    println("\n*******\n")

    // `firstOrNull`, `lastOrNull`
    val words = listOf("foo", "bar", "baz", "faz")
    val empty = emptyList<String>()

    val firstEmp = empty.firstOrNull()
    val lastEmp = empty.lastOrNull()

    val firstF = words.firstOrNull { it.startsWith('f') }
    val firstZ = words.firstOrNull { it.startsWith('z') }

    val lastF = words.lastOrNull { it.endsWith('f') }
    val lastZ = words.lastOrNull { it.endsWith('z') }

    println("Empty list: first is $firstEmp, last is $lastEmp")
    println("Word list: first item starting with 'f' is $firstF, first item starting with 'z' is $firstZ")
    println("Word list: last item ending with 'f' is $lastF, last item ending with 'z' is $lastZ")

}