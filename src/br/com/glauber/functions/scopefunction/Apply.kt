package br.com.glauber.functions.scopefunction

//apply executa um bloco de código em um objeto e retorna o próprio objeto.
// Dentro do bloco, o objeto é referenciado por this. Esta função é útil para inicializar objetos.

data class Person(var name: String, var age: Int, var about: String){
    constructor() : this("", 0, "") // sobrecarga do construtor.
}

fun main() {
    val jake = Person()
    val stringDescription = jake.apply {
        name = "Jake"
        age = 31
        about = "Software Developer"
    }.toString()
    println(stringDescription)
}