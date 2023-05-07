package br.com.glauber.functions.scopefunction
// Funciona como apply: executa um determinado bloco e retorna o objeto chamado.
// Dentro do bloco, o objeto é referenciado por ele, então fica mais fácil passá-lo como argumento.
// Essa função é útil para incorporar ações adicionais, como fazer login em cadeias de chamadas.

data class PersonB(var name: String, var age: Int, var about: String){
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: PersonB){
    println("A new person ${p.name} was created.")
}
fun main() {
    val glauber = PersonB("Glauber", 31, "Software Developer")
        .also {
            writeCreationLog(it) // O (it) é quem o chamou.
        }
    println(glauber).toString()
}