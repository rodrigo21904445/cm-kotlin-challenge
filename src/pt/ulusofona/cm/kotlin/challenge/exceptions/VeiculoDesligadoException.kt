package pt.ulusofona.cm.kotlin.challenge.exceptions

class VeiculoDesligadoException(override val message: String = "O veiculo já se encontra desligado!"): Exception(message) {
}