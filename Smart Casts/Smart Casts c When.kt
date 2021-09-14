package `Smart Casts c when`

interface ExpressãoWhen

class Numero( val valor: Int) : ExpressãoWhen
class Soma( val esquerdo: ExpressãoWhen, val direita: ExpressãoWhen) : ExpressãoWhen

// en vez de utilizar este modelo de bloco podemos resumir com o "When"

//fun avaliacao( expressao: ExpressãoWhen): Int {
//    if (expressao is Numero){
//        return expressao.valor
//    }
//    if (expressao is Soma) {
//        return avaliacao(expressao.esquerdo) + avaliacao(expressao.direita)
//    }
//    throw IllegalArgumentException("Expressao e desconhecida")
//}
// ficando assim :
fun avaliacao( expressao: ExpressãoWhen) =
    when(expressao) {
        is Numero -> {
            ´println()
            expressao.valor
        }
        is Soma -> {
            (expressao.esquerdo + expressao.direita)
        }
        else -> {
            throw IllegalArgumentException("Expressao e desconhecida")
        }
    }
//            println("Expressão com numero: ${ expressao.valor}" )
// ( 1 + 2 ) + 4 = 7
fun main() {
    val Resultado = avaliacao(Soma(Numero(valor = 1),Numero( valor = 2)),Numero(valor = 4))
    println(Resultado)

}
