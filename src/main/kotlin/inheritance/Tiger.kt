package inheritance

/** [Inheritance ( >Inheritance with Parameterized Constructor)](https://play.kotlinlang.org/byExample/01_introduction/07_Inheritance) */
open class Tiger(private val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberiaTiger: Tiger(origin = "Siberia")

fun main() {
    val tiger: Tiger = SiberiaTiger()
    tiger.sayHello()
}