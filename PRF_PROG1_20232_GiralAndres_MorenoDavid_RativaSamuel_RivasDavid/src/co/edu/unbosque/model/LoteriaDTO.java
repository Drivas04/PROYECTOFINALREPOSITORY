package co.edu.unbosque.model;

import java.io.Serializable;

public class LoteriaDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private String name;
	private int id;
	private int numNumeros;
	private int numSeries;
	
	public LoteriaDTO() {
		
	}
	
	public LoteriaDTO(String name, int id, int numNumeros, int numSeries) {
		this.name = name;
		this.id = id;
		this.numNumeros = numNumeros;
		this.numSeries = numSeries;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
