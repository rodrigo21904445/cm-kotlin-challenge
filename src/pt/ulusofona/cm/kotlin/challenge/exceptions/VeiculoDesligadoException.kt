package pt.ulusofona.cm.kotlin.challenge.exceptions

class VeiculoDesligadoException(override val message: String = "O veiculo está desligado!"): Exception(message) {
}