package co.edu.unbosque.view;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controller;

public class VentanaPrincipal extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private PanelPrincipal panelP;
	private PanelEleccionJuego panelEleccion;
	private VentanaUsuario ventanaU;
	
	public VentanaPrincipal(Controller controller) {
		setLayout(new CardLayout());
		setSize(800, 600);
		setTitle("Casa de Apuestas PikaBet");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panelP = new PanelPrincipal();
		add(panelP);
		panelP.getBtnIngresar().addActionListener(controller);
		
		panelEleccion = new PanelEleccionJuego();
		add(panelEleccion);
		panelEleccion.getBtnBaloto().addActionListener(controller);
		panelEleccion.getBtnBetPlay().addActionListener(controller);
		panelEleccion.getBtnChance().addActionListener(controller);
		panelEleccion.getBtnLoteria().addActionListener(controller);
		panelEleccion.getBtnSuperAstro().addActionListener(controller);
	}
	
	public void mostrarMensaje(String mensaje, String titulo) {
		JOptionPane.showMessageDialog(null, mensaje, titulo, 1);
	}

	public PanelPrincipal getPanelP() {
		return panelP;
	}

	public void setPanelP(PanelPrincipal panelP) {
		this.panelP = panelP;
	}

	public VentanaUsuario getVentanaU() {
		return ventanaU;
	}

	public void setVentanaU(VentanaUsuario ventanaU) {
		this.ventanaU = ventanaU;
	}

	public PanelEleccionJuego getPanelEleccion() {
		return panelEleccion;
	}

	public void setPanelEleccion(PanelEleccionJuego panelEleccion) {
		this.panelEleccion = panelEleccion;
	}
	
	
}
