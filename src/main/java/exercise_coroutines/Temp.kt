package exercise_coroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking { // this: CoroutineScope

        this
        /**-----------*/
        launch {
            this
            println("Task-------β***${System.currentTimeMillis()}")
            delay(3000)
            println("Task-------B***${System.currentTimeMillis()}")
        }
        /**-----------*/
        coroutineScope(block = {  //coroutineScope() is suspend function
            launch {
                this
                println("Task-------γ***${System.currentTimeMillis()}")
                delay(5000)
                println("Task-------C***${System.currentTimeMillis()}")
            }
            this
            /**--*/
            println("Task-------α***${System.currentTimeMillis()}")
            delay(1000)//whole block becomes suspended therefore "C" called with delay (no pun intended)
            println("Task-------A***${System.currentTimeMillis()}") // This line will be printed before nested launch
        })
        /**-----------*/
        println("Over-------D***${System.currentTimeMillis()}") // This line is not printed until nested launch completes
    }

}