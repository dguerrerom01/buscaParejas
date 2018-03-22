package controlador;

import utiles.Utiles;

public enum Dificultad {
facil(Utiles.facil),medio(Utiles.medio),dificil(Utiles.dificil);
	private int valor;


	private Dificultad(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
}
