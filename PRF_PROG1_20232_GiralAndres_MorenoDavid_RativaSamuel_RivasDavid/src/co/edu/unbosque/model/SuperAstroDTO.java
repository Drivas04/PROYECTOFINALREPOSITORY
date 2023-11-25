package co.edu.unbosque.model;

import java.io.Serializable;
import java.util.ArrayList;

public class SuperAstroDTO extends JuegosDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String numCifras;
	private ArrayList<String> signoZodiacal;
	private String signo;
	
	public SuperAstroDTO(String nombreJuego , String tipoJuego, String presupuestoJuego) {
		super(nombreJuego = "SuperAstro", tipoJuego = "Loteria", presupuestoJuego="$4.000.000.000");
	}
	
	public SuperAstroDTO(String cedula, String numCifras, String signoZodiacal, String sede, String fechaApuesta, String valorAp) {
		super(cedula, sede, fechaApuesta, valorAp);
		this.numCifras = numCifras;
		this.signo = signoZodiacal;
	}
	
	public void llenarSignos() {
		signoZodiacal.add("ARIES");
		signoZodiacal.add("TAURO");
		signoZodiacal.add("GEMINIS");
		signoZodiacal.add("CANCER");
		signoZodiacal.add("LEO");
		signoZodiacal.add("VIRGO");
		signoZodiacal.add("LIBRA");
		signoZodiacal.add("ESCORPIO");
		signoZodiacal.add("SAGITARIO");
		signoZodiacal.add("CAPRICORNIO");
		signoZodiacal.add("ACUARIO");
		signoZodiacal.add("PISCIS");
	}

	public String getNumCifras() {
		return numCifras;
	}

	public void setNumCifras(String numCifras) {
		this.numCifras = numCifras;
	}

	public ArrayList<String> getSignoZodiacal() {
		return signoZodiacal;
	}

	public void setSignoZodiacal(ArrayList<String> signoZodiacal) {
		this.signoZodiacal = signoZodiacal;
	}
	
	
	public String getSigno() {
		return signo;
	}

	public void setSigno(String signo) {
		this.signo = signo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nCedula del apostador: "+getCedula()+"\nSede de apuesta: "+getSede()+"\nfecha de la apuesta: $"+getFechaApuesta()+"\nValor de la apuesta: "+getValorAp()+"\nNumeros escogidos: "+getNumCifras()+"\nNumeros de serie: "+getSigno();
	}
}
