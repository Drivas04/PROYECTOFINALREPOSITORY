package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.BalotoDTO;
import co.edu.unbosque.model.LoteriaDTO;

public class ArchivoLoteria {

	private ObjectInputStream entrada;
	private ObjectOutputStream salida;

	public ArchivoLoteria(File archL) {
		if (archL.exists()) {

		} else {
			try {
				archL.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void escribirEnArchivo(ArrayList<LoteriaDTO> loterias, File archL) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(archL));
			salida.writeObject(loterias);
			salida.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public ArrayList<LoteriaDTO> leerArchivo(File archL) {
		ArrayList<LoteriaDTO> loterias = new ArrayList<>();
		if (archL.length() != 0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(archL));
				loterias = (ArrayList<LoteriaDTO>) entrada.readObject();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return loterias;
	}
}
