package playutils

fun printThreadName(someMessage: String = "") {
    println("Thread name is : ${Thread.currentThread().name} $someMessage")
}