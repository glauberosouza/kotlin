package br.com.glauber.poo

// Herança passando argumentos para superclasse

open class Lion(val name: String, val origin: String){
    fun sayHello(){
        println("$name, the lion from $origin says: graoh!")
    }
}
 /* A subclasse recebe apenas 1 parâmetro e Herda da classe Lion, porém, o parâmetro da
 classe Asiatic propagou o parâmetro name para Lion name.*/
class Asiatic(name: String) : Lion(name = name, origin = "India")

fun main() {
    val lion: Lion = Asiatic("Rufo") // Polimorfismo
    lion.sayHello()
}