package co.edu.unbosque.model;

import java.io.Serializable;

public class Loteria extends JuegosDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	protected String[] nombre = {"Lotería de Bogotá", "Lotería de Boyacá", "Lotería del Cauca"+ "Lotería Cruz Roja"+ "Lotería de Cundinamarca",
			"Lotería del Huila"+ "Lotería de Manizales"+ "Extra de Colombia"};
	private int id;
	private int numNumeros;
	private int numSeries;
	
	public Loteria(String nombreJuego, String tipoJuego, String presupuestoJuego, String[] nombre, int numNumeros, int numSeries) {
		super(nombreJuego = "Loteria", tipoJuego = "Loteria", presupuestoJuego = "$150.000.000.000");
		this.nombre = nombre;
		this.numNumeros = numNumeros;
		this.numSeries = numSeries;
	}

	public String[] getNombre() {
		return nombre;
	}

	public void setName(String[] nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumNumeros() {
		return numNumeros;
	}

	public void setNumNumeros(int numNumeros) {
		this.numNumeros = numNumeros;
	}

	public int getNumSeries() {
		return numSeries;
	}

	public void setNumSeries(int numSeries) {
		this.numSeries = numSeries;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
}
