package collections

/** [Collections ( >List)](https://play.kotlinlang.org/byExample/04_functional/02_Lambdas) */
val systemUser: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers : List<Int> = systemUser

fun addSystemUser(newUser: Int) {
    systemUser.add(newUser)
}

fun getSysSudoers(): List<Int> {
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