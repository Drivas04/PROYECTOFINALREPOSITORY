package co.edu.unbosque.model.persistence;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

import java.util.Properties;




public class PropiedadesCasasDeApuestas implements Serializable{

	private static final long serialVersionUID = 1;
	
	private Properties prop = new Properties();
	private String config = "Data/config.properties";
	
	public String escribirPropiedades(String prop1, String prop2, String prop3) {
		
		prop.setProperty("NombreDeLaCasaDeApuestas", prop1);
		prop.setProperty("NumeroDeSedes", prop2);
		prop.setProperty("PresupuestoTotal", prop3);
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
			linea += "Nombre De La Casa De Apuestas: "+prop.getProperty("NombreDeLaCasaDeApuestas");
			linea += "\nNumero de sedes: "+prop.getProperty("NumeroDeSedes");
			linea += "\nPresupuesto total: "+prop.getProperty("PresupuestoTotal");
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


	
}
