package pt.ulusofona.cm.kotlin.challenge.exceptions

class PessoaSemCartaException(override val message: String = "A pessoa não tem carta!"): Exception(message) {

}