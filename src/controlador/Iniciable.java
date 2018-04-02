package controlador;

import modelo.Tablero;

public interface Iniciable {
	

	/**
	 * crea el tablero y asigna numeros a sus cartas, el tablero no puede ser nulo, el tablero tiene que tener cartas con id´s, la dificultad no puede ser nula
	 * @param dificultad numero de parejas
	 * @return 
	 */
	//asert dificultad > 0 && != null
	public Tablero crearTablero(Dificultad dificultad);
}
