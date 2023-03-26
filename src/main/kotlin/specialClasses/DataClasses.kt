package specialClasses

/** [Special Classes ( >Data Classes)](https://play.kotlinlang.org/byExample/01_introduction/07_Inheritance) */
data class User(val name: String, val id: Int) {
    override fun equals(other: Any?) = other is User && other.id == this.id
}
fun main() {
    val user = User("Mammad", 1)
    println(user)

    val secondUser = User("Mammad", 1)
    val thirdUser = User("Amir", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    println("\n*****\n")

    // hasCode() function
    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    println("\n*****\n")

    // copy() function
    println(user.copy())
    println(user == user.copy())
    println(user.copy(name = "Saghi"))
    println(user.copy(id = 3))

    println("name = ${user.component1()}")
    println("id = ${user.component2()}")

}