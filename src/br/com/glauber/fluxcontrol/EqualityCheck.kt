package br.com.glauber.fluxcontrol

// Set não aceita elementos duplicados
fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)// Comparação estrutural dos objetos
    println(authors === writers)// Comparação Referencial ao endereço de memória
}