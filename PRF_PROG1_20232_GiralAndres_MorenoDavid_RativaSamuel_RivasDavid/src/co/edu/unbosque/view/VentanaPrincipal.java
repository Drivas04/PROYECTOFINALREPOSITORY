package co.edu.unbosque.view;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controller;

public class VentanaPrincipal extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private PanelPrincipal panelP;
	private PanelEleccionApuesta panelEA;
	private PanelBaloto panelBa;
	private PanelBetplay panelBP;
	private PanelValorApuestaBP panelVA;
	private PanelChance panelCH;
	private PanelLoteria panelL;
	private PanelSuperastro panelSA;
	private PanelParametros panelPa;
	private PanelEleccionJuego panelEleccion;
	private PanelSedes panelS;
	private PanelOpciones PanelO;
	private PanelRegistroUsuario PanelR;
	private PanelConsultas panelCon;
	private PanelDetalleApuesta panelD;
	
	public VentanaPrincipal(Controller controller) {
		setLayout(new CardLayout());
		setSize(800, 600);
		setTitle("Casa de Apuestas PikaBet");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panelP = new PanelPrincipal("Recursos/fondo.jpg");
		add(panelP);
		panelP.getBtnVerPropJuegos().addActionListener(controller);
		panelP.getBtnParametros().addActionListener(controller);
		panelP.getBtnSedes().addActionListener(controller);
		panelP.getBtnApostadores().addActionListener(controller);
		panelP.getBtnApostar().addActionListener(controller);
		panelP.getBtnConsultas().addActionListener(controller);
		
		panelEA = new PanelEleccionApuesta("Recursos/fondo.jpg");
		add(panelEA);
		panelEA.getBtnBaloto().addActionListener(controller);
		panelEA.getBtnBetPlay().addActionListener(controller);
		panelEA.getBtnChance().addActionListener(controller);
		panelEA.getBtnLoteria().addActionListener(controller);
		panelEA.getBtnSuperAstro().addActionListener(controller);
		panelEA.getBtnVolver().addActionListener(controller);
		
		panelBa = new PanelBaloto("Recursos/fondo.jpg");
		add(panelBa);
		panelBa.getBtncrearAp().addActionListener(controller);
		panelBa.getBtnleerAP().addActionListener(controller);
		panelBa.getBtnactualizarAP().addActionListener(controller);
		panelBa.getBtneliminarAP().addActionListener(controller);
		panelBa.getBtnvolver().addActionListener(controller);
		
		panelBP = new PanelBetplay("Recursos/fondo.jpg");
		add(panelBP);
		panelBP.getBtncrearAp().addActionListener(controller);
		panelBP.getBtnleerAP().addActionListener(controller);
		panelBP.getBtnactualizarAP().addActionListener(controller);
		panelBP.getBtneliminarAP().addActionListener(controller);
		panelBP.getBtnvolver().addActionListener(controller);
		
		panelVA = new PanelValorApuestaBP();
		add(panelVA);
		panelVA.getBtnContinuar().addActionListener(controller);
		
		panelCH = new PanelChance("Recursos/fondo.jpg");
		add(panelCH);
		panelCH.getBtncrearAp().addActionListener(controller);
		panelCH.getBtnleerAP().addActionListener(controller);
		panelCH.getBtnactualizarAP().addActionListener(controller);
		panelCH.getBtneliminarAP().addActionListener(controller);
		panelCH.getBtnvolver().addActionListener(controller);
		
		panelL = new PanelLoteria("Recursos/fondo.jpg");
		add(panelL);
		panelL.getBtncrearAp().addActionListener(controller);
		panelL.getBtnleerAP().addActionListener(controller);
		panelL.getBtnactualizarAP().addActionListener(controller);
		panelL.getBtneliminarAP().addActionListener(controller);
		panelL.getBtnvolver().addActionListener(controller);
		
		panelSA = new PanelSuperastro("Recursos/fondo.jpg");
		add(panelSA);
		panelSA.getBtncrearAp().addActionListener(controller);
		panelSA.getBtnleerAP().addActionListener(controller);
		panelSA.getBtnactualizarAP().addActionListener(controller);
		panelSA.getBtneliminarAP().addActionListener(controller);
		panelSA.getBtnvolver().addActionListener(controller);
		
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
		panelEleccion.getBtnVolver().addActionListener(controller);
		
		panelS = new PanelSedes("Recursos/fondo.jpg");
		panelS.getButCrearArchivo().addActionListener(controller);
		panelS.getButGuardar().addActionListener(controller);
		panelS.getButverSedes().addActionListener(controller);
		panelS.getButEliminar().addActionListener(controller);
		panelS.getButVolver().addActionListener(controller);
		add(panelS);
		
		PanelO=new PanelOpciones("Recursos/fondo.jpg");
		add(PanelO);
		PanelO.getCrear().addActionListener(controller);
		PanelO.getLeer().addActionListener(controller);
		PanelO.getBorrar().addActionListener(controller);
		PanelO.getActualizar().addActionListener(controller);
		PanelO.getVolver().addActionListener(controller);
		
		PanelR=new PanelRegistroUsuario("Recursos/fondo.jpg");
		add(PanelR);
		PanelR.getBotonCrear().addActionListener(controller);
		PanelR.getVolver().addActionListener(controller);
		
		panelCon = new PanelConsultas("Recursos/fondo.jpg");
		add(panelCon);
		panelCon.getBtnClientesxSedes().addActionListener(controller);
		panelCon.getBtnDetalleApuesta().addActionListener(controller);
		panelCon.getBtnTotalApuestasxCliente().addActionListener(controller);
		panelCon.getBtnTotalApuestaxJuego().addActionListener(controller);
		panelCon.getBtnTotalApuetsasxSede().addActionListener(controller);
		panelCon.getBtnVolver().addActionListener(controller);
		
		panelD = new PanelDetalleApuesta("Recursos/fondo.jpg");
		add(panelD);
		panelD.getBtncontinuar().addActionListener(controller);
		panelD.getBtnvolver().addActionListener(controller);
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


	public PanelEleccionApuesta getPanelEA() {
		return panelEA;
	}

	public void setPanelEA(PanelEleccionApuesta panelEA) {
		this.panelEA = panelEA;
	}
	
	

	public PanelBaloto getPanelBa() {
		return panelBa;
	}

	public void setPanelBa(PanelBaloto panelBa) {
		this.panelBa = panelBa;
	}
	

	public PanelBetplay getPanelBP() {
		return panelBP;
	}

	public void setPanelBP(PanelBetplay panelBP) {
		this.panelBP = panelBP;
	}

	public PanelChance getPanelCH() {
		return panelCH;
	}

	public void setPanelCH(PanelChance panelCH) {
		this.panelCH = panelCH;
	}

	public PanelLoteria getPanelL() {
		return panelL;
	}

	public void setPanelL(PanelLoteria panelL) {
		this.panelL = panelL;
	}

	public PanelSuperastro getPanelSA() {
		return panelSA;
	}

	public void setPanelSA(PanelSuperastro panelSA) {
		this.panelSA = panelSA;
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

	public PanelConsultas getPanelCon() {
		return panelCon;
	}

	public void setPanelCon(PanelConsultas panelCon) {
		this.panelCon = panelCon;
	}

	public PanelValorApuestaBP getPanelVA() {
		return panelVA;
	}

	public void setPanelVA(PanelValorApuestaBP panelVA) {
		this.panelVA = panelVA;
	}

	public PanelDetalleApuesta getPanelD() {
		return panelD;
	}

	public void setPanelD(PanelDetalleApuesta panelD) {
		this.panelD = panelD;
	}
	
	
}
