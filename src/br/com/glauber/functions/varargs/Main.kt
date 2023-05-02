package br.com.glauber.functions.varargs


// O Parâmetro vararg é usado para passar uma quantidade indefinida de elementos do mesmo tipo.
fun main() {

    fun printAll(vararg messages: String){
    for (messsage in messages) println(messsage)
}
    printAll("Hi", "Hello", "Salut", "Bye")

    fun printAllWithPrefix(vararg messages: String, prefix: String){
        for (message in messages) println(prefix + message)
    }
    printAllWithPrefix(
        "Hello", "Oi", "Hi", "Até Mais", prefix = "Greeting:")

    fun Log(vararg entries: String){
        printAll(*entries) // Um parâmetro vararg é como um array em tempo de execução.
        // Para passar um array para um parâmetro vararg podemos usar o operador especial *
    }
    Log("Hello", "Oi", "Hi", "Até Mais")
}
