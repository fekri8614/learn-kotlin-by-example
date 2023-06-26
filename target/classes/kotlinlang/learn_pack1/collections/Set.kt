package kotlinlang.learn_pack1.collections

/** [Collections ( >Set)](https://play.kotlinlang.org/byExample/05_Collections/02_Set) */

// Collections - Set
private val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")

private fun addIssue(uniqueDescr: String): Boolean {
    return openIssues.add(uniqueDescr)
}

private fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicated and rejected."
}

fun main() {
    val aNewIssue : String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")
}
