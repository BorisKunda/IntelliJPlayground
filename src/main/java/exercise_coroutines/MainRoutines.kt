package exercise_coroutines

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.coroutineContext


fun main() {

    val c1: CoroutineContext = CoroutineName("corA")
    //println(c1[CoroutineName])
    val c2: CoroutineContext = CoroutineName("corB")
    //println(c2[CoroutineName])
    val c3: CoroutineContext = CoroutineName("corC")
    //println(c3[CoroutineName])

    GlobalScope.launch() {

    }

    //coroutine-scope -> inherited context
    //launch(context) -> context argument
    //launch(block) -> coroutine context

    /*
    fun CoroutineScope.newCoroutineContext(context: CoroutineContext): CoroutineContext {
    val combined = coroutineContext + context

    coroutineContext -> inheritedContext
    context -> context argument

    }

    parent context = default values + inherited context + context argument
     */

    //coroutine context = parent context + coroutine job

//    GlobalScope.launch(
//        context = Dispatchers.Default,
//        block = {
//            ->
//        },
//    )


}

private suspend fun fooShort() {
    println("--short--START")
    delay(1000)
    println("--short--END")
}

private suspend fun fooRegular() {
    println("--regular--START")
    delay(2000)
    println("--regular--END")
}

private suspend fun fooLong() {
    println("--long--START")
    delay(3000)
    println("--long--END")
}