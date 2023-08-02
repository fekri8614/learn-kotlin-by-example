package kotlinlang.learn_pack2.flow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

private fun main() = runBlocking {
    (1..5).asFlow()
        .filter {
            println("filter $it")
            it % 2 == 0
        }.map {
            println("Map $it")
            "string $it"
        }.collect {
            println("Collect $it")
        }
}

