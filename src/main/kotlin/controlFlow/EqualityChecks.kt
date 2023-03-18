package controlFlow

/** [Equality Checks](https://play.kotlinlang.org/byExample/02_control_flow/04_Equality%20Checks) */
fun main() {
    val authors = setOf<String>("Shakespeare", "Hemingway", "Twain")
    val writers = setOf<String>("Twain", "Shakespeare", "Hemingway")

    println("is authors == writers? ${authors == writers}")
    println("is writers == authors? ${writers == authors}")
}