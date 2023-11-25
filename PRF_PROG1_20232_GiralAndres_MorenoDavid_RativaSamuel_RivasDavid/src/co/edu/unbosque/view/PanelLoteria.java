package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelLoteria extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private ImageIcon fondo;
	private JLabel mensajeNumeros, mensajeSerie, mensajeLoteria, empty;
	private JTextField txtnumeros, txtserie, txtloteria;
	private JButton btncrearAp, btnleerAP, btneliminarAP, btnactualizarAP, btnvolver;
	
	public static final String CREARAPL = "capl";
	public static final String LEERAPL = "lapl";
	public static final String ELIMINARAPL = "eapl";
	public static final String ACTUALIZARAPL = "aapl";
	public static final String VOLVER = "volverap";
	
	public PanelLoteria(String ruta) {
		fondo = new ImageIcon(ruta);
		setLayout(new GridLayout(4,4,20,20));
		
		mensajeNumeros = new JLabel("Numeros: ");
		add(mensajeNumeros);
		
		txtnumeros = new JTextField();
		add(txtnumeros);
		
		empty = new JLabel();
		add(empty);
		
		btnvolver = new JButton("Volver");
		btnvolver.setActionCommand(VOLVER);
		add(btnvolver);
		
		mensajeSerie = new JLabel("Serie: ");
		add(mensajeSerie);
		
		txtserie = new JTextField();
		add(txtserie);
		
		empty = new JLabel();
		add(empty);
		
		empty = new JLabel();
		add(empty);
		
		mensajeLoteria = new JLabel("LOTERIA: ");
		add(mensajeLoteria);
		
		txtloteria = new JTextField();
		add(txtloteria);
		
		empty = new JLabel();
		add(empty);
		
		empty = new JLabel();
		add(empty);
		
		btncrearAp = new JButton("Jugar");
		btncrearAp.setActionCommand(CREARAPL);
		add(btncrearAp);
		
		btnleerAP = new JButton("Ver");
		btnleerAP.setActionCommand(LEERAPL);
		add(btnleerAP);
		
		btnactualizarAP = new JButton("Modificar apuesta");
		btnactualizarAP.setActionCommand(ACTUALIZARAPL);
		add(btnactualizarAP);
		
		btneliminarAP = new JButton("Eliminar apuesta");
		btneliminarAP.setActionCommand(ELIMINARAPL);
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

	public JLabel getMensajeNumeros() {
		return mensajeNumeros;
	}

	public void setMensajeNumeros(JLabel mensajeNumeros) {
		this.mensajeNumeros = mensajeNumeros;
	}

	public JLabel getMensajeSerie() {
		return mensajeSerie;
	}

	public void setMensajeSerie(JLabel mensajeSerie) {
		this.mensajeSerie = mensajeSerie;
	}

	public JLabel getMensajeLoteria() {
		return mensajeLoteria;
	}

	public void setMensajeLoteria(JLabel mensajeLoteria) {
		this.mensajeLoteria = mensajeLoteria;
	}

	public JTextField getTxtnumeros() {
		return txtnumeros;
	}

	public void setTxtnumeros(JTextField txtnumeros) {
		this.txtnumeros = txtnumeros;
	}

	public JTextField getTxtserie() {
		return txtserie;
	}

	public void setTxtserie(JTextField txtserie) {
		this.txtserie = txtserie;
	}

	public JTextField getTxtloteria() {
		return txtloteria;
	}

	public void setTxtloteria(JTextField txtloteria) {
		this.txtloteria = txtloteria;
	}
}
