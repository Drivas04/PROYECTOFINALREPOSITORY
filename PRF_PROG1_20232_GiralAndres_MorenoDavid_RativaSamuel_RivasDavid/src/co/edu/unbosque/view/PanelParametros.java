package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PanelParametros extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private ImageIcon fondo;
	private JLabel nombre, numSedes, presupuesto, empty;
	private JTextField txtnombreCasa, txtNumeroSedes, txtPresupuestosTotales;
	private JButton btnCrear, btnModificar, btnGuardar, btnVolver;
	
	public static final String CREARAR = "crearAR";
	public static final String GUARDAR = "guardar";
	public static final String MODIFICAR = "modificar";
	public static final String VOLVER = "volver";
	
	public PanelParametros(String ruta) {
		fondo = new ImageIcon(ruta);
		setLayout(new GridLayout(4,3,20,20));
		TitledBorder border = BorderFactory.createTitledBorder("Parametros de la casa de apuestas");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		nombre = new JLabel("Nombre: ");
		add(nombre);
		
		txtnombreCasa = new JTextField();
		add(txtnombreCasa);
		
		btnVolver = new JButton("Volver");
		btnVolver.setActionCommand(VOLVER);
		add(btnVolver);
		
		numSedes = new JLabel("Numero de sedes");
		add(numSedes);
		
		txtNumeroSedes = new JTextField();
		add(txtNumeroSedes);
		
		empty = new JLabel();
		add(empty);
		
		presupuesto = new JLabel("Presupuesto total");
		add(presupuesto);
		
		txtPresupuestosTotales = new JTextField();
		add(txtPresupuestosTotales);
		
		empty = new JLabel();
		add(empty);
		
		btnCrear = new JButton("Crear archivo");
		btnCrear.setActionCommand(CREARAR);
		add(btnCrear);
		
		btnGuardar = new JButton("Guardar parametros");
		btnGuardar.setActionCommand(GUARDAR);
		add(btnGuardar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setActionCommand(MODIFICAR);
		add(btnModificar);
	}
	
	@Override
	public void paint(Graphics g) {
		Dimension dim = this.getSize();
		g.drawImage(fondo.getImage(), 0, 0, dim.width, dim.height, null);
		this.setOpaque(false);
		super.paint(g);
	}

	public ImageIcon getFondo() {
		return fondo;
	}

	public void setFondo(ImageIcon fondo) {
		this.fondo = fondo;
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JLabel getNumSedes() {
		return numSedes;
	}

	public void setNumSedes(JLabel numSedes) {
		this.numSedes = numSedes;
	}

	public JLabel getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(JLabel presupuesto) {
		this.presupuesto = presupuesto;
	}

	public JTextField getTxtnombreCasa() {
		return txtnombreCasa;
	}

	public void setTxtnombreCasa(JTextField txtnombreCasa) {
		this.txtnombreCasa = txtnombreCasa;
	}

	public JTextField getTxtNumeroSedes() {
		return txtNumeroSedes;
	}

	public void setTxtNumeroSedes(JTextField txtNumeroSedes) {
		this.txtNumeroSedes = txtNumeroSedes;
	}

	public JTextField getTxtPresupuestosTotales() {
		return txtPresupuestosTotales;
	}

	public void setTxtPresupuestosTotales(JTextField txtPresupuestosTotales) {
		this.txtPresupuestosTotales = txtPresupuestosTotales;
	}

	public JButton getBtnCrear() {
		return btnCrear;
	}

	public void setBtnCrear(JButton btnCrear) {
		this.btnCrear = btnCrear;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	
}
