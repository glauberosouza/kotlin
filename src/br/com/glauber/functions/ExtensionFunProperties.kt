package br.com.glauber.functions

//Kotlin permite adicionar novos membros a qualquer classe com o mecanismo de extensões.
// Ou seja, existem dois tipos de extensões: funções de extensão e propriedades de extensão.
// Eles se parecem muito com funções e propriedades normais, mas com uma diferença importante:
// você precisa especificar o tipo que estende.

data class Item(val name: String, val price: Float)
data class Order(val items: Collection<Item>)

// Função de extensão
//Retornando o preço pelo item mais caro.
fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F

// Retornando o nome do item mais caro.
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

//Declarando um atributo novo dentro da Order,
// quando chama essa variavel imutavel, retorna no get um map com os itens separados por vírgula.
val Order.commaDelimitedItemNames: String
    get() = items.map { it.name }.joinToString()

fun main() {
    val order = Order(
        listOf(
            Item("Bread", 25.0F),
            Item("Wine", 29.0F),
            Item("Water", 12.0F)
        )
    )

    println("Max priced item name: ${order.maxPricedItemName()}")
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")
}