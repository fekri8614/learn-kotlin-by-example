package productivityBoosters

/**
 * [Productivity Boosters ( >Destructuring Declarations)](https://play.kotlinlang.org/byExample/08_productivity_boosters/03_Destructuring%20Declarations)
 * */
// first
fun findMinMax(list: List<Int>): Pair<Int, Int> {
    val min = list.minOrNull() ?: throw NoSuchElementException("List is empty.")
    val max = list.minOrNull() ?: throw NoSuchElementException("List is empty.")
    return Pair(min, max)
}

// second
private data class User(val userName: String, val email: String)
private fun getUser() = User("Mary", "mary@somewhere.com")

fun main() {

    // first
    val (x, y, z) = arrayOf(5, 10, 15)
    println("x: $x, y: $y, z: $z")

    val map = mapOf("Alice" to 21, "Bob" to 25)
    for ((name, age) in map) // {
        println("$name is $age years old")
    // }

    val minMax = findMinMax(listOf(100, 90, 50, 98, 76, 83))
    println("min = ${minMax.first}, max = ${minMax.second}")

    println("\n++++++\n")

    val user = getUser()
    val (username, email) = user
    println(username == user.component1())

    val (_, emailAddress) = getUser()
    println(email == emailAddress)

}
