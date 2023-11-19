package co.edu.unbosque.view;

import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelOpciones extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JButton Crear,Leer,Actualizar,Borrar, volver;
	private ImageIcon fondo;
	
	public static final String CREARA = "crear";
	public static final String LEER = "leer";
	public static final String ACTUALIZAR = "actualizar";
	public static final String BORRAR = "borrar";
	public static final String VOLVER = "volver";
	
	public PanelOpciones(String ruta) {
		fondo = new ImageIcon(ruta);
		setLayout(new FlowLayout(FlowLayout.CENTER ,20,250));
		Crear=new JButton("Crear Apostador");
		Crear.setActionCommand(CREARA);
		add(Crear);
		Leer=new JButton("Leer datos de apostador");
		Leer.setActionCommand(LEER);
		add(Leer);
		Actualizar=new JButton("Actualizar datos de apostador");
		Actualizar.setActionCommand(ACTUALIZAR);
		add(Actualizar);
		Borrar=new JButton("Borras datos de apostador");
		Borrar.setActionCommand(BORRAR);
		add(Borrar);
		volver = new JButton("Volver");
		volver.setActionCommand(VOLVER);
		add(volver);
	}
	
	@Override
	public void paint(Graphics g) {
		Dimension dim = this.getSize();
		g.drawImage(fondo.getImage(), 0, 0, dim.width, dim.height, null);
		this.setOpaque(false);
		super.paint(g);
	}

	public JButton getCrear() {
		return Crear;
	}

	public void setCrear(JButton crear) {
		Crear = crear;
	}

	public JButton getLeer() {
		return Leer;
	}

	public void setLeer(JButton leer) {
		Leer = leer;
	}

	public JButton getActualizar() {
		return Actualizar;
	}

	public void setActualizar(JButton actualizar) {
		Actualizar = actualizar;
	}

	public JButton getBorrar() {
		return Borrar;
	}

	public void setBorrar(JButton borrar) {
		Borrar = borrar;
	}

	public static String getLEER() {
		return LEER;
	}
	public static String getACTUALIZAR() {
		return ACTUALIZAR;
	}

	public static String getBORRAR() {
		return BORRAR;
	}

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}
	
	

}
