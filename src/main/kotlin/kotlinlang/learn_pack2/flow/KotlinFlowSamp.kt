package kotlinlang.learn_pack2.flow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun simple(): Flow<Int> = flow {
    println("Flow started")
    for (i in 1..3) {
        delay(100)
        println("Emitting $i")
        emit(i)
    }
}

private fun main() = runBlocking {
    withTimeoutOrNull(250) {
        simple().collect { value -> println(value) }
    }
    println("Done!")
}

