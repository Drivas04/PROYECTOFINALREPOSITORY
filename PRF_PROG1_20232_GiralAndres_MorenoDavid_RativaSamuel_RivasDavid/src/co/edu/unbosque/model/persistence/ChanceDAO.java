package co.edu.unbosque.model.persistence;

import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.BetPlayDTO;
import co.edu.unbosque.model.ChanceDTO;

public class ChanceDAO {
	
	private ArchivoChance archC;
	
	public ChanceDAO(ArchivoChance archC) {
		this.archC = archC;
	}
	
	//CRUD
	
	public boolean crearApChance(String cedula,String nombre, String numElegidos, String sede, String fecha, String valorAp, ArrayList<ChanceDTO> chances, File filech) {
		ChanceDTO nuevo = new ChanceDTO(cedula, nombre, numElegidos, sede, fecha, valorAp);
		if(buscarApChance(numElegidos, chances)==null) {
			chances.add(nuevo);
			archC.escribirEnArchivo(chances, filech);
			return true;
		}
		return false;
	}
	
	public ChanceDTO buscarApChance(String numElegidos, ArrayList<ChanceDTO> chance) {
		ChanceDTO encontrado = null;
		if(!chance.isEmpty()) {
			for(int i=0;i<chance.size();i++) {
				if(chance.get(i).getNumerosElegidos().equals(numElegidos)) {
					encontrado = chance.get(i);
				}
			}
		}
	return encontrado;
	}
	
	public String verApChance(String numElegidos, ArrayList<ChanceDTO> chances) {
		String texto = "";
		for(int i=0;i<chances.size();i++) {
			if(chances.get(i).getNumerosElegidos().equals(numElegidos)) {
				texto = texto.concat(chances.get(i).toString()+"\n");
			}
		}
	return texto;
	}
	
	public boolean eliminarApChance(String numElegidos, ArrayList<ChanceDTO> chances, File filech) {
		boolean resp = false;
		try {
			ChanceDTO ch = buscarApChance(numElegidos, chances);
			if(ch!=null) {
				chances.remove(ch);
				filech.delete();
				archC.escribirEnArchivo(chances, filech);
				resp = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return resp;
	}
}
