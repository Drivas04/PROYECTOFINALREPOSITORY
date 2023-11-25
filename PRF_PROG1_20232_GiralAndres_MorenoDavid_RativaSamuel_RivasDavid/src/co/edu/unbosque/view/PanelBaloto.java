package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.*;

public class PanelBaloto extends JPanel{

	private static final long serialVersionUID = 1L;

	private ImageIcon fondo;
	private JLabel mensaje, empty;
	private JTextField txtNumeros;
	private JButton btncrearAp, btnleerAP, btneliminarAP, btnactualizarAP, btnvolver;
	
	public static final String CREARAPBA = "capba";
	public static final String LEERAPBA = "lapba";
	public static final String ELIMINARAPBA = "eapba";
	public static final String ACTUALIZARAPBA = "aapba";
	public static final String VOLVER = "volverap";
	
	public PanelBaloto(String ruta) {
		fondo = new ImageIcon(ruta);
		setLayout(new GridLayout(2,4,20,40));
		
		mensaje = new JLabel("Digite 6 numeros: ");
		add(mensaje);
		
		txtNumeros = new JTextField();
		add(txtNumeros);
		
		empty = new JLabel();
		add(empty);
		
		btnvolver = new JButton("Volver");
		btnvolver.setActionCommand(VOLVER);
		add(btnvolver);
		
		btncrearAp = new JButton("Jugar");
		btncrearAp.setActionCommand(CREARAPBA);
		add(btncrearAp);
		
		btnleerAP = new JButton("Ver");
		btnleerAP.setActionCommand(LEERAPBA);
		add(btnleerAP);
		
		btnactualizarAP = new JButton("Modificar apuesta");
		btnactualizarAP.setActionCommand(ACTUALIZARAPBA);
		add(btnactualizarAP);
		
		btneliminarAP = new JButton("Eliminar apuesta");
		btneliminarAP.setActionCommand(ELIMINARAPBA);
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

	public JLabel getMensaje() {
		return mensaje;
	}

	public void setMensaje(JLabel mensaje) {
		this.mensaje = mensaje;
	}

	public JTextField getTxtNumeros() {
		return txtNumeros;
	}

	public void setTxtNumeros(JTextField txtNumeros) {
		this.txtNumeros = txtNumeros;
	}
	
	
}
