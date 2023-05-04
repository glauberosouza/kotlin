package br.com.glauber.fluxcontrol

// Em kotlin não temos o ternario, porém, podemos realizar essa condiçao com (if)

fun main() {
    fun max(a: Int , b: Int) = if (a > b) a else b
    //Se "a" for maior que "b", a expressão retorna o valor de "a". Caso contrário, retorna o valor de "b".
    println(max(99, -42))
}