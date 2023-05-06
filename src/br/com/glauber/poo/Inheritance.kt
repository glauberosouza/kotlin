package br.com.glauber.poo
// Toda class ou function por padrão é final em Kotlin

open class Dog(){ // CLasse Pai de outra classe precisa estar como open class
    open fun sayHello(){ // Precisa estar open para utilizar nas subclasses
        println("Wow wow!")
    }
}
class Yourkshire: Dog(){ // É um Dog
    override fun sayHello() {
        println("wif wif!")    }
}


fun main() {
    val dog: Dog = Yourkshire() // Aspecto de polimorfismo
    dog.sayHello()
}