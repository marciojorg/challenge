package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.models.Date

class Bicicleta(val identificador:String) {

    val dataDeAquisicao = Date(12,12,2020)
    val posicao = Posicao();

    override fun toString() = "Bicicleta| $identificador | $dataDeAquisicao | ${posicao.toString()}"
}