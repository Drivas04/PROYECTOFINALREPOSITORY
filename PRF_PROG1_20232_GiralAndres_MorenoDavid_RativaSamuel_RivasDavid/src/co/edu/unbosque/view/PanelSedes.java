package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelSedes extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel Ubicacion;
	private JTextField TxtUbicacion;
	private JLabel NumEmpleados;
	private JTextField TxtNumEmpleados;
	//Botones
	private JButton butCrearArchivo;
	private JButton butGuardar;
	private JButton butverSedes;
	
	public static final String CREAR="Crear";
	public static final String GUARDAR="Guardar";
	public static final String VER="Ver";
	
	public PanelSedes() {
		setLayout(null);
		Ubicacion=new JLabel("Ubicacion de sede");
		Ubicacion.setBounds(80, 80, 160, 80);
		TxtUbicacion=new JTextField("");
		TxtUbicacion.setBounds(250, 100, 110, 35);
		
		NumEmpleados=new JLabel("Numero de empleados");
		NumEmpleados.setBounds(80, 120, 160, 80);
		TxtNumEmpleados=new JTextField("");
		TxtNumEmpleados.setBounds(250, 140, 110, 35);
		
		butCrearArchivo=new JButton("Crear archivo");
		butCrearArchivo.setBounds(150, 260, 145, 35);
		butCrearArchivo.setActionCommand(CREAR);
		
		butGuardar=new JButton("Guardar");
		butGuardar.setBounds(320,260,110, 35);
		butGuardar.setActionCommand(GUARDAR);
		
		butverSedes=new JButton("Ver sedes");
		butverSedes.setBounds(460, 260, 145, 35);
		butverSedes.setActionCommand(VER);;
		
		add(Ubicacion);
		add(TxtUbicacion);
		add(NumEmpleados);
		add(TxtNumEmpleados);
		
		add(butCrearArchivo);
		add(butGuardar);
		add(butverSedes);
		
	}


	public JButton getButverSedes() {
		return butverSedes;
	}


	public void setButverSedes(JButton butverSedes) {
		this.butverSedes = butverSedes;
	}


	public JButton getButGuardar() {
		return butGuardar;
	}


	public void setButGuardar(JButton butGuardar) {
		this.butGuardar = butGuardar;
	}


	public JLabel getUbicacion() {
		return Ubicacion;
	}


	public void setUbicacion(JLabel ubicacion) {
		Ubicacion = ubicacion;
	}


	public JTextField getTxtUbicacion() {
		return TxtUbicacion;
	}


	public void setTxtUbicacion(JTextField txtUbicacion) {
		TxtUbicacion = txtUbicacion;
	}


	public JLabel getNumEmpleados() {
		return NumEmpleados;
	}


	public void setNumEmpleados(JLabel numEmpleados) {
		NumEmpleados = numEmpleados;
	}


	public JTextField getTxtNumEmpleados() {
		return TxtNumEmpleados;
	}


	public void setTxtNumEmpleados(JTextField txtNumEmpleados) {
		TxtNumEmpleados = txtNumEmpleados;
	}


	public JButton getButCrearArchivo() {
		return butCrearArchivo;
	}


	public void setButCrearArchivo(JButton butCrearArchivo) {
		this.butCrearArchivo = butCrearArchivo;
	}


	public static String getCrear() {
		return CREAR;
	}
	

}
