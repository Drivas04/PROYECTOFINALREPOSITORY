package co.edu.unbosque.model.persistence;

import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.ParametrosDTO;

public class ParametrosDAO {

	private ArchivoPropiedades archProp;

	public ParametrosDAO(ArchivoPropiedades archProp) {
		this.archProp = archProp;
	}

	public boolean agregarParametros(String nombreCasa, String numSedes, String presupuesto,
			ArrayList<ParametrosDTO> parametros, File file) {
		ParametrosDTO nuevo = new ParametrosDTO(nombreCasa, numSedes, presupuesto);
		if (buscarParametros(nombreCasa, parametros) == null) {
			parametros.add(nuevo);
			archProp.escribirEnArchivo(parametros, file);
			return true;
		}
		return false;
	}

	public ParametrosDTO buscarParametros(String nombreCasa, ArrayList<ParametrosDTO> parametros) {
		ParametrosDTO encontrado = null;
		if (!parametros.isEmpty()) {
			for (int i = 0; i < parametros.size(); i++) {
				if (parametros.get(i).getNombreCasa().equals(nombreCasa)) {
					encontrado = parametros.get(i);
				}
			}
		}
		return encontrado;
	}

	public boolean eliminarParametros(String nombreCasa, ArrayList<ParametrosDTO> parametros, File file) {
		boolean resp = false;
		try {
			ParametrosDTO p = buscarParametros(nombreCasa, parametros);
			if (p != null) {
				parametros.remove(p);
				file.delete();
				archProp.escribirEnArchivo(parametros, file);
				resp = true;
			}
			return resp;
		} catch (Exception e) {
			// TODO: handle exception
		}

		return resp;
	}
	
	public String verParametros(ArrayList<ParametrosDTO> parametros) {
		String texto = "";
		for(int i=0; i<parametros.size();i++) {
			texto = texto.concat(parametros.get(i).toString()+"\n");
		}
		return texto;
	}
}
