package co.edu.unbosque.model.persistence;

import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.JuegosDTO;

public class JuegosDAO {

	private Archivo archivo;
	
	public JuegosDAO(Archivo archivo) {
		this.archivo = archivo;
	}
	
	//CRUD
	public boolean agregarJuego(String nombreJ, String tipoJ, String presupuestoJ, ArrayList<JuegosDTO> juegos, File file) {
		JuegosDTO nuevo = new JuegosDTO(nombreJ, tipoJ, presupuestoJ);
		if(buscarJuego(nombreJ, juegos)==null) {
			juegos.add(nuevo);
			
			archivo.escribirEnArchivo(juegos, file);
			return true;
		}
		else {
			return false;
		}
	}
	
	public String verJuego(String nombreJuego, ArrayList<JuegosDTO> juegos) {
		String texto = "";
		for(int i=0;i<juegos.size();i++) {
			if(juegos.get(i).getNombreJuego().equals(nombreJuego))
			texto = texto.concat(juegos.get(i).toString()+"\n");
		}
		return texto;
	}
	
	public JuegosDTO buscarJuego(String nombreJ, ArrayList<JuegosDTO> juegos) {
		JuegosDTO encontrado = null;
		if(!juegos.isEmpty()) {
			for(int i=0;i<juegos.size();i++) {
				if(juegos.get(i).getNombreJuego().equals(nombreJ)) {
					encontrado = juegos.get(i);
				}
			}
		}
		return encontrado;
	}
}
