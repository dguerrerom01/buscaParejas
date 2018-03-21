package controlador;

public enum Dificultad {
facil(5),medio(15),dificil(25);
	private int valor;


	private Dificultad(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
}
