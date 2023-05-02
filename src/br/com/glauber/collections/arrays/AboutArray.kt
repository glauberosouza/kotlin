package br.com.glauber.collections.arrays

fun main() {
    val arrayElements = Array<String>(
        size = 5, init = {index -> "Elements do Array ($index)"})

    arrayElements.set(0, "Glauber")
    println("Tamanho do Array:  $arrayElements.size")
    println("Elementos na poisção 0: ${arrayElements.get(0)}")
    println("Elementos na poisção 1: ${arrayElements.get(1)}")
    println("Elementos na poisção 2: ${arrayElements.get(2)}")
    println("Elementos na poisção 3: ${arrayElements.get(3)}")
    println("Elementos na poisção 4: ${arrayElements.get(4)}")
}