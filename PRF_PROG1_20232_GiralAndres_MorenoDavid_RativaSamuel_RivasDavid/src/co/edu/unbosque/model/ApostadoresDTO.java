package co.edu.unbosque.model;

import java.io.Serializable;



public class ApostadoresDTO implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String cedula;
	private String direccion;
	private String celular;
	private String edad;
	
	public ApostadoresDTO(String nombre, String cedula, String direccion, String celular,String edad) {
     
		this.nombre = nombre;
		this.cedula = cedula;
		this.direccion = direccion;
		this.celular = celular;
		this.edad=edad;
	}
	public String toString() {
		return "Apostador [nombre = " + getNombre() + ", cedula = " + getCedula() +", edad = " +getEdad()+ ", celular = " + getCelular() + ", direccion = " +getDireccion()+ "]";
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

}
