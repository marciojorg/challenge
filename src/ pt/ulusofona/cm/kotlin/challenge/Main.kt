package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.models.*

fun main() {
    // aqui escreves o código do programa
    val date = Date(12,2, 2021)
    val pessoa = Pessoa("Tomás", date);
    val bicicleta = Bicicleta("122232")
    val veiculo = Veiculo("1221")
    val motor = Motor(2000,700)
    val posicao = Posicao()

    println(pessoa)
    println(bicicleta)
    println(veiculo)
    println(motor)
    println(posicao)
}
