package controlador;

public interface Jugable {
	
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
	 * bucle que lleva el curso del juego
	 */
	public void game();
}
