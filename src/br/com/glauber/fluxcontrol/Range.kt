package br.com.glauber.fluxcontrol

fun main() {
    for(i in 0..3){
        print(i)
    }
        println(" ")
    for(i in 0 until 3){ // until é exclusivo
        print(i)
    }
    println(" ")
    for(i in 2..8 step 2){ //step para um intervalo inclusivo 2 em 2
        print(i)
    }
    println(" ")
    for(i in 3 downTo 0){
        print(i)
    }
    println(" ")

    // exemplos com (Char)

    for(c in 'a'..'c'){
        print(c)
    }
    println(" ")
    for(c in 'z' downTo 's' step 2){
        print(c)
    }
    println(" ")

    // exemplos com (if)

    val number = 2
    if (number in 1..5){
        println("number is in range from 1 to 5")
    }
    println()
    if (number !in 6..10){
        println("number is not in range from 6 to 10")
    }
}