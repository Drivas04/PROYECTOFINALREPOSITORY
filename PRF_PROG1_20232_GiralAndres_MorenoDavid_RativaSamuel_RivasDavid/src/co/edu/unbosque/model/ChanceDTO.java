package co.edu.unbosque.model;

import java.io.Serializable;
import java.util.ArrayList;

public class ChanceDTO extends LoteriaDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private String numerosElegidos;
	
	public ChanceDTO(String nombreJuego, String tipoJuego, String presupuestoJuego) {
		super(nombreJuego = "Chance", tipoJuego = "Loteria", presupuestoJuego="$1.200.000.000");
		
	}
	
	public ChanceDTO(String cedula,String nombreL, String numerosElegidos, String sede, String fechaApuesta, String valorAp) {
		super(cedula, nombreL, sede, fechaApuesta, valorAp);
		this.numerosElegidos = numerosElegidos;
	}

	public String getNumerosElegidos() {
		return numerosElegidos;
	}

	public void setNumerosElegidos(String numerosElegidos) {
		this.numerosElegidos = numerosElegidos;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nCedula del apostador: "+getCedula()+"\nSede de apuesta: "+getSede()+"\nfecha de la apuesta: "+getFechaApuesta()+"\nValor de la apuesta: "+getValorAp()+"\nNumeros escogidos: "+getNumerosElegidos();
	}
}
