package pt.ulusofona.cm.kotlin.challenge.exceptions

class VeiculoLigadoException(override val message: String = "O veiculo já se encontra ligado!"): Exception(message) {
}