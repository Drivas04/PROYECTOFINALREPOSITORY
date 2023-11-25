package co.edu.unbosque.model.persistence;

import java.io.File;
import java.util.ArrayList;
import co.edu.unbosque.model.LoteriaDTO;

public class LoteriaDAO {

private ArchivoLoteria archL;
	
	public LoteriaDAO(ArchivoLoteria archL) {
		this.archL = archL;
	}
	
	//CRUD
	
	public boolean crearApLoteria(String cedula, String nombre, String numNumeros, String numSeries, String sede, String fecha, String valorAp, ArrayList<LoteriaDTO> loterias, File fileL) {
		LoteriaDTO nuevo = new LoteriaDTO(cedula, nombre, numNumeros, numSeries, sede, fecha, valorAp);
		if(buscarApLoteria(numNumeros, loterias)==null) {
			loterias.add(nuevo);
			archL.escribirEnArchivo(loterias, fileL);
			return true;
		}
		return false;
	}
	
	public LoteriaDTO buscarApLoteria(String numNumeros, ArrayList<LoteriaDTO> loterias) {
		LoteriaDTO encontrado = null;
		if(!loterias.isEmpty()) {
			for(int i=0;i<loterias.size();i++) {
				if(loterias.get(i).getNumNumeros().equals(numNumeros)) {
					encontrado = loterias.get(i);
				}
			}
		}
	return encontrado;
	}
	
	public String verApLoteria(String numNumeros, ArrayList<LoteriaDTO> loterias) {
		String texto = "";
		for(int i=0;i<loterias.size();i++) {
			if(loterias.get(i).getNumNumeros().equals(numNumeros)) {
				texto = texto.concat(loterias.get(i).toString()+"\n");
			}
		}
	return texto;
	}
	
	public boolean eliminarApLoteria(String numNumeros, ArrayList<LoteriaDTO> loterias, File fileL) {
		boolean resp = false;
		try {
			LoteriaDTO l = buscarApLoteria(numNumeros, loterias);
			if(l!=null) {
				loterias.remove(l);
				fileL.delete();
				archL.escribirEnArchivo(loterias, fileL);
				resp = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return resp;
	}
}
