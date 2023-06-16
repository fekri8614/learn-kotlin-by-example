package kotlinlang.learn_pack1.specialClasses

import java.util.Random

/** [Special Classes ( >Object Keyword)](https://play.kotlinlang.org/byExample/03_special_classes/04_Object) */
// sample 1
class LuckDispatcher {
    fun getNumber() {
        var objRandom = Random()
        println(objRandom.nextInt(10))
    }
}

// sample 2
// `object` Expression
fun returnPrice(standardDay: Int, festivityDays: Int, specialDays: Int): Unit {

    val dayRates = object {
        var standard: Int = 30 * standardDay
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    println("total price: $$total")
}

// sample 3
// `object` Declaration
object DoAuth {
    fun takeParams(userName: String, password: String) {
        println("input auth parameters = $userName:$password")
    }
}

// sample 4
// >Companion Objects
class BigBen {
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1..nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main() {
    // sample 1
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    d1.getNumber()
    d2.getNumber()

    println("\n*****\n")

    // sample 2
    returnPrice(10, 2, 1)

    println("\n*****\n")

    // sample 3
    DoAuth.takeParams("foo", "qwerty")

    println("\n*****\n")

    // sample 4
    BigBen.getBongs(12)
}