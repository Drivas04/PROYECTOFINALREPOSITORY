package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PanelEleccionJuego extends JPanel{

	private static final long serialVersionUID = 1L;

	private JButton btnBaloto, btnBetPlay, btnChance, btnLoteria, btnSuperAstro;
	private ImageIcon fondo;
	public static final String BALOTO = "baloto";
	public static final String BETPLAY = "betplay";
	public static final String CHANCE = "chance";
	public static final String LOTERIA = "loteria";
	public static final String SUPERASTRO = "superastro";
	
	public PanelEleccionJuego(String ruta) { 
		fondo = new ImageIcon(ruta);
		setLayout(new GridLayout(2, 3, 50, 30));
		
		TitledBorder border = BorderFactory.createTitledBorder("Elija un juego");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		btnBaloto = new JButton("Baloto");
		btnBaloto.setActionCommand(BALOTO);
		add(btnBaloto);
		
		btnBetPlay = new JButton("BetPlay");
		btnBetPlay.setActionCommand(BETPLAY);
		add(btnBetPlay);
		
		btnChance = new JButton("Chance");
		btnChance.setActionCommand(CHANCE);
		add(btnChance);
		
		btnLoteria = new JButton("Loteria");
		btnLoteria.setActionCommand(LOTERIA);
		add(btnLoteria);
		
		btnSuperAstro = new JButton("Super Astro");
		btnSuperAstro.setActionCommand(SUPERASTRO);
		add(btnSuperAstro);
	}

	
	@Override
	public void paint(Graphics g) {
		Dimension dim = this.getSize();
		g.drawImage(fondo.getImage(), 0, 0, dim.width, dim.height, null);
		this.setOpaque(false);
		super.paint(g);
	}
	
	public JButton getBtnBaloto() {
		return btnBaloto;
	}

	public void setBtnBaloto(JButton btnBaloto) {
		this.btnBaloto = btnBaloto;
	}

	public JButton getBtnBetPlay() {
		return btnBetPlay;
	}

	public void setBtnBetPlay(JButton btnBetPlay) {
		this.btnBetPlay = btnBetPlay;
	}

	public JButton getBtnChance() {
		return btnChance;
	}

	public void setBtnChance(JButton btnChance) {
		this.btnChance = btnChance;
	}

	public JButton getBtnLoteria() {
		return btnLoteria;
	}

	public void setBtnLoteria(JButton btnLoteria) {
		this.btnLoteria = btnLoteria;
	}

	public JButton getBtnSuperAstro() {
		return btnSuperAstro;
	}

	public void setBtnSuperAstro(JButton btnSuperAstro) {
		this.btnSuperAstro = btnSuperAstro;
	}
	
	
}
