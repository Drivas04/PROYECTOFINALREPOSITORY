package co.edu.unbosque.controller;

import co.edu.unbosque.view.VentanaPrincipal;

public class Controller {

	private VentanaPrincipal ventanaP;
	
	public Controller() {
		ventanaP = new VentanaPrincipal(this);
		ventanaP.setVisible(true);
	}
}
