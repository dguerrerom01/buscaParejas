package controlador;

import modelo.Tablero;

public class Acciones implements Accionable{
Iniciador iniciador = new Iniciador();
Control control = new Control();

	@Override
	public void game(Tablero tablero) {
		Dificultad dificultad = Dificultad.dificil; // esto viene automatico
		tablero = iniciador.crearTablero(dificultad);
		// TODO botonera listener, se podria poner en la misma botonera al
		// crearlo
		jugada();
	}
	
	@Override
	public void jugada() {
		//TODO jugada al clickar o en MAL
		
		if (control.comprobarGana()) {
			// TODO gana
		} else if (control.comprobarPierde()) {
			// TODO pierde
		}
		
	}

	@Override
	public void accionClickIzquierdo() {
		// TODO Auto-generated method stub	
	}

}
