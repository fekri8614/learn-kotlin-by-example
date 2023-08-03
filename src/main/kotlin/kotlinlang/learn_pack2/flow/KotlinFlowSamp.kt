package kotlinlang.learn_pack2.flow

// Start from https://kotlinlang.org/docs/flow.html

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import javax.naming.Context
import kotlin.system.measureTimeMillis
import kotlin.time.measureTime

private fun main() = runBlocking {
    val nums = (1..3).asFlow().onEach { delay(300) }
    val strs = flowOf("one", "two", "three").onEach { delay(400) }
    val startTime = System.currentTimeMillis()
    nums.combine(strs) { a, b -> "$a ~ $b" }
        .collect { value ->
            println("$value at ${System.currentTimeMillis() - startTime} ms from start")
        }
}

