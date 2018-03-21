package controlador;

import modelo.Tablero;

public interface Controlable {

	
	/**
	 * si todas estan desveladas, gana
	 * @return true si todas estan desveladas
	 */
	public boolean comprobarGana();

	/**
	 * comprueba la derrota
	 * @return false si el contador de fallos llega a 0
	 */
	public boolean comprobarPierde();
	
	/**
	 * le asigna el id a cada carta
	 */
	public Tablero ponerIDCarta(Dificultad dificultad);
}
