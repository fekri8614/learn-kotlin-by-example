package inheritance

/** [Inheritance ( >Passing Constructor Arguments to Superclass)](https://play.kotlinlang.org/byExample/01_introduction/07_Inheritance) */
open class Lion(private val name: String, private val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India")

fun main() {
    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}

