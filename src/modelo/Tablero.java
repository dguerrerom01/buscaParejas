package modelo;

import controlador.Dificultad;

public class Tablero {
	Carta[] cartas;

	public Tablero(Dificultad dificultad) {
		super();
		int size=0;
		switch(dificultad) {
		case facil:
			size=5;
			break;
		case medio:
			size=15;
			break;
		case dificil:
			size=25;
			break;
		}
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
