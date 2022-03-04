package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

data class Bicicleta (private val _identificador: String): Veiculo(_identificador), Movimentavel{

    override val identificador get() = _identificador

    override fun toString(): String {
        val separator: String = " | "
        val dataDeAquisicao = super.dataDeAquisicao
        val posicao = super.posicao
        return "Bicicleta".plus(separator).plus(_identificador).plus(separator).plus(dataDeAquisicao).plus(separator)
            .plus(posicao).plus(separator).plus(posicao)
    }

    override fun moverPara(x: Int, y: Int) {

        if(posicao.x == x && posicao.y == y) {
            throw AlterarPosicaoException()
        }

        posicao.x = x
        posicao.y = y
    }
}