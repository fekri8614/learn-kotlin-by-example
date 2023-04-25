package collections

/** [Collections ( >flatMap](https://play.kotlinlang.org/byExample/05_Collections/12_flatMap) */
fun main() {

    val fruitsBag = listOf<String>("apple","orange","banana","grapes")
    val clothesBag = listOf<String>("shirts","pants","jeans")
    val carts = listOf<List<String>>(fruitsBag, clothesBag)
    val mapBag = carts.map { it }
    val flatMapBag = carts.flatMap { it } // carts.flatMp { it } = flatten()

    println("Your bags are: $mapBag")
    println("The things you bought are: $flatMapBag")

}