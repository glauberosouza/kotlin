package br.com.glauber.functions

//Determinadas funções podem ser “atualizadas” para os operadores,
// permitindo suas chamadas com o símbolo de operador correspondente.

fun main() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Bye ") // O mesmo comportamento da infix porém, no lugar de times (*)

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive. Nothing annoys them so much"
    println(str[0..14])
}