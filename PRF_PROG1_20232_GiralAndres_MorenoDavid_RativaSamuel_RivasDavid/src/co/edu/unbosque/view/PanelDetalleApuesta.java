package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelDetalleApuesta extends JPanel{

	private static final long serialVersionUID = 1L;

	private ImageIcon fondo;
	private JLabel cedula, juego;
	private JTextField txtCedula, txtJuego;
	private JButton btncontinuar, btnvolver;
	
	public static final String CONTINUAR = "continuarD";
	public static final String VOLVER = "volverD";
	
	public PanelDetalleApuesta(String ruta) {
		fondo = new ImageIcon(ruta);
		setLayout(new GridLayout(3,2,20,20));
		
		cedula = new JLabel("Cedula del apostador: ");
		add(cedula);
		
		txtCedula =  new JTextField();
		add(txtCedula);
		
		juego = new JLabel("Juego: ");
		add(juego);
		
		txtJuego = new JTextField();
		add(txtJuego);
		
		btncontinuar = new JButton("Continuar");
		btncontinuar.setActionCommand(CONTINUAR);
		add(btncontinuar);
		
		btnvolver = new JButton("Volver");
		btnvolver.setActionCommand(VOLVER);
		add(btnvolver);
	}

	public JTextField getTxtCedula() {
		return txtCedula;
	}

	public void setTxtCedula(JTextField txtCedula) {
		this.txtCedula = txtCedula;
	}

	public JTextField getTxtJuego() {
		return txtJuego;
	}

	public void setTxtJuego(JTextField txtJuego) {
		this.txtJuego = txtJuego;
	}

	public JButton getBtncontinuar() {
		return btncontinuar;
	}

	public void setBtncontinuar(JButton btncontinuar) {
		this.btncontinuar = btncontinuar;
	}

	public JButton getBtnvolver() {
		return btnvolver;
	}

	public void setBtnvolver(JButton btnvolver) {
		this.btnvolver = btnvolver;
	}
	
}
