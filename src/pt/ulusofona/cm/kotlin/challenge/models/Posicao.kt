package pt.ulusofona.cm.kotlin.challenge.models

data class Posicao (private var _x: Int = 0, private var _y: Int = 0){

    fun alterarPosicaoPara(x: Int, y: Int) {
        this._x = x
        this._y = y
    }

    var x get() = _x
        set(value) {this._x = value}

    var y get() = _y
        set(value) {this._y = value}


    override fun toString(): String {
        val separator: String = " | "
        return "Posicao".plus(separator).plus(this._x.toString()).plus(separator).plus(this._y.toString())
    }
}
