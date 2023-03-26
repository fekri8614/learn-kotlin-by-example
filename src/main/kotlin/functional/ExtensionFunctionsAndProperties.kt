package functional

/** [Functional ( >Extension Functions and Properties)](https://play.kotlinlang.org/byExample/04_functional/03_extensionFunctions) */
// sample 1
data class Item(val name: String, val price: Float)

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String
    get() = items.map { it.name }.joinToString()

// sample 2
fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"

fun main() {
    // sample 1
    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))

    println("Max priced item name: ${order.maxPricedItemName()}")
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")

    println("\n******\n")

    // sample 2
    println(null.nullSafeToString())
    println("Android".nullSafeToString())

}