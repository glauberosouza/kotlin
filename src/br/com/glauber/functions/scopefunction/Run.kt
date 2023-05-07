package br.com.glauber.functions.scopefunction

// Basicamente, ele faz o mesmo que o let: executa um bloco de código e retorna seu resultado.
// A diferença é que dentro do run o objeto é acessado por this.
// Isso é útil quando você deseja chamar os métodos do objeto em vez de passá-los como um argumento.
fun main() {
    fun getNullableLenght(ns: String?){
        println("For \$ns\":")
        ns?.run { // Se o ns não for nulo, vai continuar a execução
            println("\this empty? " + isEmpty()) // Ao contrário do let não preciso usar o (it)
            println("\tlenght = $length")
            length
        }
    }
    getNullableLenght(null)
    getNullableLenght("")
    getNullableLenght("some string with kotlin.")
}