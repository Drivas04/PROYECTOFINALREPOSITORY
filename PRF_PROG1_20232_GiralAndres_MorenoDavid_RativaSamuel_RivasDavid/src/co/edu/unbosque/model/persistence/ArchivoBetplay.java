package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import co.edu.unbosque.model.BetPlayDTO;

public class ArchivoBetplay {

	private ObjectInputStream entrada;
	private ObjectOutputStream salida;

	public ArchivoBetplay(File archBP) {
		if (archBP.exists()) {

		} else {
			try {
				archBP.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void escribirEnArchivo(ArrayList<BetPlayDTO> betplays, File archBP) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(archBP));
			salida.writeObject(betplays);
			salida.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public ArrayList<BetPlayDTO> leerArchivo(File archBP) {
		ArrayList<BetPlayDTO> betplays = new ArrayList<>();
		if (archBP.length() != 0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(archBP));
				betplays = (ArrayList<BetPlayDTO>) entrada.readObject();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return betplays;
	}
}
