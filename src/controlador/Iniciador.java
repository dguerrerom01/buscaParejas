package controlador;

import modelo.Tablero;

public class Iniciador implements Iniciable{
	Control control=new Control();
	@Override
	public Tablero crearTablero(Dificultad dificultad) {
		return control.ponerIDCarta(dificultad);
		// TODO crea el tablero
		
	}

}
