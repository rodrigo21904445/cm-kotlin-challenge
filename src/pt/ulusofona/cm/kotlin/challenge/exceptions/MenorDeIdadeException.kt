package pt.ulusofona.cm.kotlin.challenge.exceptions

class MenorDeIdadeException(override val message: String = "A pessoa é menor de idade!"): Exception(message) {

}