package kotlinlang.learn_pack1.productivityBoosters

/**
 * [Productivity Boosters ( >Destructuring Declarations)](https://play.kotlinlang.org/byExample/08_productivity_boosters/03_Destructuring%20Declarations)
 * */

// third
private class Pair<K, V>(val first: K, val second: V) {
    operator fun component1(): K = first
    operator fun component2(): V = second
}

fun main() {
    val (num, name) = Pair(1, "one")
    println("num = $num , name = $name")
}
