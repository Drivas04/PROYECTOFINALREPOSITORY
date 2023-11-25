package co.edu.unbosque.model;

import java.io.Serializable;

public class BalotoDTO extends JuegosDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String numCifras;
	
	public BalotoDTO(String nombreJuego, String tipoJuego, String presupuestoJuego) {
		super(nombreJuego = "Baloto", tipoJuego = "Loteria", presupuestoJuego = "$480.000.000");
		
	}
	
	public BalotoDTO(String numCifras, String cedula, String sede, String fechaApuesta, String valorAp) {
		super(cedula, sede, fechaApuesta, valorAp);
		this.numCifras =numCifras;
		
	}
	
	public String getNumCifras() {
		return numCifras;
	}

	public void setNumCifras(String numCifras) {
		this.numCifras = numCifras;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nCedula del apostador: "+getCedula()+"\nSede de apuesta: "+getSede()+"\nfecha de la apuesta: "+getFechaApuesta()+"\nValor de la apuesta: "+getValorAp()+"\nNumeros escogidos: "+getNumCifras();
	}
	
	
}
