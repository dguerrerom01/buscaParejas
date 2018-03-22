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
	 * le asigna el id a cada carta
	 */
	public Tablero ponerIDCarta(Dificultad dificultad);

	
}
