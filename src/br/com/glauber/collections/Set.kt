package br.com.glauber.collections
// Set não são ordenados e não aceitam elementos duplicados

val openIssues: MutableSet<String> = mutableSetOf("uniqueDesc1", "uniqueDesc2", "uniqueDesc3")
//variavel imutavel,porém, recebendo um mutableSet podendo alterar os elementos do Set

fun addIssue(uniqueDesc: String): Boolean{
    return openIssues.add(uniqueDesc)
}
fun getStatusLog(isAdded: Boolean): String{
    return if (isAdded) "registered correctly." else "marked as duplicate and reject"
}

fun main() {
    val aNewIssue: String = "uniqueDesc4"
    val anIssueAlreadyIn: String = "uniqueDesc2"
    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")
}