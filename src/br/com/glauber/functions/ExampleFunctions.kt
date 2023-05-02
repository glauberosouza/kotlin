package br.com.glauber.functions

fun main() {
    printMessage("Hi, how are you?")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(10, 20))
    println(multiply(10, 20))
}
fun printMessage(message: String): Unit{ // Unit representa a ausência de um valor de retorno em uma função.
    println(message)
}
fun printMessageWithPrefix(message: String, prefix: String = "Info"){
    println("[$prefix] $message")
}
fun sum(x: Int, y: Int): Int{
    return x + y
}
fun multiply(x: Int, y: Int) = x * y //Definir uma função simples em uma unica linha.
