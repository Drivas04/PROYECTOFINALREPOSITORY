package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.JuegosDTO;
import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.JuegosDAO;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{

	private VentanaPrincipal ventanaP;
	private ArrayList<JuegosDTO> juegos;
	private Archivo archivo;
	private JuegosDAO juegosDao;
	private File file = new File("Data/juegos.dat");
	
	public Controller() {
		ventanaP = new VentanaPrincipal(this);
		ventanaP.setVisible(true);
		juegos = new ArrayList<JuegosDTO>();
		archivo = new Archivo(file);
		juegosDao = new JuegosDAO(archivo);
		juegos = archivo.leerArchivo(file);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//panelPrincipal
		if(e.getActionCommand().equals(ventanaP.getPanelP().INGRESAR)) {
			ventanaP.getPanelP().setVisible(false);
			ventanaP.getPanelEleccion().setVisible(true);
			ventanaP.resize(500,200);
			ventanaP.setLocationRelativeTo(null);
		}
		
		//panelEleccion
		if(e.getActionCommand().equals(ventanaP.getPanelEleccion().BALOTO)) {
			
		}
	}
}
