package ex.` KT 2`

import kotlin.String.Companion as String1

// 2) Escrever o código que deve analisar duas cadeias de texto e, _
// _caso são diferentes, retornar true, ou, caso sejam iguais, retornar false.

fun  main () {
    val texto01 =  " texto "
    val texto02 =  " textO "
    println (comparar(texto01, texto02))
}

fun comparar(texto01: String, texto02: String): Boolean {
    return texto01 == texto02

}

