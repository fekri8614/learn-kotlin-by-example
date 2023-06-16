package kotlinlang.learn_pack1.introduction.generic

/** [Generic ( >Generic Classes)](https://play.kotlinlang.org/byExample/01_introduction/06_Generics) */
class MutableStack<E>(vararg items: E) {

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size -1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString(): String = "MutableStack(${elements.joinToString()})"

}

/** [Generic ( >Generic Functions)](https://play.kotlinlang.org/byExample/01_introduction/06_Generics) */
fun <E> mutableStackOf(vararg elements: E) = MutableStack<E>(*elements)

// test area
fun main() {
    // Generic Classes -->
    val mutableStack = MutableStack<Int>()

    mutableStack.push(1)
    mutableStack.push(2)
    mutableStack.push(3)
    mutableStack.push(4)

    println("size: ${mutableStack.size()}")
    println("is empty: ${mutableStack.isEmpty()}\n")

    mutableStack.peek()
    println("peek =>")
    println("mutableStack: $mutableStack\n")

    mutableStack.pop()
    println("pop =>")
    println("mutableStack: $mutableStack\n\n")

    // Generic Functions -->
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println("stack: $stack")
}