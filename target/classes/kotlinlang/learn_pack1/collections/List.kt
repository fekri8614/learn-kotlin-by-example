package kotlinlang.learn_pack1.collections

/** [Collections ( >List)](https://play.kotlinlang.org/byExample/04_functional/02_Lambdas) */
private val systemUser: MutableList<Int> = mutableListOf(1, 2, 3)
private val sudoers : List<Int> = systemUser

private fun addSystemUser(newUser: Int) {
    systemUser.add(newUser)
}

private fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {
    addSystemUser(4)
    println("tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach {
        i -> println("some useful info on user: $i")
    }
    // getSysSudoers().add(5) *error!
}