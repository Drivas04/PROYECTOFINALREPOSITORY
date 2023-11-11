package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.Baloto;
import co.edu.unbosque.model.Chance;
import co.edu.unbosque.model.JuegosDTO;
import co.edu.unbosque.model.Loteria;
import co.edu.unbosque.model.SedesDTO;
import co.edu.unbosque.model.SuperAstro;
import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.ArchivoSedes;
import co.edu.unbosque.model.persistence.JuegosDAO;
import co.edu.unbosque.model.persistence.SedesDAO;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{

	private VentanaPrincipal ventanaP;
	private ArrayList<JuegosDTO> juegos;
	private JuegosDTO juegosdto;
	private Archivo archivo;
	private JuegosDAO juegosDao;
	private File file = new File("Data/juegos.dat");
	
	private File filesedes=new File("Data/sedes.dat");
	private ArrayList<SedesDTO> sedes;
	private SedesDTO sedesdto;
	private ArchivoSedes archivosedes;
	private SedesDAO sedesDAO;
	
	public Controller() {
		ventanaP = new VentanaPrincipal(this);
		ventanaP.setVisible(true);
		juegos = new ArrayList<JuegosDTO>();
		juegosdto = new JuegosDTO(null, null, 0);
		archivo = new Archivo(file);
		juegosDao = new JuegosDAO(archivo);
		juegos = archivo.leerArchivo(file);
		
		
		
		sedes=new ArrayList<SedesDTO>();
		sedesdto = new SedesDTO(null, 0);
		archivosedes=new ArchivoSedes(filesedes);
		sedesDAO=new SedesDAO(archivosedes);
		sedes = archivosedes.leerArchivoSedes(filesedes);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//panelPrincipal
		if(e.getActionCommand().equals(ventanaP.getPanelP().INGRESAR)) {
			ventanaP.getPanelP().setVisible(false);
			ventanaP.getPanelEleccion().setVisible(true);
			ventanaP.resize(500,200);
			ventanaP.setLocationRelativeTo(null);
			//ventanaP.mostrarMensaje(juegosDao.verJuegos(juegos), null);
		}
		
		if(e.getActionCommand().equals(ventanaP.getPanelP().SEDES)) {
			ventanaP.getPanelP().setVisible(false);
			ventanaP.getPanelS().setVisible(true);
			//ventanaP.resize(500,200);
			ventanaP.setLocationRelativeTo(null);
		}
		
		//panelEleccion
		if(e.getActionCommand().equals(ventanaP.getPanelEleccion().BALOTO)) {
			Baloto baloto = new Baloto(null, null, 0, 0);
			juegosDao.agregarJuego(baloto.getNombreJuego(), baloto.getTipoJuego(), baloto.getPresupuestoJuego(), juegos, file);
			ventanaP.mostrarMensaje(juegosDao.verJuegos(juegos), "juegos");
		}
		
		if(e.getActionCommand().equals(ventanaP.getPanelEleccion().BETPLAY)) {
			
		}
		
		if(e.getActionCommand().equals(ventanaP.getPanelEleccion().CHANCE)) {
			Chance chance = new Chance(null, null, 0, null, 0);
			juegosDao.agregarJuego(chance.getNombreJuego(), chance.getTipoJuego(), chance.getPresupuestoJuego(), juegos, file);
			ventanaP.mostrarMensaje(juegosDao.verJuegos(juegos), "juegos");
		}
		
		if(e.getActionCommand().equals(ventanaP.getPanelEleccion().LOTERIA)) {
			Loteria loteria = new Loteria(null, null, 0, null, 0, 0);
			juegosDao.agregarJuego(loteria.getNombreJuego(), loteria.getTipoJuego(), loteria.getPresupuestoJuego(), juegos, file);
			
		}
		
		if(e.getActionCommand().equals(ventanaP.getPanelEleccion().SUPERASTRO)) {
			SuperAstro superastro = new SuperAstro(null, null, 0, 0, null);
			juegosDao.agregarJuego(superastro.getNombreJuego(), superastro.getTipoJuego(), superastro.getPresupuestoJuego(), juegos, file);
		}
		
		//PanelS
		if(e.getActionCommand().equals(ventanaP.getPanelP().SEDES)) {
			try {
				archivosedes.crearArchivoSedes(filesedes);
				//System.out.println("Exito");
			}catch(Exception u) {
				
			}
		}
		
		if(e.getActionCommand().equals(ventanaP.getPanelS().GUARDAR)) {
			if(ventanaP.getPanelS().getTxtUbicacion().getText().isEmpty()
				||ventanaP.getPanelS().getTxtNumEmpleados().getText().isEmpty()){
				ventanaP.mostrarMensaje("Agregar todos los campos", "ERROR");
				
			}else {
				if(sedesDAO.guardarSede(ventanaP.getPanelS().getTxtUbicacion().getText(),
					Integer.parseInt(ventanaP.getPanelS().getTxtNumEmpleados().getText()), sedes, filesedes)) {
					ventanaP.mostrarMensaje("Sede guardada exitosamente", "INFORMACION");
				}else {
					ventanaP.mostrarMensaje("Error al guardar sede", "ERROR");
				}
				
			}
		}
		if(e.getActionCommand().equals(ventanaP.getPanelS().VER)) {
			if(getSedes().size()>0) {
				ventanaP.mostrarMensaje(sedesDAO.verSedes(sedes), "INFORMACION");
			}else {
				ventanaP.mostrarMensaje("No hay sedes para mostrar", "ERROR");
			}
		}
	}
	
	public ArrayList<SedesDTO>getSedes(){
		return sedes;
	}
}
