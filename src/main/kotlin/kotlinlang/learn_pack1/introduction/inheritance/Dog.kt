package kotlinlang.learn_pack1.introduction.inheritance

/** [Inheritance](https://play.kotlinlang.org/byExample/01_introduction/07_Inheritance) */
open class Dog {
    open fun sayHello() {
        println("Wow wow!")
    }
}

class Yorkshire: Dog() {
    override fun sayHello() {
        println("Wif wif!")
    }
}

fun main(args: Array<String>) {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}