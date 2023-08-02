package kotlinlang.learn_pack2.flow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

suspend fun performRequest(request: Int) : String {
    delay(100)
    return "response $request"
}

private fun main() = runBlocking {
    (1..3).asFlow()
        .transform { request ->
            emit("Making request $request")
            emit(performRequest(request))
        }
        .collect { response -> println(response) }
}

