package specialClasses

/** [Special Classes ( >Sealed Classes)](https://play.kotlinlang.org/byExample/03_special_classes/03_Sealed%20Classes) */
sealed class Mammal(val name: String)

class Cat(catName: String): Mammal(catName)
class Human(humanName: String, val job: String): Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    return when(mammal) {
        is Human -> "Hello, ${mammal.name}. You're working as ${mammal.job}"
        is Cat -> "Hello, ${mammal.name}"
    }
}

fun main() {
    println(greetMammal(Cat("Snowy")))
}