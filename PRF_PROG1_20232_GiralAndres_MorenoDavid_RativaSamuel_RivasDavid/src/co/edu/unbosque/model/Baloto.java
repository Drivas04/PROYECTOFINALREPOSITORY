package co.edu.unbosque.model;

import java.io.Serializable;

public class Baloto extends JuegosDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private int numCifras = 6;
	
	public Baloto(String nombreJuego, String tipoJuego, double presupuestoJuego, int numCifras) {
		super(nombreJuego = "Baloto", tipoJuego = "Loteria", presupuestoJuego = 480000000);
		this.numCifras =numCifras;
	}
	
	public int getNumCifras() {
		return numCifras;
	}

	public void setNumCifras(int numCifras) {
		this.numCifras = numCifras;
	}
	
	
}
