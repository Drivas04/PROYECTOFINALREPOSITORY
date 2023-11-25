package co.edu.unbosque.model;

import java.io.Serializable;
import java.util.ArrayList;

public class LoteriaDTO extends JuegosDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	protected ArrayList<String> nombre;
	protected String nombreL;
	private String numNumeros;
	private String numSeries;
	
	
	
	public LoteriaDTO(String nombreJuego, String tipoJuego, String presupuestoJuego) {
		super(nombreJuego = "Loteria", tipoJuego = "Loteria", presupuestoJuego = "$150.000.000.000");
	}
	
	public LoteriaDTO(String cedula, String nombreL, String numNumeros, String numSeries, String sede, String fechaApuesta, String valorAp) {
		super(cedula, sede, fechaApuesta, valorAp);
		this.nombreL = nombreL;
		this.numNumeros = numNumeros;
		this.numSeries = numSeries;
	}
	
	public LoteriaDTO(String cedula, String nombreL, String sede, String fechaApuesta, String valorAp) {
		super(cedula, sede, fechaApuesta, valorAp);
		this.nombreL = nombreL;
	}
	
	public void llenarLoterias() {
		nombre.add("LOTERIA DE BOGOTA");
		nombre.add("LOTERIA DE BOYACA");
		nombre.add("LOTERIA DEL CAUCA");
		nombre.add("LOTERIA CRUZ ROJA");
		nombre.add("LOTERIA DE CUNDINAMARCA");
		nombre.add("LOTERIA DEL HUILA");
		nombre.add("LOTERIA DE MANIZALES");
	}

	public ArrayList<String> getNombre() {
		return nombre;
	}

	public void setName(ArrayList<String> nombre) {
		this.nombre = nombre;
	}

	public String getNumNumeros() {
		return numNumeros;
	}

	public void setNumNumeros(String numNumeros) {
		this.numNumeros = numNumeros;
	}

	public String getNumSeries() {
		return numSeries;
	}

	public void setNumSeries(String numSeries) {
		this.numSeries = numSeries;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nCedula del apostador: "+getCedula()+"\nSede de apuesta: "+getSede()+"\nfecha de la apuesta: "+getFechaApuesta()+"\nValor de la apuesta: "+getValorAp()+"\nNumeros escogidos: "+getNumNumeros()+"\nNumeros de serie: "+getNumSeries();
	}
	
	
	
}
