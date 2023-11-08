package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropiedadesCasasDeApuestas {

	private Properties prop = new Properties();
	private String config = "./Data/config.properties";
	
	public String escribirPropiedades() {
		prop.setProperty("Nombre de la casa de apuestas", "PikaBet");
		prop.setProperty("Numero de sedes", "4");
		prop.setProperty("Presupuesto total", "$400'000.000");
		prop.setProperty("Presupesto para Baloto", "");
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
			linea += "Numero de sedes: "+prop.getProperty("Numero de sedes");
			linea += "Presupuesto total: "+prop.getProperty("Presupuesto total");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return linea;
	}
}
