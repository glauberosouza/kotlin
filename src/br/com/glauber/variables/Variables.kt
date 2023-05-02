package br.com.glauber.variables

// As variáveis var são mutáveis e as variáveis val são imutáveis.
// Além disso, é possível usar a inferência de tipo para a variável C,
// permitindo que o compilador reconheça o tipo da variável automaticamente.

fun main() {
    var a: String = "Mutavel"
    println(a)

    a = "Final"
    println(a)

    val b: Int = 1
    val c = 3
    println(b)
    println(c)

    fun someCondition() = true
    val d: Int
    if(someCondition()){
        d = 1
    }else{
        d = 2
    }
    println(d)
}