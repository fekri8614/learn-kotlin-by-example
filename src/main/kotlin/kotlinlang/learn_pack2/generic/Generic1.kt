package kotlinlang.learn_pack2.generic

private inline fun <reified A, reified B> Pair<*, *>.asPairOf(): Pair<A, B>? {
    if (first !is A || second !is B) return null
    return first as A to second as B
}

private val somePair: Pair<Any?, Any?> = "items" to listOf(1, 2, 3)


private val stringToSomething = somePair.asPairOf<String, Any>()
private val stringToInt = somePair.asPairOf<String, Int>()
private val stringToList = somePair.asPairOf<String, List<*>>()
private val stringToStringList = somePair.asPairOf<String, List<String>>()
// Expand the sample for more details


fun main() {
    println("stringToSomething = $stringToSomething")
    println("stringToInt = $stringToInt")
    println("stringToList = $stringToList")
    println("stringToStringList = $stringToStringList")
}
