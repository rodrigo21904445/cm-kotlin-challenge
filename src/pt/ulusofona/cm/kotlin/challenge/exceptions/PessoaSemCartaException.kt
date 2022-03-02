package pt.ulusofona.cm.kotlin.challenge.exceptions

class PessoaSemCartaException(override val message: String = "Nome da Pessoa não tem carta para conduzir o veículo indicado"): Exception(message) {

}