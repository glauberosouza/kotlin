package br.com.glauber.exceptions

//throw é uma expressão em Kotlin, então você pode usá-la, por exemplo,
// como parte de uma expressão de Elvis: (?:)
data class Person(val name: String?)
fun fail(message: String) : Nothing{ // Posso uitilizar o nothing quando lançado um throw nesse contexto
    throw IllegalArgumentException(message)
}
fun main() {
    val person = Person(null)
    //val personA = person.name ?: throw IllegalArgumentException("Name required")
    //println(personA)

    val s = person.name ?: fail("Name Required")
    println(s) // 's' is known to be initialized at this point
}