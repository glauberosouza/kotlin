package br.com.glauber.fluxcontrol
//When Expression pode ser utilizado na atribuição como expression
fun main() {
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClassB()))
}
fun whenAssign(obj: Any): Any{
    val result = when (obj){
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}
class MyClassB