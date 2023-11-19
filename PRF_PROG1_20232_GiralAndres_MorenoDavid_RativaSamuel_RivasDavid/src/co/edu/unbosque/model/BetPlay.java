package co.edu.unbosque.model;

import java.io.Serializable;

public class BetPlay extends JuegosDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	public BetPlay(String nombreJuego, String tipoJuego, String presupuestoJuego) {
		super(nombreJuego="BetPlay", tipoJuego="Deportiva", presupuestoJuego="$ 5.000.000.000");
		// TODO Auto-generated constructor stub
	}
}
