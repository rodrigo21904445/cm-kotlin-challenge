package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.models.Pessoa
import java.sql.Date
import java.time.LocalDate
import java.time.ZoneId
import java.time.format.DateTimeFormatter

fun main() {
    val formatter = DateTimeFormatter.ofPattern("dd MM yyyy")
    val text: String = LocalDate.now().format(formatter)
    val dataDeNascimento = LocalDate.parse(text, formatter)

    val pessoa: Pessoa = Pessoa("Rodrigo", Date.from(dataDeNascimento.atStartOfDay(ZoneId.systemDefault()).toInstant()))
    pessoa.tirarCarta()
}