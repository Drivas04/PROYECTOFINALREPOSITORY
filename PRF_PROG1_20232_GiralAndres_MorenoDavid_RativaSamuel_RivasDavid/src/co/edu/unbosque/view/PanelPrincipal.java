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
	private JButton btnVerPropJuegos;
	private JButton btnSedes;
	private JButton btnParametros;
	private JButton btnApostadores;
	private JButton btnApostar;
	private JButton btnConsultas;
	
	public static final String VERPROPJUEGOS = "verpropjuegos";
	public static final String SEDES = "sedes";
	public static final String PARAMETROS = "parametros";
	public static final String APOSTADORES = "apostadores";
	public static final String APOSTAR = "apostar";
	public static final String CONSULTAR = "consultar";

	public PanelPrincipal(String ruta) {
		fondo = new ImageIcon(ruta);
		
		setLayout(new GridBagLayout());
		
		Font FontBoton = new Font("Agency FB", Font.BOLD, 20);
		
		empty = new JLabel();
		add(empty);
		empty = new JLabel();
		add(empty);
		
		btnParametros = new JButton("Parametros");
		btnParametros.setFont(FontBoton);
		btnParametros.setActionCommand(PARAMETROS);
		add(btnParametros, new GridBagConstraints (0, 0, 1, 1, 0, 0,
                GridBagConstraints.NORTHWEST,
                GridBagConstraints.EAST,
                new Insets (0,0,0,0), 0, 0));
		
		btnSedes = new JButton("Sedes");
		btnSedes.setSize(100, 30);
		btnSedes.setLocation(640, 20);
		btnSedes.setFont(FontBoton);
		btnSedes.setActionCommand(SEDES);
		add(btnSedes, new GridBagConstraints (0, 0, 1, 1, 0, 0,
                GridBagConstraints.NORTH,
                GridBagConstraints.EAST,
                new Insets (0,0,0,0), 0, 0));
		
		btnApostadores = new JButton("Apostadores");
		btnApostadores.setSize(100, 30);
		btnApostadores.setLocation(640, 20);
		btnApostadores.setFont(FontBoton);
		btnApostadores.setActionCommand(APOSTADORES);
		add(btnApostadores, new GridBagConstraints (0, 0, 1, 1, 0, 0,
                GridBagConstraints.NORTHEAST,
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
		
		btnVerPropJuegos = new JButton("Propiedades de juegos");
		btnVerPropJuegos.setSize(240, 50);
		//btnIngresar.setLocation(800/2, 450);
		btnVerPropJuegos.setFont(FontBoton);
		btnVerPropJuegos.setActionCommand(VERPROPJUEGOS);
		add(btnVerPropJuegos, new GridBagConstraints (0, 0, 1, 1, 1, 1,
                GridBagConstraints.SOUTHWEST,
                GridBagConstraints.SOUTH,
                new Insets (0,0,0,0), 0, 0));
		
		btnApostar = new JButton("Apostar!");
		btnApostar.setSize(100, 30);
		btnApostar.setLocation(640, 20);
		btnApostar.setFont(FontBoton);
		btnApostar.setActionCommand(APOSTAR);
		add(btnApostar, new GridBagConstraints (0, 0, 1, 1, 0, 0,
                GridBagConstraints.SOUTH,
                GridBagConstraints.SOUTH,
                new Insets (0,0,0,0), 0, 0));
		
		btnConsultas = new JButton("Consultar");
		btnConsultas.setSize(100, 30);
		btnConsultas.setLocation(640, 20);
		btnConsultas.setFont(FontBoton);
		btnConsultas.setActionCommand(CONSULTAR);
		add(btnConsultas, new GridBagConstraints (0, 0, 1, 1, 0, 0,
                GridBagConstraints.SOUTHEAST,
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


	

	public JButton getBtnVerPropJuegos() {
		return btnVerPropJuegos;
	}

	public void setBtnVerPropJuegos(JButton btnVerPropJuegos) {
		this.btnVerPropJuegos = btnVerPropJuegos;
	}

	public JButton getBtnSedes() {
		return btnSedes;
	}

	public void setBtnSedes(JButton btnSedes) {
		this.btnSedes = btnSedes;
	}

	public JButton getBtnParametros() {
		return btnParametros;
	}

	public void setBtnParametros(JButton btnParametros) {
		this.btnParametros = btnParametros;
	}

	public JButton getBtnApostadores() {
		return btnApostadores;
	}

	public void setBtnApostadores(JButton btnApostadores) {
		this.btnApostadores = btnApostadores;
	}

	public JButton getBtnApostar() {
		return btnApostar;
	}

	public void setBtnApostar(JButton btnApostar) {
		this.btnApostar = btnApostar;
	}

	public JButton getBtnConsultas() {
		return btnConsultas;
	}

	public void setBtnConsultas(JButton btnConsultas) {
		this.btnConsultas = btnConsultas;
	}
	
	
	
}