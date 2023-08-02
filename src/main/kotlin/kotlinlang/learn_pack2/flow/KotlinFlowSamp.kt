package kotlinlang.learn_pack2.flow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun numbers(): Flow<Int> = flow {
    try {
        emit(1)
        emit(2)
        println("this line will not execute")
        emit(3)
    }catch (e: Exception) {
        println("ERROR:--> $e")
    } finally {
        println("Finally in numbers")
    }
}

private fun main() = runBlocking {
    numbers()
        .take(2)
        .collect { value -> println(value) }
}

