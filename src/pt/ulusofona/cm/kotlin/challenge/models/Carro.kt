package pt.ulusofona.cm.kotlin.challenge.models

class Carro (private val _identificador: String, private val _motor: Motor): Veiculo(_identificador){
    override val identificador get() = _identificador
    val motor get() = _motor

    override fun toString(): String {
        val separator: String = " | "
        val dataDeAquisicao = super.dataDeAquisicao
        val posicao = super.posicao
        return "Carro".plus(separator).plus(_identificador).plus(separator).plus(dataDeAquisicao).plus(separator)
            .plus(posicao).plus(separator).plus(posicao)
    }
}