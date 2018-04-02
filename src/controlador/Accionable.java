package controlador;

import modelo.Tablero;
import vista.Botonera;

public interface Accionable {

	/**
	 * inicia el juego, creando el tablero y su botonera dependiendo de la dificultad, tambien crea las referencias a las imagenes
	 */
	public void game(Botonera botonera, Dificultad dificultad);
	
	
	/**
	 * funcionamiento del click izquierdo
	 */
	public	void accionClickIzquierdo(int pulsado);


	/**
	 * lleva el ritmo del juego, mientras no ganes o pierdas se sigue ejecutando
	 */
	void jugada(int pulsado);


	





	


	


	
}
