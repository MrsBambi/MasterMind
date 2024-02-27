/**
 * Jugador
 *
 * @constructor Create empty Jugador
 */
class Jugador {
    var colores = Array(4){""}

    /**
     * Elegir color
     *
     */
    fun elegirColor () {
        var num = 1
        for (i in this.colores.indices) {
            var eleccion : String

            println("Los colores validos son: ")
            println("[AZUL][VERDE][ROJO][ROSA][AMARILLO][MAGENTA]")
            do {
                print("\nIntroduce el " + num + "ª color: ")
                eleccion = readln().uppercase()
                when (eleccion) {
                    "AZUL" -> colores[i] = Colores.AZUL.toString()
                    "ROJO" -> colores[i] = Colores.ROJO.toString()
                    "VERDE" -> colores[i] = Colores.VERDE.toString()
                    "ROSA" -> colores[i] = Colores.ROSA.toString()
                    "AMARILLO" -> colores[i] = Colores.AMARILLO.toString()
                    "MAGENTA" -> colores[i] = Colores.MAGENTA.toString()
                    else -> print("\n Introduce uno de los colores validos")
                }
            } while (this.colores[i].isBlank() || this.colores[i].isEmpty())
            num++
        }
    }
}