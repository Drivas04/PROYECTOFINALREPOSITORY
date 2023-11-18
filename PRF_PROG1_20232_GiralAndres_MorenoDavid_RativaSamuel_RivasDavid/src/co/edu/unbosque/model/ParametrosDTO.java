package co.edu.unbosque.model;

import java.io.Serializable;

import co.edu.unbosque.model.persistence.PropiedadesCasasDeApuestas;

public class ParametrosDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private PropiedadesCasasDeApuestas props;
	
	private String nombreCasa;
	private String numSedes;
	private String presupuesto;
	
	public ParametrosDTO(String nombre, String numSedes, String presupuesto) {
		props = new PropiedadesCasasDeApuestas();
		this.nombreCasa = nombre;
		this.numSedes = numSedes;
		this.presupuesto = presupuesto;
	}

	public String getNombreCasa() {
		return nombreCasa;
	}

	public void setNombreCasa(String nombreCasa) {
		this.nombreCasa = nombreCasa;
	}

	public String getNumSedes() {
		return numSedes;
	}

	public void setNumSedes(String numSedes) {
		this.numSedes = numSedes;
	}

	public String getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(String presupuesto) {
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return "\nNombre de la casa: "+getNombreCasa()+"\nNumero de sedes: "+getNumSedes()+"\nPresupuesto total: "+getPresupuesto();
	}

	
}
