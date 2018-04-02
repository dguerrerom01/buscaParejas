package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener,MouseListener{

	ParaUI paraUI;
	Acciones acciones;
	public MyActionListener(ParaUI paraUI, Acciones acciones) {
		this.paraUI= paraUI;
		this.acciones=acciones;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (((JButton) e.getSource()).getName() == "btnIniciar") {
			paraUI.lanzarGame();
		}
			else{
			int pulsado = Integer.valueOf(((JButton) e.getSource()).getName());
			acciones.jugada(pulsado);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

}
