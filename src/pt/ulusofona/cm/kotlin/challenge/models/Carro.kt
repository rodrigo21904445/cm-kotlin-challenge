package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

data class Carro (private val _identificador: String, private val _motor: Motor): Veiculo(_identificador), Movimentavel,
    Ligavel {
    override val identificador get() = _identificador
    private val motor get() = _motor

    override fun toString(): String {
        val separator: String = " | "
        val dataDeAquisicao = super.dataDeAquisicao
        val posicao = Posicao()
        return "Carro".plus(separator).plus(_identificador).plus(separator).plus(dataDeAquisicao).plus(separator)
            .plus(posicao).plus(separator).plus(posicao)
    }

    override fun requerCarta(): Boolean {
        return false
    }

    override fun moverPara(x: Int, y: Int) {

        if(posicao.x == x && posicao.y == y) {
            throw AlterarPosicaoException()
        }

        posicao.x = x
        posicao.y = y
    }

    override fun ligar() {

        if(motor.ligado) {
          throw VeiculoLigadoException()
        }

        motor.ligado = true
    }

    override fun desligar() {
        if(!motor.ligado) {
            throw VeiculoDesligadoException()
        }

        motor.ligado = false
    }

    override fun estaLigado(): Boolean {
        return motor.ligado
    }
}