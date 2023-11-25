package co.edu.unbosque.model.persistence;

import java.io.File;
import java.util.ArrayList;
import co.edu.unbosque.model.SuperAstroDTO;

public class SuperastroDAO {

private ArchivoSuperastro archSA;
	
	public SuperastroDAO(ArchivoSuperastro archSA) {
		this.archSA = archSA;
	}
	
	//CRUD
	
	public boolean crearApSuperastro(String cedula, String numCifras, String signoZodiacal, String sede, String fechaApuesta, String valorAp, ArrayList<SuperAstroDTO> superas, File filesa) {
		SuperAstroDTO nuevo = new SuperAstroDTO(cedula, numCifras, signoZodiacal, sede, fechaApuesta, valorAp);
		if(buscarApSuperastro(numCifras, superas)==null) {
			superas.add(nuevo);
			archSA.escribirEnArchivo(superas, filesa);
			return true;
		}
		return false;
	}
	
	public SuperAstroDTO buscarApSuperastro(String numCifras, ArrayList<SuperAstroDTO> superas) {
		SuperAstroDTO encontrado = null;
		if(!superas.isEmpty()) {
			for(int i=0;i<superas.size();i++) {
				if(superas.get(i).getNumCifras().equals(numCifras)) {
					encontrado = superas.get(i);
				}
			}
		}
	return encontrado;
	}
	
	public String verApSuperastro(String numCifras, ArrayList<SuperAstroDTO> superas) {
		String texto = "";
		for(int i=0;i<superas.size();i++) {
			if(superas.get(i).getNumCifras().equals(numCifras)) {
				texto = texto.concat(superas.get(i).toString()+"\n");
			}
		}
	return texto;
	}
	
	public boolean eliminarApSuperastro(String numCifras, ArrayList<SuperAstroDTO> superas, File filesa) {
		boolean resp = false;
		try {
			SuperAstroDTO sa = buscarApSuperastro(numCifras, superas);
			if(sa!=null) {
				superas.remove(sa);
				filesa.delete();
				archSA.escribirEnArchivo(superas, filesa);
				resp = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return resp;
	}
}
