package controlador;

import modelo.Tablero;

public interface Iniciable {
	

	/**
	 * crea el tablero y asigna numeros a sus cartas
	 * @param dificultad numero de parejas
	 * @return 
	 */
	//asert dificultad > 0 && != null
	public Tablero crearTablero(Dificultad dificultad);
}
