package exercise_coroutines

import kotlinx.coroutines.*
import playutils.printThreadName
import kotlin.coroutines.CoroutineContext


fun main() {

    runBlocking {

        println(getUserSuspend("101"))

    }

}

suspend fun getUserSuspend(userId: String): User {
    delay(1000)
    return User(userId, "Filip")
}

/**user*/
data class User(val userId: String, val s: String)