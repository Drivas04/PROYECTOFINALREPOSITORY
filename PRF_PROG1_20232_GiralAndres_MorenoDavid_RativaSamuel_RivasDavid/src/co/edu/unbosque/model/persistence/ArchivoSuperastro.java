package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.BalotoDTO;
import co.edu.unbosque.model.SuperAstroDTO;

public class ArchivoSuperastro {

	private ObjectInputStream entrada;
	private ObjectOutputStream salida;

	public ArchivoSuperastro(File archS) {
		if (archS.exists()) {

		} else {
			try {
				archS.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void escribirEnArchivo(ArrayList<SuperAstroDTO> superastros, File archS) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(archS));
			salida.writeObject(superastros);
			salida.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public ArrayList<SuperAstroDTO> leerArchivo(File archS) {
		ArrayList<SuperAstroDTO> superastros = new ArrayList<>();
		if (archS.length() != 0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(archS));
				superastros = (ArrayList<SuperAstroDTO>) entrada.readObject();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return superastros;
	}
}
