import java.io.Serializable

/**
 * Kotlin programming practice.
 *
 * Start from [here.](https://play.kotlinlang.org/byExample/overview)
 *
 * [@fekri86114](https://github.com/fekri86114)
 * */

private val USER_BASE_DATA: Pair<String, String> = Pair("Mammad", "1234")

fun main() {
    print("your name: ")
    val userName: String = readln()
    print("your password: ")
    val userPass: String = readln()

    val userData = Pair(userName, userPass)

    if (checkUserData(userData)) println("Hello, Mammad :-))")
    else println("Please, check your name '${userData.first}' or password '${userData.second}'")
}

fun checkUserData(userData: Pair<String, String>): Boolean = userData == USER_BASE_DATA

data class MyTriple<A, B, C>(
    val a: A,
    val b: B,
    val c: C
) : Serializable {
    override fun toString(): String = "($a, $b, $c)"
}
