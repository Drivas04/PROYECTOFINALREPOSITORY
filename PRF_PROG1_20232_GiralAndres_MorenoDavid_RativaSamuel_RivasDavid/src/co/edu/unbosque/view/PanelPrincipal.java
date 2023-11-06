package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import java.awt.Image;

import javax.swing.*;

public class PanelPrincipal extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JLabel titulo;
	private JLabel imagenFondo;
	private JButton btnIngresar;
	
	public static final String INGRESAR = "ingresar";

	public PanelPrincipal() {
		setLayout(null);
		imagenFondo = new JLabel();
		imagenFondo.setBounds(0, 0, 800, 600);
		ImageIcon fondo = new ImageIcon("Recursos/fondo.jpg");
		imagenFondo.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH)));
		add(imagenFondo);
		
		titulo = new JLabel("Bienvenido a PikaB");
		titulo.setLocation(275, 100);
		titulo.setForeground(Color.black);
		
		add(titulo);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setSize(240, 50);
		btnIngresar.setLocation(275, 450);
		Font FontBoton = new Font("Agency FB", Font.BOLD, 20);
		btnIngresar.setFont(FontBoton);
		btnIngresar.setActionCommand(INGRESAR);
		add(btnIngresar);

	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getImagenFondo() {
		return imagenFondo;
	}

	public void setImagenFondo(JLabel imagenFondo) {
		this.imagenFondo = imagenFondo;
	}

	public JButton getBtnIngresar() {
		return btnIngresar;
	}

	public void setBtnIngresar(JButton btnIngresar) {
		this.btnIngresar = btnIngresar;
	}
	
	
}