package modelo;

public class Carta {
	public Carta() {
		super();
		this.velada = true;
	}
	int id;
	boolean velada;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isVelada() {
		return velada;
	}
	public void setVelada(boolean velada) {
		this.velada = velada;
	}
	
}
