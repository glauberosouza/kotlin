package br.com.glauber.fluxcontrol
// When statement pode ser utilizado no lugar do switch
fun main() {
    cases("Hi")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}
fun cases(obj: Any){ // Pode receber qualquer coisa(Any)
    when (obj){
        1 -> println("Number One")
        "Hi" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a String")
        else -> println("Unknow")
    }
}
class MyClass