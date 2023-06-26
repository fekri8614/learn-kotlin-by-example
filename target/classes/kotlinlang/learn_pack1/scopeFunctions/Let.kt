package kotlinlang.learn_pack1.scopeFunctions

/** [Scope Functions ( >let)](https://play.kotlinlang.org/byExample/06_scope_functions/01_let) */
fun customPrint(s: String) {
    print(s.uppercase())
}

fun main() {
    val empty = "test".let {
        customPrint(it)
        it.isEmpty()
    }
    println(" is empty -> $empty")


    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        str?.let {
            print("\t")
            customPrint(it)
            println()
        }
    }

    fun printIfBothNonNull(strOne: String?, strTwo: String?) {
        strOne?.let { firstString ->
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }

    println("\n+++++++++\n")

    printNonNull(null)
    print("non null")

    println("\n+++++++++\n")

    printIfBothNonNull("first", "second")

}
