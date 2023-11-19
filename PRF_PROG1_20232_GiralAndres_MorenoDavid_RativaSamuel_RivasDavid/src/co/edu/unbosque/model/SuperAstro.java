package co.edu.unbosque.model;

import java.io.Serializable;

public class SuperAstro extends JuegosDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private int numCifras;
	private String[] signoZodiacal = {"ARIES", "TAURO", "GEMINIS", "CANCER", "LEO", "VIRGO", "LIBRA", "ESCORPIO","SAGITARIO","CAPRICORNIO", "ACUARIO","PISCIS"};
	
	public SuperAstro(String nombreJuego , String tipoJuego, String presupuestoJuego, int numCifras, String[] signoZodiacal) {
		super(nombreJuego = "SuperAstro", tipoJuego = "Loteria", presupuestoJuego="$4.000.000.000");
		this.numCifras = numCifras;
		this.signoZodiacal = signoZodiacal;
	}
	

	public int getNumCifras() {
		return numCifras;
	}

	public void setNumCifras(int numCifras) {
		this.numCifras = numCifras;
	}

	public String[] getSignoZodiacal() {
		return signoZodiacal;
	}

	public void setSignoZodiacal(String[] signoZodiacal) {
		this.signoZodiacal = signoZodiacal;
	}
	
	
}
