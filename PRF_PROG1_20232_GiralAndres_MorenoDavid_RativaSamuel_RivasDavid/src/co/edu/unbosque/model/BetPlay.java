package co.edu.unbosque.model;

import java.io.Serializable;

public class BetPlay extends JuegosDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	public BetPlay(String nombreJuego, String tipoJuego, double presupuestoJuego) {
		super(nombreJuego, tipoJuego, presupuestoJuego);
		// TODO Auto-generated constructor stub
	}
}
