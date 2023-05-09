package br.com.glauber.exceptions

//Todas as classes de exceção em Kotlin herdam a classe Throwable.
// Cada exceção tem uma mensagem, um rastreamento de pilha e uma causa opcional.

fun main() {
    // throw Exception("Simulando uma exceção!")

    val a = 10;
    val b = 0;

    try {
        val divisao = a / b
    } catch (e: ArithmeticException) {
        println("Ocorreu uma exceção aritmética")
    }catch (e: Throwable){
        println(e.message)
    }finally {
        println("Finally executado!")
    }
    println("Fim!")
}