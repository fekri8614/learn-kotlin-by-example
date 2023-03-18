package controlFlow

/** [Loops](https://play.kotlinlang.org/byExample/02_control_flow/02_Loops) */
fun main() {

    // for
    val cakes = listOf<String>("carrot", "cheese", "chocolate")
    for (cake in cakes) println("Yummy! it's a $cake cake!")

    println("\n---------\n")

    // while and do-while
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        eatCake()
        cakesEaten++
    }
    do {
        bakeCake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

    println("\n---------\n")

    // Iterators
    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
    for (animal in zoo) println("watch out! This is a ${animal.name}")
}

/** [Loops ( >while and do-while)](https://play.kotlinlang.org/byExample/02_control_flow/02_Loops) */
fun eatCake() = println("Eat a cake")
fun bakeCake() = println("Bake a cake")

/** [Loops ( >Iterators)](https://play.kotlinlang.org/byExample/02_control_flow/02_Loops) */
class Animal(val name: String)
class Zoo(private val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> = animals.iterator()
}