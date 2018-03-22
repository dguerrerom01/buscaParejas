package controlador;

import modelo.Carta;
import modelo.Tablero;

public class Acciones implements Accionable{
Iniciador iniciador = new Iniciador();
Control control = new Control();

	@Override
	public void game(  ) {
		Dificultad dificultad = Dificultad.dificil; // esto viene automatico
		Tablero tablero = iniciador.crearTablero(dificultad);
		// TODO botonera listener, se podria poner en la misma botonera al
		// crearlo
		Carta[] cartas = tablero.getCartas();
		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i].getId());
		}
		jugada(tablero);
	}
	
	@Override
	public void jugada(Tablero tablero) {
		// TODO jugada al clickar o en MAL

		if (control.comprobarGana(tablero)) {
			// TODO gana
		} else if (control.comprobarPierde(tablero)) {
			// TODO pierde
		}

	}

	@Override
	public void accionClickIzquierdo() {
		// TODO Auto-generated method stub	
	}

}
