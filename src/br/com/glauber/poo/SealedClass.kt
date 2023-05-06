package br.com.glauber.poo
// Exemplo de classe selada, apenas classes do mesmo pacote pode estender as suas propriedades.

sealed class Mammal(val name: String)

class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal) : String{
    // Human e cat são mamíferos, sendo assim, posso criar a lógica do contexto abaixo
    when(mammal){
        is Human -> return "Hello ${mammal.name}; you're working as a ${mammal.job}"
        is Cat -> return "Hello ${mammal.name}"
    }
}
fun main() {
    val cat: Mammal = Cat("Snowy")
    val human: Mammal = Human("Glauber", "Dev")
    println(greetMammal(cat))
    println(greetMammal(human))
}
