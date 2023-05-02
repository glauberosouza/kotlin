package br.com.glauber.aboutclass
/* Exemplos de declaração de classe em Kotlin e criação de instâncias de objetos,
bem como a modificação de suas propriedades.*/
class Customer // classe simples

class Contact(val id: Int, var email: String)

fun main() {
    val customer = Customer()
    val contact = Contact(1, "glauber@gmail.com")
    println(contact.email)
    println(contact.id)
    contact.email = "gabriel@gmail.com"
    println(contact.email)
}