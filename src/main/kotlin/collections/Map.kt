package collections

/** [Collections ( >Map)](https://play.kotlinlang.org/byExample/05_Collections/03_Map) */
// Map
private const val POINT_X_PASS: Int = 15
private val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
private val EZPassReport: Map<Int, Int> = EZPassAccounts

private fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {
        println("updating $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINT_X_PASS
    } else {
        println("Error: Trying to update a non-existing account ($accountId)")
    }
}

private fun accountReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach { (k, v) -> println("ID $k: credit $v") }
}

fun main() {
    accountReport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    updatePointsCredit(5)
    accountReport()
}
