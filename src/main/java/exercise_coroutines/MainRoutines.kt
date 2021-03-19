package exercise_coroutines

import kotlinx.coroutines.*


 fun main() {

    //--
   Thread.sleep(4000)

   // println("--out launch--")
    GlobalScope.launch(Dispatchers.Default) {
        println("0")
        fooShort()
        println("1")
        fooRegular()
        println("2")
        fooLong()
    }

    //---

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