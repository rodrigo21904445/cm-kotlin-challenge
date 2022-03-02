package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import pt.ulusofona.cm.kotlin.challenge.models.Posicao
import java.util.*

open class Veiculo (private val _identificador: String): Movimentavel {

    private var _posicao: Posicao = Posicao()
    private var _dataDeAquisicao: Date? = null

    open val identificador get() = _identificador

    var dataDeAquisicao get() = _dataDeAquisicao
    set(value) { this._dataDeAquisicao = value }

    val posicao get() = _posicao

    override fun toString(): String {
        val separator: String = " | "
        return "Veiculo".plus(separator).plus(_identificador)
    }

    fun requerCarta(): Boolean {
        return false
    }

    override fun moverPara(x: Int, y: Int) {

        if(_posicao.x == x && _posicao.y == y) {
            throw AlterarPosicaoException()
        }

        posicao.x = x
        posicao.y = y
    }
}