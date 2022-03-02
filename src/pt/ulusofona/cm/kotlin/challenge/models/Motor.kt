package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

class Motor (private val _cavalos: Int, private val _cilindrada: Int): Ligavel {
    private var _ligado: Boolean = false
        var ligado get() = _ligado
        set(value) {this._ligado = value}

    val cavalos get() = _cavalos
    val cilindrada get() = _cilindrada

    override fun toString(): String {
        val separator: String = " | "
        return "Motor".plus(separator).plus(_cavalos.toString()).plus(separator).plus(_cilindrada.toString())
    }

    override fun ligar() {

        if(_ligado) {
            throw VeiculoLigadoException()
        }

        _ligado = true
    }

    override fun desligar() {

        if(!_ligado) {
            throw VeiculoDesligadoException()
        }

        _ligado = false
    }

    override fun estaLigado(): Boolean {
        return _ligado
    }

}
