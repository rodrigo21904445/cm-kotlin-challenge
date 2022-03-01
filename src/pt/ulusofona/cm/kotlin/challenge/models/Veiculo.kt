package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.models.Posicao
import java.util.*

open class Veiculo (private val _identificador: String) {

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
}