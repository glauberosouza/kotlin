package br.com.glauber.collections
//Funções filter, any, map e flatMap

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positves = numbers.filter { number -> number > 0 }
    val negatives = numbers.filter { it < 0 } // Posso usar a anotação no lugar do lambda
    println("Numbers: $numbers")
    println("Positive Numbers: $positves")
    println("Negative Numbers: $negatives")

    println()

    val numbersB = listOf(1, -2, 3, -4, 5, -6)
    val doubled = numbers.map { number -> number * 2 }
    val tripled = numbers.map { it * 3 }

    println("Numbers: $numbersB")
    println("Doubled Numbers: $doubled")
    println("Tripled Numbers: $tripled")

    println()

    val numbersC = listOf(1, -2, 3, -4, 5, -6)
    val anyNegative = numbersC.any { it < 0 }
    val anyGT6 = numbersC.any { it > 6 }

    println("Numbers: $numbersC")
    println("AnyNegative: $anyNegative")
    println("AnyGT6: $anyGT6")

    println()

    val fruitsBag = listOf("apple", "orange", "banana", "grapes")
    val clothesBag = listOf("shirts", "pants", "jeans")
    val cart = listOf(fruitsBag, clothesBag)
    val mapBag = cart.map { it } // Mapeia mantendo intacta a estrutura de lista original
    val flatMapBag = cart.flatMap { it }// Mapeia e junta todos os elementos, em uma mesma estrutura de dados

    println("Your bags are: $mapBag")
    println("The things you bought are: $flatMapBag")
}