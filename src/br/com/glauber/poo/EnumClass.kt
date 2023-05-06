package br.com.glauber.poo
// Enum são utilizados para definir um estado constante, segue exemplos.

enum class EnumClass {
    IDLE, RUNNING, FINISHED
}

enum class Color(val rgb: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 !=0)
}


fun main() {
    val enumClass = EnumClass.RUNNING
    val message = when(enumClass){
        EnumClass.IDLE -> "It'a idle"
        EnumClass.RUNNING -> "It's running"
        EnumClass.FINISHED -> "It's finished"
    }
    println(message)

    println()

    val red = Color.RED
    println(red)
    println(red.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())
}