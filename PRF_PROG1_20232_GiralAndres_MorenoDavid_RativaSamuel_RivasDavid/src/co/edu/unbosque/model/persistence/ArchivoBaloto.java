package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.BalotoDTO;

public class ArchivoBaloto {

	private ObjectInputStream entrada;
	private ObjectOutputStream salida;

	public ArchivoBaloto(File archBaloto) {
		if (archBaloto.exists()) {

		} else {
			try {
				archBaloto.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void escribirEnArchivo(ArrayList<BalotoDTO> balotos, File archBaloto) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(archBaloto));
			salida.writeObject(balotos);
			salida.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public ArrayList<BalotoDTO> leerArchivo(File archBaloto) {
		ArrayList<BalotoDTO> balotos = new ArrayList<>();
		if (archBaloto.length() != 0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(archBaloto));
				balotos = (ArrayList<BalotoDTO>) entrada.readObject();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return balotos;
	}
}
