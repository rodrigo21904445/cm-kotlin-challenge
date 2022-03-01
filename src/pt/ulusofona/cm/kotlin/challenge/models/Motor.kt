package pt.ulusofona.cm.kotlin.challenge.models

class Motor (private val _cavalos: Int, private val _cilindrada: Int){
    var ligado: Boolean = false

    val cavalos get() = _cavalos
    val cilindrada get() = _cilindrada

    override fun toString(): String {
        val separator: String = " | "
        return "Motor".plus(separator).plus(_cavalos.toString()).plus(separator).plus(_cilindrada.toString())
    }
}
