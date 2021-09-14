package Enums

enum class cor( val vermelho: Int, val verde: Int, val azul: Int) {
    VERMELHO( vermelho= 255,verde= 0, azul= 0),
    LARANJA( vermelho= 255, verde=165, azul= 0),
    AMARELO( vermelho= 255, verde= 255, azul= 0),
    VERDE( vermelho= 0, verde= 255, azul= 0),
    AZUL( vermelho= 0, verde= 0, azul= 255);

    fun rgb() = ((vermelho * 256 + verde) * 256 + azul)
}

fun main () {
    val rgb = cor.VERMELHO.rgb()
    println(rgb)
}