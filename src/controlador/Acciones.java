package controlador;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

import modelo.Carta;
import modelo.Tablero;
import utiles.Utiles;
import vista.Botonera;

public class Acciones implements Accionable {
	Iniciador iniciador = new Iniciador();
	Control control = new Control();
	Tablero tablero;
	private boolean turno = true;
	private int[][] pareja = new int[2][2]; // pareja[id cartaUno,posicion
											// cartaUno][id cartaDos, posicion
											// cartaDos]
	private Botonera botonera;
	private Carta[] cartas;
	private StringBuilder[] nombreImagenes;
	private Dificultad dificultad;

	@Override
	public void game(Botonera botonera, Dificultad dificultad) {
		assert dificultad.getValor() >= 0 && dificultad.getValor() <= 25 : "dificultad erronea";
		this.dificultad = dificultad;
		this.tablero = iniciador.crearTablero(dificultad);
		assert this.tablero != null : "el tablero esta null";
		this.botonera = botonera;
		assert this.botonera != null : "botonera null";
		this.cartas = tablero.getCartas();
		this.nombreImagenes = new StringBuilder[dificultad.getValor()];
		for (int i = 0; i < nombreImagenes.length; i++) {
			nombreImagenes[i] = new StringBuilder("/assets/");
			nombreImagenes[i].append(String.valueOf(i));
			nombreImagenes[i].append(".jpg");
		}

	}

	@Override
	public void jugada(int pulsado) {
		assert pulsado >= 0 && pulsado < dificultad.getValor() * 2 : "numeracion del boton erronea";
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
				accionTurno(pulsado, 0);
			} else {
				accionTurno(pulsado, 1);
			}
			setImage();
			if (cartaNoVacia()) {
				if (!cartasIguales()) {
					cartas[pareja[0][1]].setVelada(true);
					cartas[pareja[1][1]].setVelada(true);
					this.tablero.fallo();
				}
				pareja[0][0] = 0;
				pareja[1][0] = 0;
			}
		}
	}

	private boolean cartasIguales() {
		return pareja[0][0] == pareja[1][0];
	}

	private boolean cartaNoVacia() {
		return pareja[0][0] != 0 & pareja[1][0] != 0;
	}

	private void accionTurno(int pulsado, int id) {
		pareja[id][0] = cartas[pulsado].getId();
		cartas[pulsado].setVelada(false);
		pareja[id][1] = pulsado;
		turno = !turno;
	}

	private void setImage() {
		for (int i = 0; i < botonera.botones.length; i++) {
			if (!cartas[i].isVelada()) {
				ImageIcon asd = new ImageIcon(getClass().getResource(nombreImagenes[cartas[i].getId() - 1].toString()));
				botonera.botones[i].setIcon(Utiles.createScaledIcon(asd, botonera.botones[i].getHeight()));
			} else {
				botonera.botones[i].setIcon(null);
			}
		}
	}

}
