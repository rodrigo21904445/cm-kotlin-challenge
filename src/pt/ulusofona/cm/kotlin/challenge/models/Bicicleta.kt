package pt.ulusofona.cm.kotlin.challenge.models

class Bicicleta (private val _identificador: String): Veiculo(_identificador){

    override val identificador get() = _identificador

    override fun toString(): String {
        val separator: String = " | "
        val dataDeAquisicao = super.dataDeAquisicao
        val posicao = super.posicao
        return "Bicicleta".plus(separator).plus(_identificador).plus(separator).plus(dataDeAquisicao).plus(separator)
            .plus(posicao).plus(separator).plus(posicao)
    }
}