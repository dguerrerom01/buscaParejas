package vista;


import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Dificultad;
import utiles.Utiles;

import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class BuscaParejasUI extends JFrame {

	private JPanel contentPane;
	private JPanel tablero;
	protected Botonera botonera;
	private JLabel label;
	private JLabel lblMensaje;
	private JPanel juego;
	protected JButton btnIniciarGame;
	protected Dificultad dificultad;

	public BuscaParejasUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 280, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		juego = new JPanel();
		contentPane.add(juego, "name_juego");

		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, 0.0, 1.0, Double.MIN_VALUE };
		juego.setLayout(gbl_panel);

		JLabel lblJuegoParejas = new JLabel("Busca Parejas");
		lblJuegoParejas.setFont(new Font("Tahoma", Font.BOLD, 28));
		GridBagConstraints gbc_lblJuegoParejas = new GridBagConstraints();
		gbc_lblJuegoParejas.gridwidth = 3;
		gbc_lblJuegoParejas.insets = new Insets(0, 0, 5, 0);
		gbc_lblJuegoParejas.gridx = 0;
		gbc_lblJuegoParejas.gridy = 0;
		juego.add(lblJuegoParejas, gbc_lblJuegoParejas);

		JButton btnFacil = new JButton("Facil");
		btnFacil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnIniciarGame.setVisible(true);
				dificultad=Dificultad.facil;
				crearTablero(5, Utiles.facil * 2);
			}
		});
		
		btnIniciarGame = new JButton("iniciar");
		btnIniciarGame.setName("btnIniciar");
		btnIniciarGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				((CardLayout) contentPane.getLayout()).show(contentPane, "name_tablero");
			}
		});
		btnIniciarGame.setBorderPainted(false);
		btnIniciarGame.setVisible(false);
		btnIniciarGame.setOpaque(false);
		GridBagConstraints gbc_btnIniciarGame = new GridBagConstraints();
		gbc_btnIniciarGame.insets = new Insets(0, 0, 5, 5);
		gbc_btnIniciarGame.gridx = 1;
		gbc_btnIniciarGame.gridy = 1;
		juego.add(btnIniciarGame, gbc_btnIniciarGame);
		GridBagConstraints gbc_btnFacil = new GridBagConstraints();
		gbc_btnFacil.insets = new Insets(0, 0, 0, 5);
		gbc_btnFacil.gridx = 0;
		gbc_btnFacil.gridy = 2;
		juego.add(btnFacil, gbc_btnFacil);

		JButton btnMedio = new JButton("Medio");
		btnMedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnIniciarGame.setVisible(true);
				dificultad=Dificultad.medio;
				crearTablero(10, Utiles.medio * 2);
			}
		});
		GridBagConstraints gbc_btnMedio = new GridBagConstraints();
		gbc_btnMedio.insets = new Insets(0, 0, 0, 5);
		gbc_btnMedio.gridx = 1;
		gbc_btnMedio.gridy = 2;
		juego.add(btnMedio, gbc_btnMedio);

		JButton btnDificil = new JButton("Dificil");
		btnDificil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnIniciarGame.setVisible(true);
				dificultad=Dificultad.dificil;
				crearTablero(10, Utiles.dificil * 2);
			}
		});
		GridBagConstraints gbc_btnDificil = new GridBagConstraints();
		gbc_btnDificil.gridx = 2;
		gbc_btnDificil.gridy = 2;
		juego.add(btnDificil, gbc_btnDificil);
	}

	private void crearTablero(int columnas, int botones) {
		tablero = new JPanel();
		contentPane.add(tablero, "name_tablero");
		GridBagLayout gbl_Tablero = new GridBagLayout();
		gbl_Tablero.columnWidths = new int[] { 0, 0 };
		gbl_Tablero.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_Tablero.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_Tablero.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		tablero.setLayout(gbl_Tablero);

		label = new JLabel("Busca Parejas");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		tablero.add(label, gbc_label);

		botonera = new Botonera(columnas, botones);
		GridBagConstraints gbc_botonera = new GridBagConstraints();
		gbc_botonera.insets = new Insets(0, 0, 5, 0);
		gbc_botonera.fill = GridBagConstraints.BOTH;
		gbc_botonera.gridx = 0;
		gbc_botonera.gridy = 1;
		tablero.add(botonera, gbc_botonera);

		lblMensaje = new JLabel(" ");
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblMensaje = new GridBagConstraints();
		gbc_lblMensaje.gridx = 0;
		gbc_lblMensaje.gridy = 2;
		tablero.add(lblMensaje, gbc_lblMensaje);
	}

}
