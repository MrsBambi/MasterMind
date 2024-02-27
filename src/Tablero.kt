/**
 * Tablero de juego
 *
 * @constructor Create empty Tablero
 */
class Tablero {
    var coloresGenerados = Array(4){Colores.values().random().toString()}
    var tablero = Array(5){Array(4){""}}
    var pista = Array(5){Array(4){""}}

    /**
     * Mostrar pista al jugador
     *
     * @param player
     * @param turno
     * @return
     */
    fun mostrarPista (player : Jugador, turno: Int) : Boolean {
        var aciertos = 0
        for (i in this.coloresGenerados.indices){
                if (coloresGenerados[i] == player.colores[i]){
                    pista[turno-1][i] = "="
                    aciertos++
                } else if (coloresGenerados.contains(player.colores[i])) {
                    pista[turno-1][i] = "~"
                } else {
                    pista[turno-1][i] = "-"
                }
        }
        println()
        return aciertos == 4
    }

    /**
     * Mostrar tablero al jugador
     *
     */
    fun mostrarTablero () {
        for (i in tablero.indices) {
            for (j in tablero[i].indices){
                print("[ " + tablero[i][j] + " ] ")
            }
            print(" || Pista-> ")
                for (j in pista[i].indices) {
                    print("[ " +pista[i][j]+ " ] ")
                }
            println()
        }
    }

    /**
     * Rellenar tablero
     *
     * @param player
     * @param turno
     */
    fun rellenarTablero (player: Jugador, turno: Int) {
            for (j in tablero[0].indices){
               this.tablero[turno-1][j] = player.colores[j]
            }
    }

}