package br.com.glauber.poo

// Herança com parâmetro no construtor

open class Tiger(val origin: String){ //Parâmetro para especificar a origem
    fun sayHello(){
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")

fun main() {
    val tiger : Tiger = SiberianTiger()
    tiger.sayHello()
}