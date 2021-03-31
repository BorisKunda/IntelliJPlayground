package exercise_coroutines

import kotlinx.coroutines.*


fun main() {


    GlobalScope.launch(Dispatchers.Default) {

    }


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