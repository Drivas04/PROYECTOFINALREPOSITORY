package co.edu.unbosque.model;

import java.io.Serializable;

public class Chance extends Loteria implements Serializable{

	private static final long serialVersionUID = 1L;

	private int numerosElegidos;
	
	public Chance(String nombreJuego, String tipoJuego, double presupuestoJuego, String[] nombre, int numerosElegidos) {
		super(nombreJuego = "Chance", tipoJuego = "Chance", presupuestoJuego, nombre, 0, 0);
		this.numerosElegidos = numerosElegidos;
	}

	public int getNumerosElegidos() {
		return numerosElegidos;
	}

	public void setNumerosElegidos(int numerosElegidos) {
		this.numerosElegidos = numerosElegidos;
	}
	
	
}
