package br.com.glauber.nullsafe
// Podemos atribuir null apenas para uma variável do tipo String?, utilizando o operador ?.
fun main() {
    var neverNull: String = "this can't be null"
    //neverNull = null

    var nullable: String? = "This can be null"
    nullable = null

    var inferredNonNull = "The compiler assumes non-null"
    //inferredNonNull = null

    fun strLenght(notNull: String?): Int{
        return notNull?.length ?:0 // O operador Elvis ?: é utilizado para fornecer um valor padrão, que no caso é 0,
                                   // quando a expressão antes do operador é null.
    }
    println(strLenght(neverNull))
    println(strLenght(nullable))
}