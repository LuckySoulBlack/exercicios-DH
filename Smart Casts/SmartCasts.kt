package `Smart Casts`

// ( 1 + 2 ) + 4

interface Expressão

class Numero( val valor: Int) : Expressão
class Soma( val esquerdo: Expressão, val direita: Expressão) : Expressão

fun avaliacao( expressao: Expressão): Int {
    if (expressao is Numero){
        return expressao.valor
    }
    if (expressao is Soma) {
        return avaliacao(expressao.esquerdo) + avaliacao(expressao.direita)
    }
    throw IllegalArgumentException("Expressao e desconhecida")
}
// ( 1 + 2 ) + 4 = 7
fun main() {
    val resultado = avaliacao(Soma(Soma(Numero(valor = 1),Numero(valor = 2)),Numero(valor = 4)))
    println(resultado)
}

