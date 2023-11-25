package co.edu.unbosque.model.persistence;

import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.BetPlayDTO;

public class BetplayDAO {

private ArchivoBetplay archbp;
	
	public BetplayDAO(ArchivoBetplay archbp) {
		this.archbp = archbp;
	}
	
	//CRUD
	
	public boolean crearApBetPlay(String id, String cedula, String sede, String fechaApuesta, String valorAp, String ganador, String ganador2, String ganador3, String ganador4, String ganador5, String ganador6, String ganador7, String ganador8, String ganador9, String ganador10, String ganador11, String ganador12, String ganador13, String ganador14, ArrayList<BetPlayDTO> betplays, File fileBp) {
		BetPlayDTO nuevo = new BetPlayDTO(id, cedula, sede, fechaApuesta, valorAp, ganador, ganador2, ganador3, ganador4, ganador5, ganador6, ganador7, ganador8, ganador9, ganador10, ganador11, ganador12, ganador13, ganador14);
		if(buscarApBetplay(id, betplays)==null) {
			betplays.add(nuevo);
			archbp.escribirEnArchivo(betplays, fileBp);
			return true;
		}
		return false;
	}
	
	public BetPlayDTO buscarApBetplay(String id, ArrayList<BetPlayDTO> betplays) {
		BetPlayDTO encontrado = null;
		if(!betplays.isEmpty()) {
			for(int i=0;i<betplays.size();i++) {
				if(betplays.get(i).getId().equals(id)) {
					encontrado = betplays.get(i);
				}
			}
		}
	return encontrado;
	}
	
	public String verApBetplay(String id, ArrayList<BetPlayDTO> betplays) {
		String texto = "";
		for(int i=0;i<betplays.size();i++) {
			if(betplays.get(i).getId().equals(id)) {
				texto = texto.concat(betplays.get(i).toString()+"\n");
			}
		}
	return texto;
	}
	
	public boolean eliminarApBetplay(String id, ArrayList<BetPlayDTO> betplays, File filebp) {
		boolean resp = false;
		try {
			BetPlayDTO bp = buscarApBetplay(id, betplays);
			if(bp!=null) {
				betplays.remove(bp);
				filebp.delete();
				archbp.escribirEnArchivo(betplays, filebp);
				resp = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return resp;
	}
}
