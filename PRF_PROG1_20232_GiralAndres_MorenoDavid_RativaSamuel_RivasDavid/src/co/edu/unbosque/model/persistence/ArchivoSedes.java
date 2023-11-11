package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.SedesDTO;

public class ArchivoSedes {
	
	private ObjectInputStream entrada;
	private ObjectOutputStream salida;
	
	public ArchivoSedes(File archivo) {
		
	}

	public static void crearArchivoSedes(File archivoSedes) {
		if(archivoSedes.exists()) {
			//System.out.println("Ya existe");
		}else {
			try {
				archivoSedes.createNewFile();
			}catch(IOException e) {
				
			}
		}
	}
	
	public void guardarArchivoSedes(ArrayList<SedesDTO> sedes, File archivoSedes) {
		try {
			salida=new ObjectOutputStream(new FileOutputStream(archivoSedes));
			salida.writeObject(sedes);
			salida.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<SedesDTO> leerArchivoSedes(File archivoSedes){
		ArrayList<SedesDTO> sedes=new ArrayList<SedesDTO>();
		if(archivoSedes.length()!=0) {
			try {
				entrada=new ObjectInputStream(new FileInputStream(archivoSedes));
				sedes=(ArrayList<SedesDTO>)entrada.readObject();
				
			}catch(Exception e) {
				
			}
		}
		return sedes;
		
	}
	
	
	
	public ObjectInputStream getEntrada() {
		return entrada;
	}

	public void setEntrada(ObjectInputStream entrada) {
		this.entrada = entrada;
	}

	public ObjectOutputStream getSalida() {
		return salida;
	}

	public void setSalida(ObjectOutputStream salida) {
		this.salida = salida;
	}
	
	
	
	
}
