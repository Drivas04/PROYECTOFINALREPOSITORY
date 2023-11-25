package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelPartido10 extends JPanel{

	private static final long serialVersionUID = 1L;

	private ImageIcon fondo;
	private JButton local, empate, visitante;
	
	public static final String LOCAL="local10";
	public static final String EMPATE="Empate10";
	public static final String VISITANTE="Visitante10";
	
	public PanelPartido10(String ruta) {
		fondo = new ImageIcon(ruta);
		TitledBorder border = BorderFactory.createTitledBorder("Elija un ganador del partido 10");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		setLayout(new GridLayout(1,3, 10, 10));
		
		local = new JButton("Local");
		local.setActionCommand(LOCAL);
		add(local);
		
		empate = new JButton("Empate");
		empate.setActionCommand(EMPATE);
		add(empate);
		
		visitante = new JButton("Visitante");
		visitante.setActionCommand(VISITANTE);
		add(visitante);
	}
	
	@Override
	public void paint(Graphics g) {
		Dimension dim = this.getSize();
		g.drawImage(fondo.getImage(), 0, 0, dim.width, dim.height, null);
		this.setOpaque(false);
		super.paint(g);
	}

	public JButton getLocal() {
		return local;
	}

	public void setLocal(JButton local) {
		this.local = local;
	}

	public JButton getEmpate() {
		return empate;
	}

	public void setEmpate(JButton empate) {
		this.empate = empate;
	}

	public JButton getVisitante() {
		return visitante;
	}

	public void setVisitante(JButton visitante) {
		this.visitante = visitante;
	}
}