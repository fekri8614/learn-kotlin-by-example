package kotlinlang.learn_pack1.functional

/** [Functional ( >Higher-Order Functions)](https://play.kotlinlang.org/byExample/04_functional/01_Higher-Order%20Functions) */
// sample 1
// Taking Functions as Parameters
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

// sample 1
fun sum(x: Int, y: Int) = x + y

// sample 2
// Returning Functions
fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x

fun main() {
    // sample 1
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 5) {a, b -> a * b}
    println("sumResult $sumResult, mulResult $mulResult")

    println("\n*****\n")

    // sample 2
    val func = operation()
    println(func(2))
}
