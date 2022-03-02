package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import java.time.ZoneId

import java.util.*
import java.time.LocalDate
import java.time.Period

import pt.ulusofona.cm.kotlin.challenge.exceptions.MenorDeIdadeException
import pt.ulusofona.cm.kotlin.challenge.exceptions.PessoaSemCartaException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Pessoa (val nome: String, val dataDeNascimento: Date): Movimentavel {

    var _veiculos = mutableListOf<Veiculo>()
        //set(value) = this.veiculos = value
        val veiculos get() = _veiculos

    var carta: Carta? = null
    val posicao: Posicao = Posicao()

    override fun toString(): String {
        val separator: String = " | "
        return "Pessoa".plus(separator).plus(nome).plus(separator).plus(dataDeNascimento).plus(separator)
            .plus(posicao)
    }

    override fun moverPara(x: Int, y: Int) {

        if(posicao.x == x && posicao.y == y) {
            throw AlterarPosicaoException()
        }

        posicao.x = x
        posicao.y = y
    }

    fun comprarVeiculo(veiculo: Veiculo) {
        veiculo.dataDeAquisicao = Calendar.getInstance().time
        _veiculos.add(veiculo)
    }

    fun pesquisarVeiculo(identificador: String): Veiculo {

        for(v in _veiculos) {
            if(v.identificador == identificador) {
                return v
            }
        }

        return throw VeiculoNaoEncontradoException()
    }

    fun venderVeiculo(identificador: String, comprador: Pessoa) {
        for(v in _veiculos) {
            if(v.identificador == identificador) {
                v.dataDeAquisicao = Calendar.getInstance().time
                comprador.veiculos.add(v)
                veiculos.remove(v)
            }
        }
    }

    fun moverVeiculoPara(identificador: String, x: Int, y: Int) {

        if(!temCarta()) {
            throw PessoaSemCartaException()
        }

        for(v in _veiculos) {
            if(v.identificador == identificador) {

                if(v.posicao.x == x && v.posicao.y == y) {
                    throw AlterarPosicaoException()
                }

                return v.posicao.alterarPosicaoPara(x, y)
            }
        }
    }

    fun temCarta(): Boolean {
        if(carta == null) {
            return false;
        }

        return true;
    }

    fun tirarCarta() {
        //val todaysDate = LocalDate.now()
        //val yearDiff = Period.between(this.dataDeNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), todaysDate).years
        val age = calculateAge()

        if(age >= 18) {
            carta = Carta()
        } else {
            throw MenorDeIdadeException()
        }
    }

    fun calculateAge(): Int {
        val todaysDate = LocalDate.now()
        val yearDiff = Period.between(this.dataDeNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), todaysDate).years

        return yearDiff
    }

}