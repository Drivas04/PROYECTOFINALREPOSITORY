package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBetplay extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private ImageIcon fondo;
	private JButton btncrearAp, btnleerAP, btneliminarAP, btnactualizarAP, btnvolver;
	
	public static final String CREARAPBP = "capbp";
	public static final String LEERAPBP = "lapbp";
	public static final String ELIMINARAPBP = "eapbp";
	public static final String ACTUALIZARAPBP = "aapbp";
	public static final String VOLVER = "volverap";
	
	public PanelBetplay(String ruta) {
		fondo = new ImageIcon(ruta);
		setLayout(new GridLayout(2,4,20,20));
		
		btncrearAp = new JButton("Jugar");
		btncrearAp.setActionCommand(CREARAPBP);
		add(btncrearAp);
		
		btnleerAP = new JButton("Ver");
		btnleerAP.setActionCommand(LEERAPBP);
		add(btnleerAP);
		
		btnactualizarAP = new JButton("Modificar apuesta");
		btnactualizarAP.setActionCommand(ACTUALIZARAPBP);
		add(btnactualizarAP);
		
		btneliminarAP = new JButton("Eliminar apuesta");
		btneliminarAP.setActionCommand(ELIMINARAPBP);
		add(btneliminarAP);
		
		btnvolver = new JButton("Volver");
		btnvolver.setActionCommand(VOLVER);
		add(btnvolver);
	}
	
	@Override
	public void paint(Graphics g) {
		Dimension dim = this.getSize();
		g.drawImage(fondo.getImage(), 0, 0, dim.width, dim.height, null);
		this.setOpaque(false);
		super.paint(g);
	}

	public JButton getBtncrearAp() {
		return btncrearAp;
	}

	public void setBtncrearAp(JButton btncrearAp) {
		this.btncrearAp = btncrearAp;
	}

	public JButton getBtnleerAP() {
		return btnleerAP;
	}

	public void setBtnleerAP(JButton btnleerAP) {
		this.btnleerAP = btnleerAP;
	}

	public JButton getBtneliminarAP() {
		return btneliminarAP;
	}

	public void setBtneliminarAP(JButton btneliminarAP) {
		this.btneliminarAP = btneliminarAP;
	}

	public JButton getBtnactualizarAP() {
		return btnactualizarAP;
	}

	public void setBtnactualizarAP(JButton btnactualizarAP) {
		this.btnactualizarAP = btnactualizarAP;
	}

	public JButton getBtnvolver() {
		return btnvolver;
	}

	public void setBtnvolver(JButton btnvolver) {
		this.btnvolver = btnvolver;
	}

}
