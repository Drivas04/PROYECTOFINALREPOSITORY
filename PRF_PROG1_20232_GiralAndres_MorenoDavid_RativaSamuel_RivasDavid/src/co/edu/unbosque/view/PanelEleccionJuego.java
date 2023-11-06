package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class PanelEleccionJuego extends JPanel{

	private static final long serialVersionUID = 1L;

	private JButton btnBaloto, btnBetPlay, btnChance, btnLoteria, btnSuperAstro;
	public static final String BALOTO = "baloto";
	public static final String BETPLAY = "betplay";
	public static final String CHANCE = "chance";
	public static final String LOTERIA = "loteria";
	public static final String SUPERASTRO = "superastro";
	
	public PanelEleccionJuego() { 
		setLayout(new GridLayout(2, 3, 30, 30));
		
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
