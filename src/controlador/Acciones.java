package controlador;

import java.awt.Color;

import javax.swing.ImageIcon;

import modelo.Carta;
import modelo.Tablero;
import utiles.Utiles;
import vista.Botonera;

public class Acciones implements Accionable {
	Iniciador iniciador = new Iniciador();
	Control control = new Control();
	Tablero tablero;
	private boolean turno = true;
	private int[][] pareja = new int[2][2]; // pareja[id cartaUno,posicion cartaUno][id cartaDos, posicion cartaDos]
	private Botonera botonera;
	private Carta[] cartas;
	private StringBuilder[] nombreImagenes;

	@Override
	public void game(Botonera botonera, Dificultad dificultad) {
		this.tablero = iniciador.crearTablero(dificultad);
		this.botonera = botonera;
		this.cartas = tablero.getCartas();
		this.nombreImagenes=new StringBuilder[dificultad.getValor()];
		for (int i = 0; i < nombreImagenes.length; i++) {
			nombreImagenes[i]= new StringBuilder("/assets/");
			nombreImagenes[i].append(String.valueOf(i));
			nombreImagenes[i].append(".jpg");
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
			if (pareja[0][0] != 0 & pareja[1][0] != 0) {
				if (pareja[0][0] == pareja[1][0]) {
					
				} else {
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
		for (int i = 0; i < botonera.botones.length; i++) {
			if (!cartas[i].isVelada()) {
				ImageIcon asd = new ImageIcon(getClass().getResource(nombreImagenes[cartas[i].getId()-1].toString()));
				botonera.botones[i].setIcon(Utiles.createScaledIcon(asd, botonera.botones[i].getHeight()));
			} else {
				botonera.botones[i].setIcon(null);
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
