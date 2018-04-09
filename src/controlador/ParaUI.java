package controlador;

import modelo.Tablero;
import vista.BuscaParejasUI;

public class ParaUI extends BuscaParejasUI {
	Acciones acciones = new Acciones();
	MyActionListener listener = new MyActionListener(this,acciones);
	Iniciador iniciador = new Iniciador();
	Tablero tablero;
	Control control;


	public ParaUI() {
		super();
		btnIniciarGame.addActionListener(listener);
	}

	public void lanzarGame() {
		for (int i = 0; i < botonera.botones.length; i++) {
			botonera.botones[i].addActionListener(listener);
		}
		acciones.game(botonera,dificultad);
	}
}
