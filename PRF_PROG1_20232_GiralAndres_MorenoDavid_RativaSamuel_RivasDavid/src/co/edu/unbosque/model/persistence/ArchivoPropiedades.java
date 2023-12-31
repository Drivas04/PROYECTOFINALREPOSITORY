package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.ParametrosDTO;
import co.edu.unbosque.view.VentanaPrincipal;

public class ArchivoPropiedades {

	private ObjectInputStream entrada;
	private ObjectOutputStream salida;
	
	public ArchivoPropiedades(File archprop) {
		
	}
	
	public static void crearArchivo(File archProp) {
		
		if (archProp.exists()) {
			
		}
		else {
			try {
				archProp.createNewFile();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void escribirEnArchivo(ArrayList<ParametrosDTO> parametros, File archProp) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(archProp));
			salida.writeObject(parametros);
			salida.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<ParametrosDTO> leerArchivo(File archProp){
		ArrayList<ParametrosDTO> parametros = new ArrayList<ParametrosDTO>();
		if(archProp.length()!=0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(archProp));
				try {
					parametros = (ArrayList<ParametrosDTO>) entrada.readObject();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return parametros;
	}
	
	public String verPropiedades(String prop1, String prop2, String prop3) {
		PropiedadesCasasDeApuestas prop = new PropiedadesCasasDeApuestas();
		prop.escribirPropiedades(prop1, prop2, prop3);
		return ""+prop.leerPropiedades();
	}
}
