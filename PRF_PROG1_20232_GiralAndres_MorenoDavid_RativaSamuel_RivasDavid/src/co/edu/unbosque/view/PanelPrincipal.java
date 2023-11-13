package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;

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
		
		setLayout(new GridBagLayout());
		
		Dimension dim1 = this.getSize();
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
		add(btnSedes, new GridBagConstraints (0, 0, 1, 1, 0, 0,
                GridBagConstraints.NORTH,
                GridBagConstraints.EAST,
                new Insets (0,0,0,0), 0, 0));
		
		empty = new JLabel();
		add(empty);
		
		titulo = new JLabel();
		ImageIcon titulo1 = new ImageIcon("Recursos/Logo.png");
		//titulo.setSize();
		//titulo.setLocation(320, 100);
		titulo.setIcon(new ImageIcon(titulo1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT)));
		add(titulo, 
			       new GridBagConstraints (0, 0, 1, 1, 0, 0,
                           GridBagConstraints.CENTER,
                           GridBagConstraints.CENTER,
                           new Insets (0,0,0,0), 0, 0));
		
		empty = new JLabel();
		add(empty);
		
		empty = new JLabel();
		add(empty);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setSize(240, 50);
		//btnIngresar.setLocation(800/2, 450);
		btnIngresar.setFont(FontBoton);
		btnIngresar.setActionCommand(INGRESAR);
		add(btnIngresar, new GridBagConstraints (0, 0, 1, 1, 1, 1,
                GridBagConstraints.SOUTH,
                GridBagConstraints.SOUTH,
                new Insets (0,0,0,0), 0, 0));
		
		
		//agregarConstrains();
	}
	
	public void agregarConstrains() {
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx=1;
		gbc.gridy=1;
		gbc.gridwidth=3;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		
		add(titulo, gbc);
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