package kotlinlang.learn_pack2.flow

// Start from https://kotlinlang.org/docs/flow.html

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import javax.naming.Context
import kotlin.system.measureTimeMillis
import kotlin.time.measureTime

private fun simple(): Flow<Int> = flow {
    for (i in 1..3) {
        Thread.sleep(100)
        emit(i)
    }
}


private fun main() = runBlocking {
    val nums = (1..3).asFlow()
    val strs = flowOf("one", "two", "three")
    nums.zip(strs) { a, b -> "$a -> $b" }
        .collect { println(it) }
}

