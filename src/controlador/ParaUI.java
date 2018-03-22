package controlador;

import modelo.Tablero;
import vista.UITest;

public class ParaUI extends UITest {
	MyActionListener listener = new MyActionListener(this);
	Iniciador iniciador = new Iniciador();
	Tablero tablero;
	Control control;
	Acciones acciones = new Acciones();
	public ParaUI() {
		super();
		// boton de "start game"
		btnIniciarGame.addActionListener(listener);
	}

	public void lanzarGame() {
		acciones.game();
	}


}
