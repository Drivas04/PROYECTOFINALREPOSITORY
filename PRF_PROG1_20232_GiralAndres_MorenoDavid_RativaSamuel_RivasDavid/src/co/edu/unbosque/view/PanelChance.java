package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelChance extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private ImageIcon fondo;
	private JLabel mensajeNums, mensajeLoteria, empty;
	private JTextField txtNums, txtLoteria;
	private JButton btncrearAp, btnleerAP, btneliminarAP, btnactualizarAP, btnvolver;
	
	public static final String CREARAPC = "capc";
	public static final String LEERAPC = "lapc";
	public static final String ELIMINARAPC = "eapc";
	public static final String ACTUALIZARAPC = "aapc";
	public static final String VOLVER = "volverap";
	
	public PanelChance(String ruta) {
		fondo = new ImageIcon(ruta);
		setLayout(new GridLayout(3,4,20,20));
		
		mensajeNums = new JLabel("Ingrese 4 numeros: ");
		add(mensajeNums);
		
		txtNums = new JTextField();
		add(txtNums);
		
		empty = new JLabel();
		add(empty);
		
		btnvolver = new JButton("Volver");
		btnvolver.setActionCommand(VOLVER);
		add(btnvolver);
		
		mensajeLoteria = new JLabel("(En mayuscula)Loteria: ");
		add(mensajeLoteria);
		
		txtLoteria = new JTextField();
		add(txtLoteria);
		
		empty = new JLabel();
		add(empty);
		
		empty = new JLabel();
		add(empty);
		
		btncrearAp = new JButton("Jugar");
		btncrearAp.setActionCommand(CREARAPC);
		add(btncrearAp);
		
		btnleerAP = new JButton("Ver");
		btnleerAP.setActionCommand(LEERAPC);
		add(btnleerAP);
		
		btnactualizarAP = new JButton("Modificar apuesta");
		btnactualizarAP.setActionCommand(ACTUALIZARAPC);
		add(btnactualizarAP);
		
		btneliminarAP = new JButton("Eliminar apuesta");
		btneliminarAP.setActionCommand(ELIMINARAPC);
		add(btneliminarAP);
		
		
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

	public JLabel getMensajeNums() {
		return mensajeNums;
	}

	public void setMensajeNums(JLabel mensajeNums) {
		this.mensajeNums = mensajeNums;
	}

	public JLabel getMensajeLoteria() {
		return mensajeLoteria;
	}

	public void setMensajeLoteria(JLabel mensajeLoteria) {
		this.mensajeLoteria = mensajeLoteria;
	}

	public JTextField getTxtNums() {
		return txtNums;
	}

	public void setTxtNums(JTextField txtNums) {
		this.txtNums = txtNums;
	}

	public JTextField getTxtLoteria() {
		return txtLoteria;
	}

	public void setTxtLoteria(JTextField txtLoteria) {
		this.txtLoteria = txtLoteria;
	}
	
}
