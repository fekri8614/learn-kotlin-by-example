package kotlinlang.learn_pack1.scopeFunctions

/**
 *  [Scope Functions ( >with)](https://play.kotlinlang.org/byExample/06_scope_functions/03_with)
 * */
class Configuration(var host: String, var port: Int)

fun main() {
    val configuration = Configuration("172.0.0.1", 9000)
    with(configuration) {
        println("$host:$port")
    }
    // instead of:
    println("E${configuration.host}:${configuration.port}")
}
