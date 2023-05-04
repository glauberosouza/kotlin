package br.com.glauber.fluxcontrol
// Exemplo utilizando while e do while
fun eatACake() = println("Eat a cake")
fun bakeACake() = println("Bake a Cake")

fun main() {
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 2){
        eatACake()
        cakesEaten++
    }

    do {
        bakeACake()
        cakesBaked++
    }while (cakesBaked < cakesEaten)
}