package controlador;

import modelo.Tablero;

public interface Controlable {

	
	/**
	 * si todas estan desveladas, gana
	 * @return true si todas estan desveladas
	 */
	public boolean comprobarGana(Tablero tablero);

	/**
	 * comprueba la derrota
	 * @return false si el contador de fallos llega a 0
	 */
	public boolean comprobarPierde(Tablero tablero);
	
	/**
	 * le asigna un id a cada carta, el id solo se puede repetir 2 veces, y tiene que ser >= 0 y <dificultad
	 */
	public Tablero ponerIDCarta(Dificultad dificultad);

	
}
