package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelActualizar extends JPanel {
	
	private JLabel NuevoNombre, NuevaCedula,NuevaDireccion,NuevoCelular;
	private JTextField NuevoCampoN,NuevoCampoC,NuevoCampoD,NuevoCampoCe;
	private JButton ActualizarA;
	
	public static final String ACTUALIZARA="Actualizar";

	
	public PanelActualizar() {
		
		setBounds(0,0,500,500);
		setLayout(new GridLayout(5,2));
		
		NuevoNombre=new JLabel("Nuevo Nombre");
		add(NuevoNombre);
		NuevoCampoN=new JTextField("");
		add(NuevoCampoN);
		NuevaCedula=new JLabel("Nueva Cedula");
		add(NuevaCedula);
		NuevoCampoC=new JTextField("");
		add(NuevoCampoC);
		NuevaDireccion=new JLabel("Nueva Direccion");
		add(NuevaDireccion);
		NuevoCampoD=new JTextField("");
		add(NuevoCampoD);
		NuevoCelular=new JLabel("Nuevo Celular");
		add(NuevoCelular);
		NuevoCampoCe=new JTextField("");
		add(NuevoCampoCe);
		ActualizarA=new JButton("Actualizar Apostador");
		ActualizarA.setActionCommand(ACTUALIZARA);
		add(ActualizarA);
		
	}


	public JLabel getNuevoNombre() {
		return NuevoNombre;
	}


	public void setNuevoNombre(JLabel nuevoNombre) {
		NuevoNombre = nuevoNombre;
	}


	public JLabel getNuevaCedula() {
		return NuevaCedula;
	}


	public void setNuevaCedula(JLabel nuevaCedula) {
		NuevaCedula = nuevaCedula;
	}


	public JLabel getNuevaDireccion() {
		return NuevaDireccion;
	}


	public void setNuevaDireccion(JLabel nuevaDireccion) {
		NuevaDireccion = nuevaDireccion;
	}


	public JLabel getNuevoCelular() {
		return NuevoCelular;
	}


	public void setNuevoCelular(JLabel nuevoCelular) {
		NuevoCelular = nuevoCelular;
	}


	public JTextField getNuevoCampoN() {
		return NuevoCampoN;
	}


	public void setNuevoCampoN(JTextField nuevoCampoN) {
		NuevoCampoN = nuevoCampoN;
	}


	public JTextField getNuevoCampoC() {
		return NuevoCampoC;
	}


	public void setNuevoCampoC(JTextField nuevoCampoC) {
		NuevoCampoC = nuevoCampoC;
	}


	public JTextField getNuevoCampoD() {
		return NuevoCampoD;
	}


	public void setNuevoCampoD(JTextField nuevoCampoD) {
		NuevoCampoD = nuevoCampoD;
	}


	public JTextField getNuevoCampoCe() {
		return NuevoCampoCe;
	}


	public void setNuevoCampoCe(JTextField nuevoCampoCe) {
		NuevoCampoCe = nuevoCampoCe;
	}


	public JButton getActualizarA() {
		return ActualizarA;
	}


	public void setActualizarA(JButton actualizarA) {
		ActualizarA = actualizarA;
	}




	
	
	
}
