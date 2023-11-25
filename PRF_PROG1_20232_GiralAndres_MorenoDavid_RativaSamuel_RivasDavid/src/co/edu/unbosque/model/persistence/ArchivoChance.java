package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.BalotoDTO;
import co.edu.unbosque.model.ChanceDTO;

public class ArchivoChance {

	private ObjectInputStream entrada;
	private ObjectOutputStream salida;

	public ArchivoChance(File archCH) {
		if (archCH.exists()) {

		} else {
			try {
				archCH.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void escribirEnArchivo(ArrayList<ChanceDTO> chances, File archCH) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(archCH));
			salida.writeObject(chances);
			salida.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public ArrayList<ChanceDTO> leerArchivo(File archCh) {
		ArrayList<ChanceDTO> chances = new ArrayList<>();
		if (archCh.length() != 0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(archCh));
				chances = (ArrayList<ChanceDTO>) entrada.readObject();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return chances;
	}
}
