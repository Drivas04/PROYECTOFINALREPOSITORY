package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelSuperastro extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private ImageIcon fondo;
	private JLabel mensajeNums, mensajeSigno, valorap, valorap1, empty;
	private JTextField txtnums, txtsigno, txtvalorap;
	private JButton btncrearAp, btnleerAP, btneliminarAP, btnactualizarAP, btnvolver;
	
	public static final String CREARAPS = "caps";
	public static final String LEERAPS = "laps";
	public static final String ELIMINARAPS = "eaps";
	public static final String ACTUALIZARAPS = "aaps";
	public static final String VOLVER = "volverap";
	
	public PanelSuperastro(String ruta) {
		fondo = new ImageIcon(ruta);
		setLayout(new GridLayout(4,4,20,20));
		
		mensajeNums = new JLabel("Numeros: ");
		add(mensajeNums);
		
		txtnums = new JTextField();
		add(txtnums);
		
		empty = new JLabel();
		add(empty);
		
		btnvolver = new JButton("Volver");
		btnvolver.setActionCommand(VOLVER);
		add(btnvolver);
		
		mensajeSigno = new JLabel("Signo: ");
		add(mensajeSigno);
		
		txtsigno = new JTextField();
		add(txtsigno);
		
		empty = new JLabel();
		add(empty);
		
		empty = new JLabel();
		add(empty);
		
		valorap = new JLabel("Valor de apuesta");
		add(valorap);
		
		txtvalorap = new JTextField();
		add(txtvalorap);
		
		valorap1 = new JLabel("entre $500 y $10k");
		add(valorap1);
		
		empty = new JLabel();
		add(empty);
		
		btncrearAp = new JButton("Jugar");
		btncrearAp.setActionCommand(CREARAPS);
		add(btncrearAp);
		
		btnleerAP = new JButton("Ver");
		btnleerAP.setActionCommand(LEERAPS);
		add(btnleerAP);
		
		btnactualizarAP = new JButton("Modificar apuesta");
		btnactualizarAP.setActionCommand(ACTUALIZARAPS);
		add(btnactualizarAP);
		
		btneliminarAP = new JButton("Eliminar apuesta");
		btneliminarAP.setActionCommand(ELIMINARAPS);
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

	public JLabel getMensajeSigno() {
		return mensajeSigno;
	}

	public void setMensajeSigno(JLabel mensajeSigno) {
		this.mensajeSigno = mensajeSigno;
	}

	public JTextField getTxtnums() {
		return txtnums;
	}

	public void setTxtnums(JTextField txtnums) {
		this.txtnums = txtnums;
	}

	public JTextField getTxtsigno() {
		return txtsigno;
	}

	public void setTxtsigno(JTextField txtsigno) {
		this.txtsigno = txtsigno;
	}

	public JTextField getTxtvalorap() {
		return txtvalorap;
	}

	public void setTxtvalorap(JTextField txtvalorap) {
		this.txtvalorap = txtvalorap;
	}

	
}
