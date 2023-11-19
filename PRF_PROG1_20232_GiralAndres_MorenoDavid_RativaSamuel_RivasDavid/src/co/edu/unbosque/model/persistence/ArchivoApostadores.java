package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.ArrayList;


import co.edu.unbosque.model.ApostadoresDTO;
public class ArchivoApostadores {
	
	private  ObjectInputStream entrada;
	private ObjectOutputStream salida;
	
	public ArchivoApostadores(File archivo) {
		if(archivo.exists()) {
			//System.out.print("El archivo ya existe");
		}else {
			try {
				archivo.createNewFile();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	
		
	}
	
	public void EscribirArchivo(ArrayList<ApostadoresDTO>apostadores,File archivo) {
		try {
			//System.out.println(archivo);
			salida=new ObjectOutputStream(new FileOutputStream(archivo));
			salida.writeObject(apostadores);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<ApostadoresDTO> LeerArchivo(File archivo){
		
		//System.out.println("entro");
		ArrayList<ApostadoresDTO>apostadores= new ArrayList<ApostadoresDTO>();
		if(archivo.length()!=0) {
			try {
				entrada=new ObjectInputStream(new FileInputStream(archivo));
				apostadores=(ArrayList<ApostadoresDTO>)entrada.readObject();
			}catch(FileNotFoundException e ) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return apostadores;
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
