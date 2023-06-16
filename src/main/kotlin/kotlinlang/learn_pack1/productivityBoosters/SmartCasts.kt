package kotlinlang.learn_pack1.productivityBoosters

import java.time.LocalDate
import java.time.chrono.ChronoLocalDate

/**
 * [Productivity Boosters ( >Smart Casts)](https://play.kotlinlang.org/byExample/08_productivity_boosters/04_Smart%20Casts)
 * */
fun main() {

    val date: ChronoLocalDate? = LocalDate.now()

    if (date != null) {
        println(date.isLeapYear)
    }

    if (date != null && date.isLeapYear) {
        println("it's a leap year :-)")
    }

    if (date == null || !date.isLeapYear) {
        println("There's no Feb 29 this year...")
    }

    if (date is LocalDate) {
        val month = date.monthValue
        println(month)
    }

}