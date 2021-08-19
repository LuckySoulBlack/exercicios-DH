package ex.` KT 1`

// 1) Escrever o código que deve analisar três números inteiros e retornar o maiordeles.

fun  main () {
    val num1 :  Int  =  2
    val num2 :  Int  =  4
    val num3 :  Int  =  3

    if (num1 >= num2 && num1 >= num3) {
        println ( "Maior: "+ num1)
    } else {
        if (num2 >= num3) {
            println ( " Maior: "+ num2 )
        } else {
            println ( " Maior: "+ num3 )
        }
    }
}
