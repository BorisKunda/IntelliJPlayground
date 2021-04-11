package playutils

fun printThreadName(someMessage: String = "") {
    print("Thread name is : ${Thread.currentThread().name} $someMessage")
}