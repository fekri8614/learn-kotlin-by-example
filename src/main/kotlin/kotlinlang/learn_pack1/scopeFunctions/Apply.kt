package kotlinlang.learn_pack1.scopeFunctions

/**
 *  [Scope Functions ( >apply/also)](https://play.kotlinlang.org/byExample/06_scope_functions/04_apply)
 * */
data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: Person) {
    println("Create a person to name: ${p.name}")
}

fun main() {
    val jake = Person()
    val stringApply = jake.apply {
        name = "Jake"
        age = 30
        about = "Android Developer"
    }
    println(stringApply)

    println("\n+++++++++\n")

    val mike = Person("Mike", 20, "Web developer")
    mike.also { writeCreationLog(it) }

}
