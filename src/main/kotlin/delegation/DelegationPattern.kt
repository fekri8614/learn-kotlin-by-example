package delegation

/**
 *  [Delegation ( >Delegation Pattern)](https://play.kotlinlang.org/byExample/07_Delegation/01_delegationPattern)
 * */
interface SoundBehavior {
    fun makeSound()
}

class ScreamBehavior(val n: String): SoundBehavior {
    override fun makeSound() = println("${n.uppercase()} !!!")
}

class RockAndRollBehavior(val n: String): SoundBehavior {
    override fun makeSound() = println("I'm the King of Rock 'N' Roll: $n")
}

class TomAray(n: String): SoundBehavior by ScreamBehavior(n)

class ElvisPresley(n: String) : SoundBehavior by RockAndRollBehavior(n)

fun main() {
    val tomAray = TomAray("Thrash Metal")
    tomAray.makeSound()
    val elvisPresley = ElvisPresley("Dancin' to the Jailhouse Rock.")
    elvisPresley.makeSound()
}
