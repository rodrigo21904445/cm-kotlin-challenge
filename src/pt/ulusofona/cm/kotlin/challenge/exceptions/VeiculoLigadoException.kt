package pt.ulusofona.cm.kotlin.challenge.exceptions

class VeiculoLigadoException(override val message: String = "O veiculo está ligado!"): Exception(message) {
}