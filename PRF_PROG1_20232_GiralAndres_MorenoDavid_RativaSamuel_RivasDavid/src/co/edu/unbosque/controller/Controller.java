package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.ApostadoresDTO;
import co.edu.unbosque.model.Baloto;
import co.edu.unbosque.model.Chance;
import co.edu.unbosque.model.JuegosDTO;
import co.edu.unbosque.model.Loteria;
import co.edu.unbosque.model.ParametrosDTO;
import co.edu.unbosque.model.SedesDTO;
import co.edu.unbosque.model.SuperAstro;
import co.edu.unbosque.model.persistence.ApostadoresDAO;
import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.ArchivoApostadores;
import co.edu.unbosque.model.persistence.ArchivoPropiedades;
import co.edu.unbosque.model.persistence.ArchivoSedes;
import co.edu.unbosque.model.persistence.JuegosDAO;
import co.edu.unbosque.model.persistence.ParametrosDAO;
import co.edu.unbosque.model.persistence.PropiedadesCasasDeApuestas;
import co.edu.unbosque.model.persistence.SedesDAO;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{

	private VentanaPrincipal ventanaP;
	private ArrayList<JuegosDTO> juegos;
	private Archivo archivo;
	private JuegosDAO juegosDao;
	private File file = new File("Data/juegos.dat");
	
	private ArrayList<ParametrosDTO> parametros;
	private PropiedadesCasasDeApuestas props;
	private ArchivoPropiedades archprop;
	private ParametrosDAO parametrosdao;
	private File fileParametros = new File("Data/config.dat");
	
	private File filesedes=new File("Data/sedes.dat");
	private ArrayList<SedesDTO> sedes;
	private ArchivoSedes archivosedes;
	private SedesDAO sedesDAO;
	
	private ArrayList<ApostadoresDTO>apostadores;
	private ArchivoApostadores archivoAp;
	private ApostadoresDAO apostadoresdao;
	private File fileAp=new File("Data/apostadores.dat");
	
	public Controller() {
		ventanaP = new VentanaPrincipal(this);
		ventanaP.setVisible(true);
		juegos = new ArrayList<JuegosDTO>();
		archivo = new Archivo(file);
		juegosDao = new JuegosDAO(archivo);
		juegos = archivo.leerArchivo(file);
		
		parametros = new ArrayList<ParametrosDTO>();
		props = new PropiedadesCasasDeApuestas();
		archprop = new ArchivoPropiedades(fileParametros);
		parametrosdao = new ParametrosDAO(archprop);
		parametros = archprop.leerArchivo(fileParametros);
		
		sedes=new ArrayList<SedesDTO>();
		archivosedes=new ArchivoSedes(filesedes);
		sedesDAO=new SedesDAO(archivosedes);
		sedes = archivosedes.leerArchivoSedes(filesedes);
		
		apostadores=new ArrayList<ApostadoresDTO>();
		archivoAp=new ArchivoApostadores(fileAp);
		apostadoresdao=new ApostadoresDAO(archivoAp);
		apostadores=archivoAp.LeerArchivo(fileAp);
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
		
		if(e.getActionCommand().equals(ventanaP.getPanelP().PARAMETROS)) {
			ventanaP.getPanelP().setVisible(false);
			ventanaP.getPanelPa().setVisible(true);
			ventanaP.resize(500,200);
			ventanaP.setLocationRelativeTo(null);
		}
		
		if(e.getActionCommand().equals(ventanaP.getPanelP().SEDES)) {
			ventanaP.getPanelP().setVisible(false);
			ventanaP.getPanelS().setVisible(true);
			//ventanaP.resize(500,200);
			ventanaP.setLocationRelativeTo(null);
		}
		
		if(e.getActionCommand().equals(ventanaP.getPanelP().APOSTADORES)) {
			ventanaP.getPanelP().setVisible(false);
			ventanaP.getPanelO().setVisible(true);
			//ventanaP.resize(500,200);
			ventanaP.setLocationRelativeTo(null);
		}
		
		//panelParametros
		if(e.getActionCommand().equals(ventanaP.getPanelPa().CREAR)) {
			archprop.crearArchivo(fileParametros);
		}
		
		if(e.getActionCommand().equals(ventanaP.getPanelPa().GUARDAR)) {
			if(ventanaP.getPanelPa().getTxtnombreCasa().getText().isEmpty() || ventanaP.getPanelPa().getTxtNumeroSedes().getText().isEmpty() || ventanaP.getPanelPa().getTxtPresupuestosTotales().getText().isEmpty()) {
				ventanaP.mostrarMensaje("Debe llenar todos los campos", "ERROR");
			}
			else {
				if(parametrosdao.agregarParametros(ventanaP.getPanelPa().getTxtnombreCasa().getText(), ventanaP.getPanelPa().getTxtNumeroSedes().getText(), ventanaP.getPanelPa().getTxtPresupuestosTotales().getText(), parametros, fileParametros)) {
					props.setNombre(ventanaP.getPanelPa().getTxtnombreCasa().getText()) ;
					props.setNumSedes(ventanaP.getPanelPa().getTxtnombreCasa().getText());
					props.setPresupuesto(ventanaP.getPanelPa().getTxtnombreCasa().getText());;
					props.escribirPropiedades();
					ventanaP.mostrarMensaje("Parametros agregados correctamente", "EXITO");
					//ventanaP.mostrarMensaje(parametrosdao.verParametros(parametros), "Parametros");
					ventanaP.mostrarMensaje(archprop.verPropiedades(), "Parametros");
				}
				else {
					ventanaP.mostrarMensaje("Estos parametros ya se encuentran registrados", "ERROR");
				}
			}
		}
		
		if(e.getActionCommand().equals(ventanaP.getPanelPa().VOLVER)) {
			ventanaP.getPanelPa().setVisible(false);
			ventanaP.getPanelP().setVisible(true);
			ventanaP.resize(800,600);
			ventanaP.setLocationRelativeTo(null);
		}
		
		//panelApostadores
		if(e.getActionCommand().equals(ventanaP.getPanelO().CREARA)) {
			
			ventanaP.getPanelO().setVisible(false);
			ventanaP.getPanelR().setVisible(true);
			ventanaP.resize(500,300);
			ventanaP.setLocationRelativeTo(null);
		}
		
		if(e.getActionCommand().equals(ventanaP.getPanelR().VOLVER)) {
			
			ventanaP.getPanelR().setVisible(false);
			ventanaP.getPanelP().setVisible(false);
			ventanaP.getPanelO().setVisible(true);
		}
		
		
		if(e.getActionCommand().equals(ventanaP.getPanelO().ACTUALIZAR)) {
			String cedulaApostador=ventanaP.capturarDato("Ingrese la cedula del apostador que quiere actualizar", "INGRESE CEDULA");
			if(apostadoresdao.BuscarApostador(cedulaApostador, apostadores)!=null) {
			apostadoresdao.EliminarApostador(cedulaApostador, apostadores, fileAp);
			ventanaP.getPanelO().setVisible(false);
			ventanaP.getPanelR().setVisible(true);
			ventanaP.resize(500,300);
			ventanaP.mostrarMensaje("Al actualizar los datos pulse el boton CREAR para guardar", "INFO");
			}
			else {
				ventanaP.mostrarMensaje("Apostador no encontrado", "ERROR");
				
			}
		}
		
		if(e.getActionCommand().equals(ventanaP.getPanelR().CREAR)) { 
			
			if(ventanaP.getPanelR().getCampoNombre().getText().isEmpty()
					|| ventanaP.getPanelR().getCampoCedula().getText().isEmpty()
					|| ventanaP.getPanelR().getCampoDireccion().getText().isEmpty()
					|| ventanaP.getPanelR().getCampoCelular().getText().isEmpty()
					|| ventanaP.getPanelR().getCampoEdad().getText().isEmpty()) {
				  ventanaP.mostrarMensaje("Debe agregar todos los valores", "error");
			}else {
				int numero=Integer.parseInt(ventanaP.getPanelR().getCampoEdad().getText());
				if(numero<18) {
					ventanaP.mostrarMensaje("El jugador debe ser mayor de edad", "ERROR");
				}
			else {
				if(apostadoresdao.AgregarApostador(ventanaP.getPanelR().getCampoNombre().getText(), ventanaP.getPanelR().getCampoCedula().getText(),ventanaP.getPanelR().getCampoCelular().getText(),
						ventanaP.getPanelR().getCampoDireccion().getText(),ventanaP.getPanelR().getCampoEdad().getText(), apostadores,fileAp)) {
					ventanaP.mostrarMensaje("Se ha agregado el apostador con cedula: "+ventanaP.getPanelR().getCampoCedula().getText(), "INFORMACION");	
				}else {
					ventanaP.mostrarMensaje("El apostador con cedula: "+ventanaP.getPanelR().getCampoCedula().getText()+" ya se enecunetra en el sistema", "ERROR");
				}
						
			}
			
		}
			}
			
		
		if(e.getActionCommand().equals(ventanaP.getPanelO().LEER)) {
			if(getApostadores().size()>0) {
				ventanaP.mostrarMensaje(apostadoresdao.LeerApostador(apostadores), "informacion");
			}else {
				ventanaP.mostrarMensaje("No hay apostadores en el sistema actualmente", "Informacion");
			}
			
		}
		
		
		
		if(e.getActionCommand().equals(ventanaP.getPanelO().BORRAR)) {
			 String cedulaApostador1=ventanaP.capturarDato("Ingrese la cedula del apostador que quiere eliminar", "INGRESE CEDULA");
			if(apostadoresdao.BuscarApostador(cedulaApostador1, apostadores)!=null) {
				if(apostadoresdao.EliminarApostador(cedulaApostador1, apostadores, fileAp)){
				ventanaP.mostrarMensaje("Se ha eliminado el apostador con cedula: "+cedulaApostador1, "INFORMACION");
				}else {
					ventanaP.mostrarMensaje("No se ha podido eliminar el apostador con cedula: "+cedulaApostador1, "ERROR");
				}
			}else {
				ventanaP.mostrarMensaje("El apostador con cedula: "+cedulaApostador1+" no se ha encontrado en el sistema", "ERROR");
			}
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
				
			}catch(Exception ex) {
				ex.printStackTrace();
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
	public ArrayList<ApostadoresDTO>getApostadores(){
		return apostadores;
	}
	
}
