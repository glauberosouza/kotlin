package br.com.glauber.exceptions

// Podemos utilizar o try como uma expressão como no exemplo abaixo.

fun main() {
    val a = 10;
    val b = 0;
    val divisao: Int? = try {
        println("Tentando fazer a divisão...")
        a / b
    } catch (e: ArithmeticException) {
        println("Divisão com erro!")
        null
    }
    println(divisao)
}