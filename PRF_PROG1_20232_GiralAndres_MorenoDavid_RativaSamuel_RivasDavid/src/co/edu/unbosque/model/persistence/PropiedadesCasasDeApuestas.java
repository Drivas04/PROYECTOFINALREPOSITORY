package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Properties;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.ParametrosDTO;
import co.edu.unbosque.view.PanelParametros;
import co.edu.unbosque.view.VentanaPrincipal;

public class PropiedadesCasasDeApuestas implements Serializable{

	private static final long serialVersionUID = 1;
	
	private Properties prop = new Properties();
	private String config = "./Data/config.properties";
	private String nombre;
	private String numSedes;
	private String presupuesto;
	
	public String escribirPropiedades() {
		
			prop.setProperty("Nombre de la casa de apuestas", getNombre());
			prop.setProperty("Numero de sedes", getNumSedes());
			prop.setProperty("Presupuesto total", getPresupuesto());
		
		
		try {
			prop.store(new FileOutputStream(config), null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	public String leerPropiedades() {
		String linea="";
		try {
			prop.load(new FileInputStream(config));
			linea+= "Nombre de la casa de apuestas: "+prop.getProperty("Nombre de la casa de apuestas");
			linea += "\nNumero de sedes: "+prop.getProperty("Numero de sedes");
			linea += "\nPresupuesto total: "+prop.getProperty("Presupuesto total");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return linea;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumSedes() {
		return numSedes;
	}

	public void setNumSedes(String numSedes) {
		this.numSedes = numSedes;
	}

	public String getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(String presupuesto) {
		this.presupuesto = presupuesto;
	}


	
	
}
