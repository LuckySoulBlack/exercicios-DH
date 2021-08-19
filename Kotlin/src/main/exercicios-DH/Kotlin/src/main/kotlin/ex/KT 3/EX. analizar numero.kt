package ex.`KT 3`

// 3) Escrever o código que deve analisar um número inteiro e,
// caso seja ele par, retornar verdadeiro, caso contrário, retorna falso.

fun  main () {

    analisanumerointeiro(
        divisor = 1,
        igual = 0,
        numero = 2
    )
}
fun  analisanumerointeiro ( numero : Int,divisor : Int,igual:Int ) {
    if (numero % divisor  == igual ) {
        println ( " verdadeiro " )
    } else {
        println ( " falso " )
    }
}