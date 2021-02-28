package pt.ulusofona.cm.kotlin.challenge.models


class Veiculo(val identificador: String){

    val dataDeAquisicao = Date(11, 9,2020)
    val posicao = Posicao();

    fun requerCarta(): Boolean{
        return true;
    }

    override fun toString() = "Veiculo| $identificador | $dataDeAquisicao | ${posicao.toString()}"

}