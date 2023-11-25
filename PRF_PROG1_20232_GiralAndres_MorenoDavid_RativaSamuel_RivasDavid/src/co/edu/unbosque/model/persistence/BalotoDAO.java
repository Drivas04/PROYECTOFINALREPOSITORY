package co.edu.unbosque.model.persistence;

import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.BalotoDTO;

public class BalotoDAO {

	private ArchivoBaloto archba;
	
	public BalotoDAO(ArchivoBaloto archba) {
		this.archba = archba;
	}
	
	//CRUD
	
	public boolean crearApBaloto(String nums, String cedula, String sede, String fecha, String valorAp, ArrayList<BalotoDTO> balotos, File fileBa) {
		BalotoDTO nuevo = new BalotoDTO(nums, cedula, sede, fecha, valorAp);
		if(buscarApBaloto(nums, balotos)==null) {
			balotos.add(nuevo);
			archba.escribirEnArchivo(balotos, fileBa);
			return true;
		}
		return false;
	}
	
	public BalotoDTO buscarApBaloto(String nums, ArrayList<BalotoDTO> balotos) {
		BalotoDTO encontrado = null;
		if(!balotos.isEmpty()) {
			for(int i=0;i<balotos.size();i++) {
				if(balotos.get(i).getNumCifras().equals(nums)) {
					encontrado = balotos.get(i);
				}
			}
		}
	return encontrado;
	}
	
	public String verApBaloto(String nums, ArrayList<BalotoDTO> balotos) {
		String texto = "";
		for(int i=0;i<balotos.size();i++) {
			if(balotos.get(i).getNumCifras().equals(nums)) {
				texto = texto.concat(balotos.get(i).toString()+"\n");
			}
		}
	return texto;
	}
	
	public boolean eliminarApBaloto(String nums, ArrayList<BalotoDTO> balotos, File fileba) {
		boolean resp = false;
		try {
			BalotoDTO ba = buscarApBaloto(nums, balotos);
			if(ba!=null) {
				balotos.remove(ba);
				fileba.delete();
				archba.escribirEnArchivo(balotos, fileba);
				resp = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return resp;
	}
}
