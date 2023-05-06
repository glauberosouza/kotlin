package br.com.glauber.poo

// Object keyword, permite conseguir um tipo de dados que possui uma implementação unica (Singleton)
// Pode ser aplicado a classes e funções
// Object Expression, podemos criar uma estrutura dinâmica


fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int) : Unit{
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }
    val total = dayRates.standard + dayRates.festivity + dayRates.special
    println("Total price: $$total")
}

// Object declaration, quando podemos criar uma classe como objeto, e instancia-la como instância unica.
object DoAuth{
    fun takeParams(userName: String, password: String){
        println("input Auth parameters = $userName:$password")
    }
}


// Objects companion, criamos um bloco com conteudo estático
class BigBen{
    companion object Bonger{ // Não precisa usar o nome Bonger, de forma estática, posso, chamar a função direto BigBen
        fun getbongs(nTimes: Int){
            for (i in 1 .. nTimes)
                print("BONG")
        }
    }
}


fun main() {
    rentPrice(10,2,1)

    DoAuth.takeParams("foo", "qwerty") // Acessando e utilizando a sua função

    BigBen.getbongs(12)
}