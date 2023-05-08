package br.com.glauber.functions
// Criando uma função que pode ser de qualquer tipo
fun <T> T?.nullSafeToString() = this?.toString() ?: "Nulo"
fun main() {
    println(null.nullSafeToString())
    println("Kotlin".nullSafeToString())
}