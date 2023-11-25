package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

import co.edu.unbosque.controller.Controller;

public class VentanaPartidos extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private PanelPartido1 panelP1;
	private PanelPartido2 panelP2;
	private PanelPartido3 panelP3;
	private PanelPartido4 panelP4;
	private PanelPartido5 panelP5;
	private PanelPartido6 panelP6;
	private PanelPartido7 panelP7;
	private PanelPartido8 panelP8;
	private PanelPartido9 panelP9;
	private PanelPartido10 panelP10;
	private PanelPartido11 panelP11;
	private PanelPartido12 panelP12;
	private PanelPartido13 panelP13;
	private PanelPartido14 panelP14;
	private PanelGestionarApuestaBetplay panelGA;
	private JTextField txtG1, txtG2, txtG3, txtG4, txtG5, txtG6, txtG7, txtG8, txtG9, txtG10, txtG11, txtG12, txtG13, txtG14; 
	
	public VentanaPartidos(Controller controller) {
		setLayout(new GridLayout(15,1,10,10));
		setSize(800, 720);
		setTitle("Apuestas Deportivas");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		panelP1 = new PanelPartido1("Recursos/fondo.jpg");
		add(panelP1);
		panelP1.getLocal().addActionListener(controller);
		panelP1.getEmpate().addActionListener(controller);
		panelP1.getVisitante().addActionListener(controller);
		
		panelP2 = new PanelPartido2("Recursos/fondo.jpg");
		add(panelP2);
		panelP2.getLocal().addActionListener(controller);
		panelP2.getEmpate().addActionListener(controller);
		panelP2.getVisitante().addActionListener(controller);
		
		panelP3 = new PanelPartido3("Recursos/fondo.jpg");
		add(panelP3);
		panelP3.getLocal().addActionListener(controller);
		panelP3.getEmpate().addActionListener(controller);
		panelP3.getVisitante().addActionListener(controller);
		
		panelP4 = new PanelPartido4("Recursos/fondo.jpg");
		add(panelP4);
		panelP4.getLocal().addActionListener(controller);
		panelP4.getEmpate().addActionListener(controller);
		panelP4.getVisitante().addActionListener(controller);
		
		panelP5 = new PanelPartido5("Recursos/fondo.jpg");
		add(panelP5);
		panelP5.getLocal().addActionListener(controller);
		panelP5.getEmpate().addActionListener(controller);
		panelP5.getVisitante().addActionListener(controller);
		
		panelP6 = new PanelPartido6("Recursos/fondo.jpg");
		add(panelP6);
		panelP6.getLocal().addActionListener(controller);
		panelP6.getEmpate().addActionListener(controller);
		panelP6.getVisitante().addActionListener(controller);
		
		panelP7 = new PanelPartido7("Recursos/fondo.jpg");
		add(panelP7);
		panelP7.getLocal().addActionListener(controller);
		panelP7.getEmpate().addActionListener(controller);
		panelP7.getVisitante().addActionListener(controller);
		
		panelP8 = new PanelPartido8("Recursos/fondo.jpg");
		add(panelP8);
		panelP8.getLocal().addActionListener(controller);
		panelP8.getEmpate().addActionListener(controller);
		panelP8.getVisitante().addActionListener(controller);
		
		panelP9 = new PanelPartido9("Recursos/fondo.jpg");
		add(panelP9);
		panelP9.getLocal().addActionListener(controller);
		panelP9.getEmpate().addActionListener(controller);
		panelP9.getVisitante().addActionListener(controller);
		
		panelP10 = new PanelPartido10("Recursos/fondo.jpg");
		add(panelP10);
		panelP10.getLocal().addActionListener(controller);
		panelP10.getEmpate().addActionListener(controller);
		panelP10.getVisitante().addActionListener(controller);
		
		panelP11 = new PanelPartido11("Recursos/fondo.jpg");
		add(panelP11);
		panelP11.getLocal().addActionListener(controller);
		panelP11.getEmpate().addActionListener(controller);
		panelP11.getVisitante().addActionListener(controller);
		
		panelP12 = new PanelPartido12("Recursos/fondo.jpg");
		add(panelP12);
		panelP12.getLocal().addActionListener(controller);
		panelP12.getEmpate().addActionListener(controller);
		panelP12.getVisitante().addActionListener(controller);
		
		panelP13 = new PanelPartido13("Recursos/fondo.jpg");
		add(panelP13);
		panelP13.getLocal().addActionListener(controller);
		panelP13.getEmpate().addActionListener(controller);
		panelP13.getVisitante().addActionListener(controller);
		
		panelP14 = new PanelPartido14("Recursos/fondo.jpg");
		add(panelP14);
		panelP14.getLocal().addActionListener(controller);
		panelP14.getEmpate().addActionListener(controller);
		panelP14.getVisitante().addActionListener(controller);
		
		panelGA = new PanelGestionarApuestaBetplay("Recursos/fondo.jpg");
		add(panelGA);
		panelGA.getBtnGuardar().addActionListener(controller);
		
		txtG1 = new JTextField();
		txtG2 = new JTextField();
		txtG3 = new JTextField();
		txtG4 = new JTextField();
		txtG5 = new JTextField();
		txtG6 = new JTextField();
		txtG7 = new JTextField();
		txtG8 = new JTextField();
		txtG9 = new JTextField();
		txtG10 = new JTextField();
		txtG11 = new JTextField();
		txtG12 = new JTextField();
		txtG13 = new JTextField();
		txtG14 = new JTextField();
	}

	public PanelPartido1 getPanelP1() {
		return panelP1;
	}

	public void setPanelP1(PanelPartido1 panelP1) {
		this.panelP1 = panelP1;
	}

	public PanelPartido2 getPanelP2() {
		return panelP2;
	}

	public void setPanelP2(PanelPartido2 panelP2) {
		this.panelP2 = panelP2;
	}

	public PanelPartido3 getPanelP3() {
		return panelP3;
	}

	public void setPanelP3(PanelPartido3 panelP3) {
		this.panelP3 = panelP3;
	}

	public PanelPartido4 getPanelP4() {
		return panelP4;
	}

	public void setPanelP4(PanelPartido4 panelP4) {
		this.panelP4 = panelP4;
	}

	public PanelPartido5 getPanelP5() {
		return panelP5;
	}

	public void setPanelP5(PanelPartido5 panelP5) {
		this.panelP5 = panelP5;
	}

	public PanelPartido6 getPanelP6() {
		return panelP6;
	}

	public void setPanelP6(PanelPartido6 panelP6) {
		this.panelP6 = panelP6;
	}

	public PanelPartido7 getPanelP7() {
		return panelP7;
	}

	public void setPanelP7(PanelPartido7 panelP7) {
		this.panelP7 = panelP7;
	}

	public PanelPartido8 getPanelP8() {
		return panelP8;
	}

	public void setPanelP8(PanelPartido8 panelP8) {
		this.panelP8 = panelP8;
	}

	public PanelPartido9 getPanelP9() {
		return panelP9;
	}

	public void setPanelP9(PanelPartido9 panelP9) {
		this.panelP9 = panelP9;
	}

	public PanelPartido10 getPanelP10() {
		return panelP10;
	}

	public void setPanelP10(PanelPartido10 panelP10) {
		this.panelP10 = panelP10;
	}

	public PanelPartido11 getPanelP11() {
		return panelP11;
	}

	public void setPanelP11(PanelPartido11 panelP11) {
		this.panelP11 = panelP11;
	}

	public PanelPartido12 getPanelP12() {
		return panelP12;
	}

	public void setPanelP12(PanelPartido12 panelP12) {
		this.panelP12 = panelP12;
	}

	public PanelPartido13 getPanelP13() {
		return panelP13;
	}

	public void setPanelP13(PanelPartido13 panelP13) {
		this.panelP13 = panelP13;
	}

	public PanelPartido14 getPanelP14() {
		return panelP14;
	}

	public void setPanelP14(PanelPartido14 panelP14) {
		this.panelP14 = panelP14;
	}

	public PanelGestionarApuestaBetplay getPanelGA() {
		return panelGA;
	}

	public void setPanelGA(PanelGestionarApuestaBetplay panelGA) {
		this.panelGA = panelGA;
	}

	public JTextField getTxtG1() {
		return txtG1;
	}

	public void setTxtG1(JTextField txtG1) {
		this.txtG1 = txtG1;
	}

	public JTextField getTxtG2() {
		return txtG2;
	}

	public void setTxtG2(JTextField txtG2) {
		this.txtG2 = txtG2;
	}

	public JTextField getTxtG3() {
		return txtG3;
	}

	public void setTxtG3(JTextField txtG3) {
		this.txtG3 = txtG3;
	}

	public JTextField getTxtG4() {
		return txtG4;
	}

	public void setTxtG4(JTextField txtG4) {
		this.txtG4 = txtG4;
	}

	public JTextField getTxtG5() {
		return txtG5;
	}

	public void setTxtG5(JTextField txtG5) {
		this.txtG5 = txtG5;
	}

	public JTextField getTxtG6() {
		return txtG6;
	}

	public void setTxtG6(JTextField txtG6) {
		this.txtG6 = txtG6;
	}

	public JTextField getTxtG7() {
		return txtG7;
	}

	public void setTxtG7(JTextField txtG7) {
		this.txtG7 = txtG7;
	}

	public JTextField getTxtG8() {
		return txtG8;
	}

	public void setTxtG8(JTextField txtG8) {
		this.txtG8 = txtG8;
	}

	public JTextField getTxtG9() {
		return txtG9;
	}

	public void setTxtG9(JTextField txtG9) {
		this.txtG9 = txtG9;
	}

	public JTextField getTxtG10() {
		return txtG10;
	}

	public void setTxtG10(JTextField txtG10) {
		this.txtG10 = txtG10;
	}

	public JTextField getTxtG11() {
		return txtG11;
	}

	public void setTxtG11(JTextField txtG11) {
		this.txtG11 = txtG11;
	}

	public JTextField getTxtG12() {
		return txtG12;
	}

	public void setTxtG12(JTextField txtG12) {
		this.txtG12 = txtG12;
	}

	public JTextField getTxtG13() {
		return txtG13;
	}

	public void setTxtG13(JTextField txtG13) {
		this.txtG13 = txtG13;
	}

	public JTextField getTxtG14() {
		return txtG14;
	}

	public void setTxtG14(JTextField txtG14) {
		this.txtG14 = txtG14;
	}
	
	
}
