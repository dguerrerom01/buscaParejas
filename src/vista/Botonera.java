package vista;

import javax.swing.JPanel;

import java.awt.GridLayout;

import javax.swing.JButton;

public class Botonera extends JPanel {

	public JButton[] botones;

	/**
	 * Create the panel.
	 */
	public Botonera(int columnas, int botones) {
		this.botones = new JButton[botones];
		for (int i = 0; i < this.botones.length; i++) {
			this.botones[i] = new JButton();
			this.botones[i].setName(String.valueOf(i));
			this.add(this.botones[i]);
		}

	}

}
