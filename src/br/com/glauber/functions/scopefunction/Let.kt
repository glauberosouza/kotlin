package br.com.glauber.functions.scopefunction
// Funções de scopo, sempre a ultima instrução é o retorno.
fun customPrint(s: String) {
    println(s.uppercase())
}

fun main() {
    val empty = "test".let { //Chamando o it que é o "test" em um customPrint
        customPrint(it)
        it.isEmpty() // Verifica se é vazio ou não, a ultima instrução é o retorno.
    }
    println("is empty: $empty")

    fun printNonNull(str: String?) {
        println("Printing \"$str\":")
        str?.let { // Utilizando o let para executar o str somente se ele não for nulo
            print("\t")
            customPrint(it)
            println()
        }
    }

    fun printIfBothNonNull(strOne: String?, strTwo: String?) {
        strOne?.let { firstString -> // Utilizando o let com verificação de nulo
            strTwo?.let { secondString -> // Só será executado se ambos não forem nulos
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }
    println(null)
    printNonNull("My string")
    printIfBothNonNull("First", "Second")
}