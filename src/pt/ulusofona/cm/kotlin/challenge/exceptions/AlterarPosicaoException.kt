package pt.ulusofona.cm.kotlin.challenge.exceptions

class AlterarPosicaoException(override val message: String = "Já se encontra nessa posição!"): Exception(message) {

}