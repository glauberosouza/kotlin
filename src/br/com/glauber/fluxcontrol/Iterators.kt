package br.com.glauber.fluxcontrol
/*O iterador permite percorrer sequencialmente os elementos de uma coleção,
 sem precisar acessar diretamente cada elemento por sua posição.*/
fun main() {
 val zoo = Zoo(listOf(
         Animal("Lion"),
         Animal("Zebra"),
         Animal("Lizard")
    ))
    for(animal in zoo){
        println("Watch out, it's a ${animal.name}")
    }
}

class Animal(val name: String)
class Zoo(val animals: List<Animal>){
    operator fun iterator(): Iterator<Animal>{ // Assinatura de um iterator
        return animals.iterator()
    }
}