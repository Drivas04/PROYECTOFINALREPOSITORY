package co.edu.unbosque.view;

import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.*;

public class PanelConsultas extends JPanel{

	private static final long serialVersionUID = 1L;

	private JButton btnClientesxSedes, btnTotalApuestasxCliente, btnDetalleApuesta, btnTotalApuetsasxSede, btnTotalApuestaxJuego, btnVolver;
	private ImageIcon fondo;
	
	public static final String CLIENTESSEDE = "cps";
	public static final String APUESTASCLIENTE = "axc";
	public static final String DETALLEAPUESTA = "dap";
	public static final String APUESTASSEDES = "aps";
	public static final String APUESTASJUEGOS = "apj";
	public static final String VOLVER = "volverPanel";
	
	public PanelConsultas(String ruta) {
		fondo = new ImageIcon(ruta);
		setLayout(new GridLayout(3, 2, 20, 20));
		
		btnClientesxSedes = new JButton("Clientes por sede");
		btnClientesxSedes.setActionCommand(CLIENTESSEDE);
		add(btnClientesxSedes);
		
		btnTotalApuestasxCliente = new JButton("Apuestas por cliente");
		btnTotalApuestasxCliente.setActionCommand(APUESTASCLIENTE);
		add(btnTotalApuestasxCliente);
		
		btnDetalleApuesta = new JButton("Detalles de apuestas");
		btnDetalleApuesta.setActionCommand(DETALLEAPUESTA);
		add(btnDetalleApuesta);
		
		btnTotalApuetsasxSede = new JButton("Apuestas por sede");
		btnTotalApuetsasxSede.setActionCommand(APUESTASSEDES);
		add(btnTotalApuetsasxSede);
		
		btnTotalApuestaxJuego = new JButton("Apuestas por juego");
		btnTotalApuestaxJuego.setActionCommand(APUESTASJUEGOS);
		add(btnTotalApuestaxJuego);
		
		btnVolver = new JButton("Volver");
		btnVolver.setActionCommand(VOLVER);
		add(btnVolver);
	}

	@Override
	public void paint(Graphics g) {
		Dimension dim = this.getSize();
		g.drawImage(fondo.getImage(), 0, 0, dim.width, dim.height, null);
		this.setOpaque(false);
		super.paint(g);
	}
	
	public JButton getBtnClientesxSedes() {
		return btnClientesxSedes;
	}

	public void setBtnClientesxSedes(JButton btnClientesxSedes) {
		this.btnClientesxSedes = btnClientesxSedes;
	}

	public JButton getBtnTotalApuestasxCliente() {
		return btnTotalApuestasxCliente;
	}

	public void setBtnTotalApuestasxCliente(JButton btnTotalApuestasxCliente) {
		this.btnTotalApuestasxCliente = btnTotalApuestasxCliente;
	}

	public JButton getBtnDetalleApuesta() {
		return btnDetalleApuesta;
	}

	public void setBtnDetalleApuesta(JButton btnDetalleApuesta) {
		this.btnDetalleApuesta = btnDetalleApuesta;
	}

	public JButton getBtnTotalApuetsasxSede() {
		return btnTotalApuetsasxSede;
	}

	public void setBtnTotalApuetsasxSede(JButton btnTotalApuetsasxSede) {
		this.btnTotalApuetsasxSede = btnTotalApuetsasxSede;
	}

	public JButton getBtnTotalApuestaxJuego() {
		return btnTotalApuestaxJuego;
	}

	public void setBtnTotalApuestaxJuego(JButton btnTotalApuestaxJuego) {
		this.btnTotalApuestaxJuego = btnTotalApuestaxJuego;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}
	
	
}
