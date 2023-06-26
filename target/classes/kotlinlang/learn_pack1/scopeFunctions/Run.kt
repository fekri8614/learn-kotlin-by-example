package kotlinlang.learn_pack1.scopeFunctions

/**
 *  [Scope Functions ( >run)](https://play.kotlinlang.org/byExample/06_scope_functions/02_run)
 * */
fun main() {
    fun getNullableLength(ns: String?) {
        println("for \"$ns\"")
        ns?.run {
            println("\tis empty? " + isEmpty())
            println("\tlength = $length")
        }
        println()
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("Some thing with Kotlin")
}
