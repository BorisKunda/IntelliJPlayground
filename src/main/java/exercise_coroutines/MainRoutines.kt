package exercise_coroutines

import kotlinx.coroutines.*
import playutils.printThreadName
import kotlin.coroutines.CoroutineContext


fun main() {

    runBlocking {

        var job1 = launch { fooShort("1") }
        var job2 = launch { fooShort("2") }
        var job3 = launch { fooShort("3") }

    }

}


private suspend fun fooShort(message: String = "") {
    println("--short--START $message")
    delay(1000)
    println("--short--END $message")
}

private suspend fun fooRegular(message: String = "") {
    println("--regular--START $message")
    delay(2000)
    println("--regular--END $message")
}

private suspend fun fooLong(message: String = "") {
    println("--long--START $message")
    delay(3000)
    println("--long--END $message")
}