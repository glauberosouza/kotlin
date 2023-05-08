package br.com.glauber.functions

// Podemos criar uma operação que retorna uma outra função
fun operation(): (Int) -> Int {
    return ::square // :: -> para chamar outra função, retornando uma função que recebe inteiro e retorna inteiro
}

fun square(x: Int) = x * x

fun main() {
    val func = operation()
    println(func(2))
}