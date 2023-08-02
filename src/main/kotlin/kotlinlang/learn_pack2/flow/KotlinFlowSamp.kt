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
    (1..3).asFlow().collect { value -> println(value) }
}

