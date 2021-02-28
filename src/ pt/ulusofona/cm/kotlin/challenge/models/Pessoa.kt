package pt.ulusofona.cm.kotlin.challenge.models


class Pessoa(val nome: String, val dataDeNascimento: Date){

    val veiculos = listOf<Veiculo>();
    val carta = Carta();
    val posicao= Posicao(0,0);


    fun comprarVeiculo(veiculo: Veiculo){};

    fun pesquisarVeiculo(identificador: String): Veiculo {
        val veiculo = Veiculo(identificador);
        return veiculo;
    }

    fun venderVeiculo(identificador: String, comprador: Pessoa){}

    fun moveVeiculoPara(identificador: String, x:Int, y:Int){}

    fun temCarta():Boolean{
        return true;
    }

    fun tirarCarta(){}


    override fun toString() = "Pessoa | $nome | ${dataDeNascimento} | ${posicao.toString()}"

}