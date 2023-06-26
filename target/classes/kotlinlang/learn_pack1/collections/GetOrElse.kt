package kotlinlang.learn_pack1.collections

/** [Collections ( >getOrElse)](https://play.kotlinlang.org/byExample/05_Collections/17_getOrElse) */
fun main() {
    // getOrElse
    val list = listOf<Int>(0, 10, 20)
    println(list.getOrElse(1) { 42 })
    println(list.getOrElse(10) { 42 })

    println("\n++++++++\n")

    // getOrElse | Map
    val map = mutableMapOf<String, Int?>()
    println(map.getOrElse("x") { 1 })

    map["x"] = 3
    println(map.getOrElse("x") { 1 })

    map["x"] = null
    println(map.getOrElse("x") { 1 })
}