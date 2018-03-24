package controlador;

import java.awt.Color;

import modelo.Carta;
import modelo.Tablero;
import vista.Botonera;

public class Acciones implements Accionable {
	Iniciador iniciador = new Iniciador();
	Control control = new Control();
	Tablero tablero;
	private boolean turno = true;
	private int[][] pareja = new int[2][2]; // pareja[id cartaUno,posicion cartaUno][id cartaDos, posicion cartaDos]
	private Botonera botonera;
	private Carta[] cartas;
	private Color[] colores;

	@Override
	public void game(Botonera botonera, Dificultad dificultad) {
		this.tablero = iniciador.crearTablero(dificultad);
		this.botonera = botonera;
		this.cartas = tablero.getCartas();
		this.colores = new Color[25];
		for (int i = 0; i < colores.length; i++) {
			colores[i] = new Color((int) (Math.random() * 255), (int) (Math.random() * 255),
					(int) (Math.random() * 255));
		}

	}

	@Override
	public void jugada(int pulsado) {
		accionClickIzquierdo(pulsado);
		if (control.comprobarGana(this.tablero)) {
			for (int i = 0; i < botonera.botones.length; i++) {
				botonera.botones[i].setVisible(true);
			}
		} else if (control.comprobarPierde(this.tablero)) {
			botonera.setVisible(false);
		}
	}

	@Override
	public void accionClickIzquierdo(int pulsado) {
		if (cartas[pulsado].isVelada()) {
			if (turno) {
				pareja[0][0] = cartas[pulsado].getId();
				cartas[pulsado].setVelada(false);
				pareja[0][1] = pulsado;
				turno = false;
			} else {
				pareja[1][0] = cartas[pulsado].getId();
				cartas[pulsado].setVelada(false);
				pareja[1][1] = pulsado;
				turno = true;
			}

			ponerNumeros();
			System.out.println("la carta actual es " + pareja[0][0] + " " + pareja[1][0]);
			if (pareja[0][0] != 0 & pareja[1][0] != 0) {
				if (pareja[0][0] == pareja[1][0]) {
					System.out.println("pareja");
				} else {
					System.out.println("no pareja");
					cartas[pareja[0][1]].setVelada(true);
					cartas[pareja[1][1]].setVelada(true);
					this.tablero.fallo();
				}

				pareja[0][0] = 0;
				pareja[1][0] = 0;
				actualizarTablero();
			}
		}
	}

	private void ponerNumeros() {
		// Color[]
		// colores={Color.BLACK,Color.blue,Color.cyan,Color.DARK_GRAY,Color.gray,Color.GREEN,Color.LIGHT_GRAY,Color.MAGENTA,Color.ORANGE,Color.PINK,Color.RED,Color.white,Color.YELLOW
		// };
		// el array de imagenes seria algo aprecido a esto
		for (int i = 0; i < botonera.botones.length; i++) {
			if (!cartas[i].isVelada()) {
				botonera.botones[i].setBackground(colores[cartas[i].getId() - 1]);
			} else {
				botonera.botones[i].setBackground(null);
			}
		}
	}

	private void actualizarTablero() {
		for (int i = 0; i < botonera.botones.length; i++) {
			if (!cartas[i].isVelada()) {
				botonera.botones[i].setVisible(false);
			}
		}
	}

}
