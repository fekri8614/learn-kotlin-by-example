package collections

/** [Collections ( >any, all, none)](https://play.kotlinlang.org/byExample/05_Collections/05_existential) */
fun main() {
    // any
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val anyNegative = numbers.any { it < 0 }

    val anyGT6 = numbers.any { it > 6 }

    println("Numbers: $numbers")
    println("Is there any number less than 0: $anyNegative")
    println("Is there any number greater than 6: $anyGT6")

    println("\n********\n")

    // all
    val allEven = numbers.all { it % 2 == 0 }

    val allLess6 = numbers.all { it < 6 }

    println("Numbers: $numbers")
    println("All numbers are even: $allEven")
    println("All numbers are less than 6: $allLess6")

    println("\n********\n")

    // none
    val allEven2 = numbers.none { it % 2 == 1 }

    val allLess62 = numbers.none { it > 6 }

    println("Numbers: $numbers")
    println("All numbers are even: $allEven2")
    println("No element greater than 6: $allLess62")

}