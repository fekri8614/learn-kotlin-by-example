package kotlinlang.learn_pack2

abstract class SomeClasses<T> {
    abstract fun execute(): T
}

class SomeImplementation : SomeClasses<String>() {
    override fun execute(): String = "Test"
}

class OtherImplementation : SomeClasses<Int>() {
    override fun execute(): Int = 42
}

object Runner {
    inline fun <reified S : SomeClasses<T>, T> run(): T {
        return S::class.java.getDeclaredConstructor().newInstance().execute()
    }
}

fun main() {

    val s = Runner.run<SomeImplementation, _>()
    assert(s == "Test")

    val n = Runner.run<OtherImplementation, _>()
    assert(n == 42)

}
