package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class UITest extends JFrame {

	private JPanel contentPane;
	protected JButton btnIniciarGame;

	/**
	 * Create the frame.
	 */
	public UITest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(5, 10, 0, 0));
		
		btnIniciarGame = new JButton("New button");
		btnIniciarGame.setName("btnIniciar");
		contentPane.add(btnIniciarGame, BorderLayout.SOUTH);
		
		for (int i = 0; i < 50; i++) {//dificultad*2
			JButton button = new JButton("");
			button.setName(String.valueOf(i));
			panel.add(button);
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(button.getName());
				}
			});
		}
	}

}
