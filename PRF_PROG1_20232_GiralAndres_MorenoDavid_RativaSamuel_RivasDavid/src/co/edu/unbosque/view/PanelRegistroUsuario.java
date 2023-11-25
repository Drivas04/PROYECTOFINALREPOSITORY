package co.edu.unbosque.view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.*;

public class PanelRegistroUsuario extends JPanel {
	
	private JLabel nombre,cedula, sede,celular,direccion,edad;
	private JTextField CampoNombre,CampoCedula ,campoSede, CampoCelular,CampoDireccion,CampoEdad;
	private JButton BotonCrear,volver;
	private ImageIcon fondo;
	
	public static final String CREARAP="crearapostador";
	public static final String VOLVER="volveraopciones";
	
	public PanelRegistroUsuario(String ruta) {
		fondo = new ImageIcon(ruta);
		setBounds(0,0,500,500);
		setLayout(new GridLayout(7,2,15,15));
		setBackground(Color.white);
	
		nombre=new JLabel("Nombre");
		nombre.setSize(200,200);
		add(nombre);
		CampoNombre=new JTextField("");
		add(CampoNombre);
		edad=new JLabel("Edad");
		add(edad);
		CampoEdad=new JTextField("");
		add(CampoEdad);
		cedula=new JLabel("Cedula");
		add(cedula);
		CampoCedula=new JTextField("");
		add(CampoCedula);
		sede = new JLabel("Sede en la que va a jugar");
		add(sede);
		campoSede = new JTextField();
		add(campoSede);
		celular=new JLabel("Celular");
		add(celular);
		CampoCelular=new JTextField("");
		add(CampoCelular);
		direccion=new JLabel("Dirección");
		add(direccion);
		CampoDireccion=new JTextField("");
		add(CampoDireccion);
		BotonCrear=new JButton("Crear Apostador");
		BotonCrear.setActionCommand(CREARAP);
		add(BotonCrear);
		volver=new JButton("Volver");
		volver.setActionCommand(VOLVER);
		add(volver);
	}
	
	@Override
	public void paint(Graphics g) {
		Dimension dim = this.getSize();
		g.drawImage(fondo.getImage(), 0, 0, dim.width, dim.height, null);
		this.setOpaque(false);
		super.paint(g);
	}

	public JLabel getNombre() {
		return nombre;
	}
	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}
	public JLabel getCedula() {
		return cedula;
	}
	public void setCedula(JLabel cedula) {
		this.cedula = cedula;
	}
	public JLabel getCelular() {
		return celular;
	}
	public void setCelular(JLabel celular) {
		this.celular = celular;
	}
	public JLabel getDireccion() {
		return direccion;
	}
	public void setDireccion(JLabel direccion) {
		this.direccion = direccion;
	}
	public JTextField getCampoNombre() {
		return CampoNombre;
	}
	public void setCampoNombre(JTextField campoNombre) {
		CampoNombre = campoNombre;
	}
	public JTextField getCampoCedula() {
		return CampoCedula;
	}
	public void setCampoCedula(JTextField campoCedula) {
		CampoCedula = campoCedula;
	}
	public JTextField getCampoCelular() {
		return CampoCelular;
	}
	public void setCampoCelular(JTextField campoCelular) {
		CampoCelular = campoCelular;
	}
	public JTextField getCampoDireccion() {
		return CampoDireccion;
	}
	public void setCampoDireccion(JTextField campoDireccion) {
		CampoDireccion = campoDireccion;
	}
	public JButton getBotonCrear() {
		return BotonCrear;
	}
	public void setBotonCrear(JButton botonCrear) {
		BotonCrear = botonCrear;
	}

	public JButton getVolver() {
		return volver;
	}
	

	public JLabel getEdad() {
		return edad;
	}

	public void setEdad(JLabel edad) {
		this.edad = edad;
	}

	public JTextField getCampoEdad() {
		return CampoEdad;
	}

	public void setCampoEdad(JTextField campoEdad) {
		CampoEdad = campoEdad;
	}


	public void setVolver(JButton volver) {
		this.volver = volver;
	}


	public static String getVOLVER() {
		return VOLVER;
	}

	public JLabel getSede() {
		return sede;
	}

	public void setSede(JLabel sede) {
		this.sede = sede;
	}

	public JTextField getCampoSede() {
		return campoSede;
	}

	public void setCampoSede(JTextField campoSede) {
		this.campoSede = campoSede;
	}
	
	
	

}
