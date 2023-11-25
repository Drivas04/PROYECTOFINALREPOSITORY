package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelGestionarApuestaBetplay extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private ImageIcon fondo;
	private JButton btnGuardar;
	
	public static final String GUARDARABP = "guardarabp";
	
	public PanelGestionarApuestaBetplay(String ruta) {
		fondo = new ImageIcon(ruta);
		setLayout(new GridLayout(1,3,10,10));
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setActionCommand(GUARDARABP);
		btnGuardar.setBackground(Color.yellow);
		add(btnGuardar);
	}
	
	@Override
	public void paint(Graphics g) {
		Dimension dim = this.getSize();
		g.drawImage(fondo.getImage(), 0, 0, dim.width, dim.height, null);
		this.setOpaque(false);
		super.paint(g);
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}
	
	
}
