package pt.ulusofona.cm.kotlin.challenge.models

class Posicao (private var _x: Int = 0, private var _y: Int = 0){

    fun alterarPosicaoPara(x: Int, y: Int) {
        this._x = x
        this._y = y
    }

    val x get() = _x
    val y get() = _y


    override fun toString(): String {
        val separator: String = " | "
        return "Posicao".plus(separator).plus(this._x.toString()).plus(separator).plus(this._y.toString())
    }
}
