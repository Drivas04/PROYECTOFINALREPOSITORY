package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelSedes extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel Ubicacion;
	private JTextField TxtUbicacion;
	private JLabel NumEmpleados;
	private JTextField TxtNumEmpleados;
	private JLabel empty;
	//Botones
	private JButton butCrearArchivo;
	private JButton butGuardar;
	private JButton butverSedes;
	private JButton butEliminar;
	private JButton butVolver;
	
	private ImageIcon fondo;
	
	public static final String CREAR="CrearS";
	public static final String GUARDAR="GuardarS";
	public static final String VER="VerS";
	public static final String ELIMINAR="EliminarS";
	public static final String VOLVER="Volver";
	
	public PanelSedes(String ruta) {
		fondo = new ImageIcon(ruta);
		setLayout(new GridLayout(3,3,20,20));
		TitledBorder border = BorderFactory.createTitledBorder("Ingrese los datos de la sede");
		border.setTitleColor(Color.BLACK);
		setBorder(border );
		empty = new JLabel();
		
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
		butGuardar.setBounds(320,260,145, 35);
		butGuardar.setActionCommand(GUARDAR);
		
		butverSedes=new JButton("Ver sedes");
		butverSedes.setBounds(460, 260, 145, 35);
		butverSedes.setActionCommand(VER);
		
		butEliminar= new JButton("Eliminar");
		butEliminar.setBounds(320, 460, 154, 35);
		butEliminar.setActionCommand(ELIMINAR);
		
		butVolver = new JButton("Volver");
		butVolver.setBounds(320, 460, 145, 35);
		butVolver.setActionCommand(VOLVER);
		
		add(Ubicacion);
		add(TxtUbicacion);
		
		add(butVolver);
		
		add(NumEmpleados);
		add(TxtNumEmpleados);
		add(butEliminar);
		
		
		add(butCrearArchivo);
		add(butGuardar);
		add(butverSedes);
		
		
	}

	@Override
	public void paint(Graphics g) {
		Dimension dim = this.getSize();
		g.drawImage(fondo.getImage(), 0, 0, dim.width, dim.height, null);
		this.setOpaque(false);
		super.paint(g);
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

	public JButton getButVolver() {
		return butVolver;
	}

	public void setButVolver(JButton butVolver) {
		this.butVolver = butVolver;
	}

	public JButton getButEliminar() {
		return butEliminar;
	}

	public void setButEliminar(JButton butEliminar) {
		this.butEliminar = butEliminar;
	}
	
	
}
