package kotlinlang.learn_pack2.flow

// Start from https://kotlinlang.org/docs/flow.html

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import javax.naming.Context

private fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")

private fun simple(): Flow<Int> = flow {
    for (i in 1..3) {
        Thread.sleep(100)
        log("emitting $i")
        emit(i)
    }
}.flowOn(Dispatchers.Default)


private fun main() = runBlocking {
    simple().collect { value -> log("Collected $value") }
}

