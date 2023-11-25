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

public class PanelEleccionApuesta extends JPanel{

	private static final long serialVersionUID = 1L;

	private JButton btnBaloto, btnBetPlay, btnChance, btnLoteria, btnSuperAstro, btnVolver;
	private ImageIcon fondo;
	public static final String BALOTO = "BalotoAP";
	public static final String BETPLAY = "BetPlayAP";
	public static final String CHANCE = "ChanceAP";
	public static final String LOTERIA = "LoteriaAP";
	public static final String SUPERASTRO = "SuperAstroAP";
	public static final String VOLVER = "volver";
	
	public PanelEleccionApuesta(String ruta) { 
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
		
		btnVolver = new JButton("Volver");
		btnVolver.setActionCommand(VOLVER);
		add(btnVolver);
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


	public JButton getBtnVolver() {
		return btnVolver;
	}


	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}
}
