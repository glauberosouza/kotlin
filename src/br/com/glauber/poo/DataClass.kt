package br.com.glauber.poo

data class DataClass (val name: String, val id: Int){
    override fun equals(other: Any?) =
        other is DataClass && other.id == this.id
}

fun main() {
    val dataClass = DataClass("Glauber", 1)
    println(dataClass)

    val secondDataClass = DataClass("Glauber", 1)
    val thirdDataClass = DataClass("Max", 2)

    println("dataClass == secondDataclass: ${dataClass == secondDataClass}")
    println("dataClass == thirdDataClass: ${dataClass == thirdDataClass}")

    //HashCode() function
    println(dataClass.hashCode())
    println(secondDataClass.hashCode())
    println(thirdDataClass.hashCode())

    //copy() function
    println(dataClass.copy()) // Cria uma copia com endereço de memória diferente, semelhante a instânciar
    println(dataClass === dataClass.copy()) // Deve retornar false, comparando endereço de memória
    println(dataClass.copy("Max")) // Além de copiar, posso alterar algum parâmetro
    println(dataClass.copy(id = 3)) // Posso especificar qual elemento eu quero alterar

    println("name = ${dataClass.component1()}") //O componente 1 representa a primeira propiedade atribuida a classe
    println("id = ${dataClass.component2()}") // 2 propriedade da classe

}