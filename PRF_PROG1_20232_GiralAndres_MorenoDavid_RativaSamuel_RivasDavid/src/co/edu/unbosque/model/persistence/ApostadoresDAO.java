package co.edu.unbosque.model.persistence;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.ApostadoresDTO;


public class ApostadoresDAO {
	
	private ArchivoApostadores archivo;
	
	
	public ApostadoresDAO(ArchivoApostadores archivo){
		this.archivo=archivo;
	}
	
	public boolean AgregarApostador(String nombre,String cedula,String direccion,String celular,String edad,ArrayList<ApostadoresDTO>apostadores,File file) {
		ApostadoresDTO nuevo=new ApostadoresDTO(nombre,cedula,celular,direccion,edad);
		if(BuscarApostador(cedula, apostadores)==null) {
			apostadores.add(nuevo);
			archivo.EscribirArchivo(apostadores, file);
			return true;
		}else {
		    return false;
		}
	}
	
	public String LeerApostador(ArrayList<ApostadoresDTO>apostadores) {
		
		String texto="";
		for(int i = 0;i<apostadores.size();i++) {
			texto=texto.concat(apostadores.get(i).toString()+"\n");
		}
		return texto;
	}
	
	public ApostadoresDTO BuscarApostador(String cedula, ArrayList<ApostadoresDTO> apostadores) {
		
		ApostadoresDTO encontrado=null;
		if(!apostadores.isEmpty()) {
			for(int i=0;i<apostadores.size();i++){
				if(apostadores.get(i).getCedula().equals(cedula)) {
					encontrado=apostadores.get(i);
				}
			}
		}
		
		return encontrado;
	}
	
	public boolean EliminarApostador(String cedula,ArrayList<ApostadoresDTO>apostadores,File file) {
		boolean resp=false;
		try {
			ApostadoresDTO a=BuscarApostador(cedula, apostadores);
			if(a!=null) {
				apostadores.remove(a);
				file.delete();
				archivo.EscribirArchivo(apostadores, file);
				resp=true;
			}
			return resp;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return resp;
		
	}
	
	public boolean ActualizarApostador(String cedula, ArrayList<ApostadoresDTO>apostadores,File file, Object obj) {
		
		if(cedula != null) {
			return false;
		}else {
			}
		
		
		return false;
	}
	
}
