package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VentanaPrincipal extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private VentanaUsuario ventanaU;
	
	public VentanaPrincipal(Controller controller) {
		setSize(800, 600);
		setTitle("Casa de Apuestas PikaBet");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
