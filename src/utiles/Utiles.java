package utiles;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Utiles {
	public static final int facil=5;
	
	public static final int medio=15;

	public static final int dificil=25;

	public static Icon createScaledIcon(ImageIcon Imagen, int height) {
		return new ImageIcon(Imagen.getImage().getScaledInstance(height - 2, height - 2, Image.SCALE_SMOOTH));

		}
}
