package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.*;

public class PanelPrincipal extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JLabel titulo;
	private JLabel empty;
	private ImageIcon fondo;
	private JButton btnIngresar;
	private JButton btnSedes;
	
	public static final String INGRESAR = "ingresar";
	public static final String SEDES = "sedes";

	public PanelPrincipal(String ruta) {
		fondo = new ImageIcon(ruta);
		
		setLayout(new GridLayout(3,3,90,180));
		
		Font FontBoton = new Font("Agency FB", Font.BOLD, 20);
		
		empty = new JLabel();
		add(empty);
		empty = new JLabel();
		add(empty);
		
		btnSedes = new JButton("Sedes");
		btnSedes.setSize(100, 30);
		btnSedes.setLocation(640, 20);
		btnSedes.setFont(FontBoton);
		btnSedes.setActionCommand(SEDES);
		add(btnSedes);
		
		empty = new JLabel();
		add(empty);
		
		titulo = new JLabel("Bienvenido a PikaBet");
		Font font = new Font("Agency FB", Font.BOLD, 20);
		titulo.setFont(font);
		titulo.setForeground(Color.black);
		add(titulo);
		
		empty = new JLabel();
		add(empty);
		
		empty = new JLabel();
		add(empty);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setSize(240, 50);
		btnIngresar.setLocation(275, 450);
		btnIngresar.setFont(FontBoton);
		btnIngresar.setActionCommand(INGRESAR);
		add(btnIngresar);
		
		
		
	}
	
	

	@Override
	public void paint(Graphics g) {
		Dimension dim = this.getSize();
		g.drawImage(fondo.getImage(), 0, 0, dim.width, dim.height, null);
		this.setOpaque(false);
		super.paint(g);
	}



	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}


	public JButton getBtnIngresar() {
		return btnIngresar;
	}

	public void setBtnIngresar(JButton btnIngresar) {
		this.btnIngresar = btnIngresar;
	}

	public JButton getBtnSedes() {
		return btnSedes;
	}

	public void setBtnSedes(JButton btnSedes) {
		this.btnSedes = btnSedes;
	}
	
	
	
}