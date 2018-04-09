package vista;

import javax.swing.JPanel;

import controlador.MyActionListener;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Botonera extends JPanel {

	public JButton[] botones;

	/**
	 * Create the panel.
	 */
	public Botonera(int columnas, int botones) {
		setLayout(new GridLayout(0, columnas, 5, 5));
		this.botones = new JButton[botones];
		for (int i = 0; i < this.botones.length; i++) {
			this.botones[i] = new JButton();
			this.botones[i].setName(String.valueOf(i));
			this.add(this.botones[i]);
		}

	}

}
