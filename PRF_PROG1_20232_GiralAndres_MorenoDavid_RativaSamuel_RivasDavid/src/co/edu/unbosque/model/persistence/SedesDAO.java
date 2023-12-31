package co.edu.unbosque.model.persistence;

import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.SedesDTO;

public class SedesDAO {
	private ArchivoSedes archivosedes;

	public SedesDAO(ArchivoSedes archivosedes) {
		this.archivosedes = archivosedes;
	}

//CRUD
	public String verSedes(ArrayList<SedesDTO> sedes) {
		String text = "";
		for (int i = 0; i < sedes.size(); i++) {
			text = text.concat(sedes.get(i).toString() + "\n");
		}
		return text;

	}
	
	public String verUbicaciones(ArrayList<SedesDTO> sedes) {
		String text = "";
		for(int i=0;i<sedes.size();i++) {
			text = text.concat(sedes.get(i).getUbicacion()+"\n");
		}
	return text;
	}

	public SedesDTO buscarSede(String ubicacion, ArrayList<SedesDTO> sedes) {
		SedesDTO encontrado = null;
		if (!sedes.isEmpty()) {
			for (int i = 0; i < sedes.size(); i++) {
				if (sedes.get(i).getUbicacion().equals(ubicacion)) {
					encontrado = sedes.get(i);
				}
			}
		}
		return encontrado;

	}

	public boolean guardarSede(String SUbicacion, int SNumEmpleados, ArrayList<SedesDTO> sedes, File filesedes) {
		SedesDTO nuevo = new SedesDTO(SUbicacion, SNumEmpleados);

		if (buscarSede(SUbicacion, sedes) == null) {
			sedes.add(nuevo);
			archivosedes.guardarArchivoSedes(sedes, filesedes);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean eliminarSede(String ubicacion, ArrayList<SedesDTO> sedes, File filesedes) {
		boolean resp=false;
		try {
			SedesDTO e = buscarSede(ubicacion, sedes);
			if(e!=null) {
				sedes.remove(e);
				filesedes.delete();
				filesedes.createNewFile();
				archivosedes.guardarArchivoSedes(sedes, filesedes);
				resp= true;
			}
			return resp;
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
		return resp;

	}

}
