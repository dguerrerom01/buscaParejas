package modelo;

import controlador.Dificultad;

public class Tablero {
	Carta[] cartas;

	public Tablero(Dificultad dificultad) {
		super();
		int size=dificultad.getValor();
		this.cartas=new Carta[size*2];
		for (int i = 0; i < cartas.length; i++) {
			cartas[i]=new Carta();
		}
	}

	public Carta[] getCartas() {
		return cartas;
	}

	public void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}
	
}
