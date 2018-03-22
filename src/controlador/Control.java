package controlador;

import modelo.Tablero;

public class Control implements Controlable {

	@Override
	public boolean comprobarGana(Tablero tablero) {
		boolean win = false;
		for (int i = 0; i < tablero.getCartas().length; i++) {
			if (tablero.getCartas()[i].isVelada())
				win = false;
		}
		return win;
	}

	@Override
	public boolean comprobarPierde(Tablero tablero) {
		if (tablero.getIntentos() < 0)
			return true;
		else
			return false;
	}

	@Override
	public Tablero ponerIDCarta(Dificultad dificultad) {
		Tablero tablero = new Tablero(dificultad);
		int[] arrayId = CrearArrayDesordenado(dificultad.getValor() * 2);
		for (int i = 0; i < arrayId.length; i++) {
			tablero.getCartas()[i].setId(arrayId[i]);
		}
		return tablero;
	}

	private int[] CrearArrayDesordenado(int dificultad) {
		return desordenarArray(crearArrayNumeros(dificultad));
	}

	private static int[] crearArrayNumeros(int dificultad) {
		int[] array = new int[dificultad];
		for (int i = 0, k = 1; i < array.length; i++, k++) {
			if (i == array.length / 2) {
				k = 1;
			}
			array[i] = k;
		}
		return array;
	}

	private static int[] desordenarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int t = array[i];
			int y = (int) (Math.random() * array.length);
			array[i] = array[y];
			array[y] = t;
		}
		return array;
	}



}
