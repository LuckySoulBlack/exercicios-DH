package `Expressão When`
//importação feita da pasta Enum a função é " cor" exercicio para este outro arquivo para execução

import Enums.cor

        fun obterMnemonica(color: cor) = when (color) {
                cor.VERMELHO -> "Ver"
                cor.AMARELO -> "Alguem"
                cor.VERDE -> "Viver"
                cor.AZUL -> "Além e legal"
                cor.LARANJA -> "Legal"

            }
// sempre quanto eu utilizar o " return" devo declarar o tipo de retorno como no local "(color: cor): String"

fun obterTemperatura (color: cor): String{
    return when(color) {
        cor.VERMELHO, cor.LARANJA, cor.AMARELO -> "Quente"
        cor.VERDE -> "Neutro"
        cor.AZUL -> "Frio"
    }
}


fun main() {
    val mNemonica = obterMnemonica(cor.VERMELHO)
    println(mNemonica)

    val temperatura = obterTemperatura(cor.VERDE)
    println(temperatura)
}