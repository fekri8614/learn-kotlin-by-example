package collections

/** [Collections ( >zip)](https://play.kotlinlang.org/byExample/05_Collections/16_zip) */
fun main() {
    val A = listOf<String>("a", "b", "c")
    val B = listOf<Int>(1,2,3,4)

    val resultPairs = A zip B
    val resultReduce = A.zip(B) { a, b -> "$a$b" }

    print("A to B -> $resultPairs\n")
    print("\\\$A\\\$B -> $resultReduce")
}
