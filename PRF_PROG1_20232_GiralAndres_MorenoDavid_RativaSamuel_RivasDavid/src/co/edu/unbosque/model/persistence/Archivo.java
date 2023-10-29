package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.JuegosDTO;

public class Archivo {

	private ObjectInputStream entrada;
	private ObjectOutputStream salida;
	
	public Archivo(File archivo) {
		if(archivo.exists()) {
			JOptionPane.showMessageDialog(null, "El archivo ya existe");
		}
		else {
			try {
				archivo.createNewFile();
				} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void escribirEnArchivo(ArrayList<JuegosDTO> juegos, File archivo) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(archivo));
			salida.writeObject(juegos);
			salida.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
