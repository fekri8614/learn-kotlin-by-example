package productivityBoosters

/**
 * [Productivity Boosters ( >Named Arguments)](https://play.kotlinlang.org/byExample/08_productivity_boosters/01_namedArguments)
 * */
private fun format(userName: String, domain: String) = "$userName@$domain"

fun main() {

    println(format("mario", "example.com"))
    println(format("domain.com", "username"))
    println(format(userName = "foo", domain = "bar.com"))
    println(format(domain = "frog.com", userName = "pepe"))

}
