package pt.ulusofona.cm.kotlin.challenge.models

class Posicao(val x:Int = 0, val y:Int= 0) {

    fun alterarPosicaoPara(x:Int, y:Int){}

    override fun toString() = "Posicao | $x | $y";
}