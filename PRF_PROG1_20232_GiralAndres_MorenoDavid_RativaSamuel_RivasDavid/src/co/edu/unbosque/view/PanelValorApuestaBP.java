package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelValorApuestaBP extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel valorAp, id, empty;
	private JTextField txtValorAp, txtId;
	private JButton btnContinuar;
	
	public static final String CONTINUAR="continuar";
	
	public PanelValorApuestaBP() {
		setLayout(new GridLayout(3,2,20,20));
		valorAp = new JLabel("Valor de la apuesta: ");
		add(valorAp);
		
		txtValorAp = new JTextField();
		add(txtValorAp);
		
		empty=new JLabel();
		add(empty);
		
		id = new JLabel("Id de la apuesta");
		add(id);
		
		txtId = new JTextField();
		add(txtId);
		
		empty=new JLabel();
		add(empty);
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.setActionCommand(CONTINUAR);
		add(btnContinuar);
		
		
	}

	public JLabel getValorAp() {
		return valorAp;
	}

	public void setValorAp(JLabel valorAp) {
		this.valorAp = valorAp;
	}

	public JLabel getId() {
		return id;
	}

	public void setId(JLabel id) {
		this.id = id;
	}

	public JTextField getTxtValorAp() {
		return txtValorAp;
	}

	public void setTxtValorAp(JTextField txtValorAp) {
		this.txtValorAp = txtValorAp;
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}

	public JButton getBtnContinuar() {
		return btnContinuar;
	}

	public void setBtnContinuar(JButton btnContinuar) {
		this.btnContinuar = btnContinuar;
	}
	
	
}
