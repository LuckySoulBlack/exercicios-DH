package `assessores customizados`

class retangulo (val altura: Int, val largura: Int) {
    val isQuadrado
    get() = altura == largura
}
fun main (){
    val retangulo = retangulo(altura = 10, largura = 10)
    println (retangulo.isQuadrado)
}


