package controlador;

import modelo.Tablero;

public class Control implements Controlable{

	@Override
	public boolean comprobarGana() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean comprobarPierde() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Tablero ponerIDCarta(Dificultad dificultad) {
		Tablero tablero = new Tablero(dificultad);
		// TODO metodo fran
		return tablero;
		
	}
	
	
}
