package br.com.glauber.functions
// Lambdas pode ser denotado de forma muito concisa em muitos casos,
// graças à inferência de tipo e à variável it implícita.

fun main() {
    //Todos os exemplos faz a mesma coisa, coloca as strings em caixa alta.
    // Exemplos de lambdas functions até os mais recomendados de se utilizar
    val upperCase1: (String) -> String = {str: String -> str.uppercase()}
    val upperCase2: (String) -> String = {str -> str.uppercase()}
    val upperCase3 = {str: String -> str.uppercase()}

    // val upperCase4 = {str -> str.uppercase} Não podemos deixar de especificar o tipo.
    val upperCase5: (String) -> String = {it.uppercase()} // it equivale o elemento usando a fun lambda
    val upperCase6: (String) -> String = String::uppercase

    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))
}