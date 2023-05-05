package br.com.glauber.collections
// Caso escolha utilizar listOf(), cria uma lista imutavel, caso queiro uma lista mutavel mutableListOf()

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3) // Lista com elementos mutaveis
val readOnly: List<Int> = systemUsers // Criando uma cópia somente de leitura da lista anterior.

fun addSystemUser(newUser: Int){
    systemUsers.add(newUser)
}
fun getSystemReadOnly(): List<Int>{
    return readOnly
}
fun main() {
    addSystemUser(4)
    println("All users:  ${ getSystemReadOnly().size }")
    getSystemReadOnly().forEach{
        i -> println("Some useful info on user $i")
    }
}