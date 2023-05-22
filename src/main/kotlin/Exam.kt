/**
 * This file is the answer of Exam of Ershad High School.
 * </p>
 *
 * 2022
 * */

private fun main() {
    // define persons and how much they have
    val persons = listOf<String>("Zahra", "Amir", "Mahan")
    val totMoney = listOf<Double>(100.0, 120.0, 980.0)
    val passwords = listOf<Int>(1234, 5678, 9123)

    // define the variables that are going to get inputs from user.

    print("Hello!\nPlease, enter your name and password: \n")
    print("Name: ")
    val personName = readln()

    println("-----")

    print("Password: ")
    val personPassword = readln().toInt()

    println("\n++++++++++++++++++\n")

    when {
        personName == persons[0] && personPassword == passwords[0] -> {
            println("Hello, ${persons[0]}!") // Hello, Zahra!
            println("What do you wanna do for today?")
            println("Here's what you can do:\n1. add money\n2. get money\n3. look how much you have")
            val todo = readln()
            when (todo) {
                "1" -> {
                    println("how much do you wanna add?")
                    val addedMoney = readln().toDouble()
                    val currentMoney = addMoney(totMoney[0], addedMoney)

                    println("Everything is done!\nYou have $currentMoney")
                }

                "2" -> {
                    println("how much do you wanna get?")
                    val gottenMoney = readln().toDouble()
                    val currentMoney = getMoney(totMoney[0], gottenMoney)

                    println("Everything is done!\nYou have $currentMoney")
                }

                "3" -> {
                    println("Everything is done!\nYour amount: ${totMoney[0]}")
                }
            }
        }

        personName == persons[1] && personPassword == passwords[1] -> {
            println("Hello, ${persons[1]}!") // Hello, Amir!
            println("What do you wanna do for today?")
            println("Here's what you can do:\n1. add money\n2. get money\n3. look how much you have")
            val todo = readln()
            when (todo) {
                "1" -> {
                    println("how much do you wanna add?")
                    val addedMoney = readln().toDouble()
                    val currentMoney = addMoney(totMoney[1], addedMoney)

                    println("Everything is done!\nYou have $currentMoney")
                }

                "2" -> {
                    println("how much do you wanna get?")
                    val gottenMoney = readln().toDouble()
                    val currentMoney = getMoney(totMoney[1], gottenMoney)

                    println("Everything is done!\nYou have $currentMoney")
                }

                "3" -> {
                    println("Everything is done!\nYour amount: ${totMoney[1]}")
                }
            }
        }

        personName == persons[2] && personPassword == passwords[2] -> {
            println("Hello, ${persons[2]}!") // Hello, Mahan!
            println("What do you wanna do for today?")
            println("Here's what you can do:\n1. add money\n2. get money\n3. look how much you have")
            val todo = readln()
            when (todo) {
                "1" -> {
                    println("how much do you wanna add?")
                    val addedMoney = readln().toDouble()
                    val currentMoney = addMoney(totMoney[2], addedMoney)

                    println("Everything is done!\nYou have $currentMoney")
                }

                "2" -> {
                    println("how much do you wanna get?")
                    val gottenMoney = readln().toDouble()
                    val currentMoney = getMoney(totMoney[2], gottenMoney)

                    println("Everything is done!\nYou have $currentMoney")
                }

                "3" -> {
                    println("Everything is done!\nYour amount: ${totMoney[2]}")
                }
            }
        }

        else -> println("No user found!")
    }

}

// ----------------------------------------------------------

private fun getMoney(amount: Double, howMuch: Double): Double = amount - howMuch

private fun addMoney(amount: Double, howMuch: Double): Double = amount + howMuch
