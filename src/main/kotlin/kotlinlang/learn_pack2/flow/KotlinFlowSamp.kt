package kotlinlang.learn_pack2.flow

// Start from https://kotlinlang.org/docs/flow.html

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

private fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")

private fun simple(): Flow<Int> = flow {
    log("Started simple flow")
    for (i in 1..3) {
        emit(i)
    }
}


private fun main() = runBlocking {
    simple().collect { value -> log("Collected $value") }
}

