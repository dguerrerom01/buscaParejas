package controlador;

import modelo.Tablero;
import vista.Botonera;

public interface Accionable {

	/**
	 * bucle que lleva el curso del juego
	 */
	public void game(Botonera botonera, Dificultad dificultad);
	
	
	/**
	 * funcionamiento del click izquierdo
	 */
	public	void accionClickIzquierdo(int pulsado);



	void jugada(int pulsado);


	





	


	


	
}
