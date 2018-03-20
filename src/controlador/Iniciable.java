package controlador;

public interface Iniciable {
	

	/**
	 * crea el tablero y asigna numeros a sus cartas
	 * @param dificultad numero de parejas
	 */
	//asert dificultad > 0 && != null
	public void crearTablero(Dificultad dificultad);
}
