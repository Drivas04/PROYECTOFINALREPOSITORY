package co.edu.unbosque.model;

import java.io.Serializable;

public class JuegosDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nombreJuego;
	private String tipoJuego;
	private String presupuestoJuego;
	
	public JuegosDTO(String nombreJuego, String tipoJuego, String presupuestoJuego) {
		this.nombreJuego = nombreJuego;
		this.tipoJuego = tipoJuego;
		this.presupuestoJuego = presupuestoJuego;
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

	@Override
	public String toString() {
		return "\nNombre del juego: "+getNombreJuego()+"\nTipo de juego: "+getTipoJuego()+"\nPresupuesto para el juego: "+getPresupuestoJuego();
	}
	
	

}
