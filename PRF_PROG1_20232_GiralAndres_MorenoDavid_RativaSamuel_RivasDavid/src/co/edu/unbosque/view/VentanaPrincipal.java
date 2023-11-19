package co.edu.unbosque.view;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controller;

public class VentanaPrincipal extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private PanelPrincipal panelP;
	private PanelParametros panelPa;
	private PanelEleccionJuego panelEleccion;
	private PanelSedes panelS;
	private PanelOpciones PanelO;
	private PanelRegistroUsuario PanelR;
	private PanelActualizar PanelA;
	
	public VentanaPrincipal(Controller controller) {
		setLayout(new CardLayout());
		setSize(800, 600);
		setTitle("Casa de Apuestas PikaBet");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panelP = new PanelPrincipal("Recursos/fondo.jpg");
		add(panelP);
		panelP.getBtnIngresar().addActionListener(controller);
		panelP.getBtnParametros().addActionListener(controller);
		panelP.getBtnSedes().addActionListener(controller);
		panelP.getBtnApostadores().addActionListener(controller);
		
		panelPa = new PanelParametros("Recursos/fondo.jpg");
		add(panelPa);
		panelPa.getBtnCrear().addActionListener(controller);
		panelPa.getBtnGuardar().addActionListener(controller);
		panelPa.getBtnModificar().addActionListener(controller);
		panelPa.getBtnVolver().addActionListener(controller);
		
		
		panelEleccion = new PanelEleccionJuego("Recursos/fondo.jpg");
		add(panelEleccion);
		panelEleccion.getBtnBaloto().addActionListener(controller);
		panelEleccion.getBtnBetPlay().addActionListener(controller);
		panelEleccion.getBtnChance().addActionListener(controller);
		panelEleccion.getBtnLoteria().addActionListener(controller);
		panelEleccion.getBtnSuperAstro().addActionListener(controller);
		
		panelS = new PanelSedes("Recursos/fondo.jpg");
		panelS.getButCrearArchivo().addActionListener(controller);
		panelS.getButGuardar().addActionListener(controller);
		panelS.getButverSedes().addActionListener(controller);
		add(panelS);
		
		PanelO=new PanelOpciones("Recursos/fondo.jpg");
		add(PanelO);
		PanelO.getCrear().addActionListener(controller);
		PanelO.getLeer().addActionListener(controller);
		PanelO.getBorrar().addActionListener(controller);
		PanelO.getActualizar().addActionListener(controller);
		
		PanelR=new PanelRegistroUsuario("Recursos/fondo.jpg");
		add(PanelR);
		PanelR.getBotonCrear().addActionListener(controller);
		PanelR.getVolver().addActionListener(controller);
		
		PanelA=new PanelActualizar();
		add(PanelA);
		PanelA.getActualizarA().addActionListener(controller);
	}
	
	public void mostrarMensaje(String mensaje, String titulo) {
		JOptionPane.showMessageDialog(null, mensaje, titulo, 1);
	}

	public String capturarDato(String mensaje, String titulo) {
		return JOptionPane.showInputDialog(null,mensaje,titulo,JOptionPane.QUESTION_MESSAGE);
	}
	
	public PanelPrincipal getPanelP() {
		return panelP;
	}

	public void setPanelP(PanelPrincipal panelP) {
		this.panelP = panelP;
	}


	public PanelEleccionJuego getPanelEleccion() {
		return panelEleccion;
	}

	public void setPanelEleccion(PanelEleccionJuego panelEleccion) {
		this.panelEleccion = panelEleccion;
	}

	public PanelSedes getPanelS() {
		return panelS;
	}

	public void setPanelS(PanelSedes panelS) {
		this.panelS = panelS;
	}

	public PanelParametros getPanelPa() {
		return panelPa;
	}

	public void setPanelPa(PanelParametros panelPa) {
		this.panelPa = panelPa;
	}

	public PanelOpciones getPanelO() {
		return PanelO;
	}

	public void setPanelO(PanelOpciones panelO) {
		PanelO = panelO;
	}

	public PanelRegistroUsuario getPanelR() {
		return PanelR;
	}

	public void setPanelR(PanelRegistroUsuario panelR) {
		PanelR = panelR;
	}

	public PanelActualizar getPanelA() {
		return PanelA;
	}

	public void setPanelA(PanelActualizar panelA) {
		PanelA = panelA;
	}
	
	
}
