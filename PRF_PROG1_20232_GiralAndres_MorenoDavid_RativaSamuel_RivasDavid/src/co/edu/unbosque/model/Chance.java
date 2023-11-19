package co.edu.unbosque.model;

import java.io.Serializable;

public class Chance extends JuegosDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private int numerosElegidos;
	
	public Chance(String nombreJuego, String tipoJuego, String presupuestoJuego, String[] nombre, int numerosElegidos) {
		super(nombreJuego = "Chance", tipoJuego = "Loteria", presupuestoJuego="$1.200.000.000");
		this.numerosElegidos = numerosElegidos;
	}

	public int getNumerosElegidos() {
		return numerosElegidos;
	}

	public void setNumerosElegidos(int numerosElegidos) {
		this.numerosElegidos = numerosElegidos;
	}
	
	
}
