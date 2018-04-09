package modelo;

import controlador.Dificultad;
import utiles.Utiles;

public class Tablero {
	Carta[] cartas;
	int intentos;

	public Tablero(Dificultad dificultad) {
		super();
		this.cartas=new Carta[dificultad.getValor()*2];
		this.intentos=(int) (dificultad.getValor()*4);
		for (int i = 0; i < cartas.length; i++) {
			cartas[i]=new Carta();
		}
	}

	public int getIntentos() {
		return intentos;
	}


	public Carta[] getCartas() {
		return cartas;
	}

	public void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}

	public void fallo() {
		this.intentos--;
		
	}
	
}
