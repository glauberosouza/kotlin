package br.com.glauber.generics
// Implementação simples de pilha em kotlin (Last-in First-out).
class GenericClass<E>(vararg intems: E) {
    private val elements = intems.toMutableList()
    fun push(element: E) = elements.add(element)
    fun peek(): E = elements.last()
    fun pop(): E = elements.removeAt(elements.size -1)
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size
    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun main() {
    val stack = GenericClass(0.62, 3.14, 2.7)
    stack.push(9.87)
    println(stack)
    println("peek(): ${stack.peek()}")
    println(stack)

    println()
    //Estrutura de repetição for para percorrer todos os elementos da pilha
    for (i in 1..stack.size()){
        println("pop(): ${stack.pop()}")
        println(stack)
    }
}