package br.com.glauber.functions

//Uma função de ordem superior é uma função que recebe outra função como parâmetro e/ou retorna uma função.

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int { // Função operation dentro do parâmetro
    return operation(x, y)
}

fun sumTest(x: Int, y: Int) = x + y
fun main() {
    val sumResult = calculate(5, 6, ::sumTest)
    val mulesult = calculate(4, 5) { a, b -> a * b } // Expressão lambda para determinar a operação
    println("sumResult $sumResult, mulResult $mulesult")
}