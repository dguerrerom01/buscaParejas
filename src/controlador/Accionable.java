package controlador;

import modelo.Tablero;

public interface Accionable {

	/**
	 * bucle que lleva el curso del juego
	 */
	public void game(Tablero tablero);
	
	
	/**
	 * funcionamiento del click izquierdo
	 */
	public void accionClickIzquierdo();


	public void jugada();


	
}
