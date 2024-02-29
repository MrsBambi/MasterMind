/**
 * Main
 *
 */
fun main() {
    var player = Jugador()
    var tablero = Tablero()
    var exit : Boolean
    var turno = 1

    do {
        println("Turno $turno:")
        player.elegirColor()
        tablero.rellenarTablero(player, turno)
        exit = tablero.mostrarPista(player, turno)
        tablero.mostrarTablero()
        turno++
    } while (!exit && turno <5)
    if (exit){
        println("¡¡¡Enhorabuena has ganado el juego!!!")
    } else {
        println("Has perdido los juego, te deseo suerte para la proxima. ;)")
    }
}