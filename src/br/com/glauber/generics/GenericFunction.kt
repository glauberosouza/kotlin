package br.com.glauber.generics

fun <E> mutableStackOf(vararg elements: E) = GenericClass(*elements)
fun main() {
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)
}