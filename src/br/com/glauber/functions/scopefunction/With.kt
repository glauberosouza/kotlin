package br.com.glauber.functions.scopefunction

//with é uma função sem extensão que pode acessar membros de seu argumento de forma concisa:
// você pode omitir o nome da instância ao se referir a seus membros.

fun main() {
    val configuration = Configuration(host = "127.0.0.1", port = 9000)
    with(configuration){ // Com with podemos acessar direto o host e port.
        println("$host:$port")
    }
    //alternative:
    configuration.run {
        println("$host:$port")
    }
    //instead of:
    println("${configuration.host}:${configuration.port}")

}
class Configuration(val host: String, val port: Int)

