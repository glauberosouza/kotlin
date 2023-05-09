package br.com.glauber.exceptions

import kotlin.jvm.Throws

//Kotlin não tem exceções verificadas. Segue um exemplo simples exception customizada.


class IllegalVoterException(message: String) : Throwable(message)

@Throws(IllegalVoterException::class)
fun vote(name: String, age: Int){
    if (age < 16){
        throw IllegalVoterException("Apenas maiores de 16 anos podem votar!")
    }
    println("Voto ${name} realizado com sucesso!")
}
fun main() {
    try { //Somente para simulação, não faz sentido o try aqui.
    vote("Glauber", 31)
    vote("Andreza", 15)
    }catch (e: IllegalVoterException){
        e.printStackTrace() //Só para teste.
    }
}