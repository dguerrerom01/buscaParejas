package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener,MouseListener{

	ParaUI paraUI;
	Acciones acciones = new Acciones();
	public MyActionListener(ParaUI paraUI) {
		this.paraUI=new ParaUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (((JButton) e.getSource()).getName() == "btnIniciar") {
			paraUI.game();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton()==1) {
			acciones.jugada();//TODO aqui o en acciones
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

}
