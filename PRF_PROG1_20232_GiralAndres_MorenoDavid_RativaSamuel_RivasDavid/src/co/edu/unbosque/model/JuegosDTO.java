package co.edu.unbosque.model;

import java.io.Serializable;

public class JuegosDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nombreJuego;
	private String tipoJuego;
	private String presupuestoJuego;
	private String sede;
	private String fechaApuesta;
	private String cedula;
	private String valorAp;
	
	public JuegosDTO(String nombreJuego, String tipoJuego, String presupuestoJuego) {
		this.nombreJuego = nombreJuego;
		this.tipoJuego = tipoJuego;
		this.presupuestoJuego = presupuestoJuego;
	}
	
	public JuegosDTO(String cedula, String sede, String fechaApuesta, String valorAp) {
		this.cedula = cedula;
		this.sede = sede;
		this.fechaApuesta = fechaApuesta;
		this.valorAp = valorAp;
	}

	public String getNombreJuego() {
		return nombreJuego;
	}

	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}

	public String getTipoJuego() {
		return tipoJuego;
	}

	public void setTipoJuego(String tipoJuego) {
		this.tipoJuego = tipoJuego;
	}

	public String getPresupuestoJuego() {
		return presupuestoJuego;
	}

	public void setPresupuestoJuego(String presupuestoJuego) {
		this.presupuestoJuego = presupuestoJuego;
	}
	
	

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getFechaApuesta() {
		return fechaApuesta;
	}

	public void setFechaApuesta(String fechaApuesta) {
		this.fechaApuesta = fechaApuesta;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getValorAp() {
		return valorAp;
	}

	public void setValorAp(String valorAp) {
		this.valorAp = valorAp;
	}

	@Override
	public String toString() {
		return "\nNombre del juego: "+getNombreJuego()+"\nTipo de juego: "+getTipoJuego()+"\nPresupuesto para el juego: "+getPresupuestoJuego();
	}
	
	

}
