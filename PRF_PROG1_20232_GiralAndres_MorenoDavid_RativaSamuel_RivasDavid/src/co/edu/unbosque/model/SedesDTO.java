package co.edu.unbosque.model;

import java.io.Serializable;

public class SedesDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String Ubicacion;
	private int NumEmpleados;
	
	
	public SedesDTO(String SUbicacion,int SNumEmpleados) {
		Ubicacion=SUbicacion;
		NumEmpleados=SNumEmpleados;
	}


	public String getUbicacion() {
		return Ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}


	public int getNumEmpleados() {
		return NumEmpleados;
	}


	public void setNumEmpleados(int numEmpleados) {
		NumEmpleados = numEmpleados;
	}
	
	public String toString() {
		return "SEDES[Ubicacion="+getUbicacion()+" Empleados "+getNumEmpleados();	}
	
}
