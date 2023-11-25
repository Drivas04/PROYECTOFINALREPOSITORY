package co.edu.unbosque.model;

import java.io.Serializable;

public class BetPlayDTO extends JuegosDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String equipoGanador, equipoGanador2, equipoGanador3, equipoGanador4, equipoGanador5, equipoGanador6, equipoGanador7, equipoGanador8, equipoGanador9, equipoGanador10, equipoGanador11, equipoGanador12, equipoGanador13, equipoGanador14;
	
	public BetPlayDTO(String nombreJuego, String tipoJuego, String presupuestoJuego) {
		super(nombreJuego="BetPlay", tipoJuego="Deportiva", presupuestoJuego="$ 5.000.000.000");
	}

	public BetPlayDTO(String id, String cedula, String sede, String fechaApuesta, String valorAp, String ganador, String ganador2, String ganador3, String ganador4, String ganador5, String ganador6, String ganador7, String ganador8, String ganador9, String ganador10, String ganador11, String ganador12, String ganador13, String ganador14) {
		super(cedula, sede, fechaApuesta, valorAp);
		this.id = id;
		this.equipoGanador = ganador;
		this.equipoGanador2 = ganador2;
		this.equipoGanador3 = ganador3;
		this.equipoGanador4 = ganador4;
		this.equipoGanador5 = ganador5;
		this.equipoGanador6 = ganador6;
		this.equipoGanador7 = ganador7;
		this.equipoGanador8 = ganador8;
		this.equipoGanador9 = ganador9;
		this.equipoGanador10 = ganador10;
		this.equipoGanador11 = ganador11;
		this.equipoGanador12 = ganador12;
		this.equipoGanador13 = ganador13;
		this.equipoGanador14 = ganador14;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEquipoGanador() {
		return equipoGanador;
	}

	public void setEquipoGanador(String equipoGanador) {
		this.equipoGanador = equipoGanador;
	}
	
	public String getEquipoGanador2() {
		return equipoGanador2;
	}

	public void setEquipoGanador2(String equipoGanador2) {
		this.equipoGanador2 = equipoGanador2;
	}

	public String getEquipoGanador3() {
		return equipoGanador3;
	}

	public void setEquipoGanador3(String equipoGanador3) {
		this.equipoGanador3 = equipoGanador3;
	}

	public String getEquipoGanador4() {
		return equipoGanador4;
	}

	public void setEquipoGanador4(String equipoGanador4) {
		this.equipoGanador4 = equipoGanador4;
	}

	public String getEquipoGanador5() {
		return equipoGanador5;
	}

	public void setEquipoGanador5(String equipoGanador5) {
		this.equipoGanador5 = equipoGanador5;
	}

	public String getEquipoGanador6() {
		return equipoGanador6;
	}

	public void setEquipoGanador6(String equipoGanador6) {
		this.equipoGanador6 = equipoGanador6;
	}

	public String getEquipoGanador7() {
		return equipoGanador7;
	}

	public void setEquipoGanador7(String equipoGanador7) {
		this.equipoGanador7 = equipoGanador7;
	}

	public String getEquipoGanador8() {
		return equipoGanador8;
	}

	public void setEquipoGanador8(String equipoGanador8) {
		this.equipoGanador8 = equipoGanador8;
	}

	public String getEquipoGanador9() {
		return equipoGanador9;
	}

	public void setEquipoGanador9(String equipoGanador9) {
		this.equipoGanador9 = equipoGanador9;
	}

	public String getEquipoGanador10() {
		return equipoGanador10;
	}

	public void setEquipoGanador10(String equipoGanador10) {
		this.equipoGanador10 = equipoGanador10;
	}

	public String getEquipoGanador11() {
		return equipoGanador11;
	}

	public void setEquipoGanador11(String equipoGanador11) {
		this.equipoGanador11 = equipoGanador11;
	}

	public String getEquipoGanador12() {
		return equipoGanador12;
	}

	public void setEquipoGanador12(String equipoGanador12) {
		this.equipoGanador12 = equipoGanador12;
	}

	public String getEquipoGanador13() {
		return equipoGanador13;
	}

	public void setEquipoGanador13(String equipoGanador13) {
		this.equipoGanador13 = equipoGanador13;
	}

	public String getEquipoGanador14() {
		return equipoGanador14;
	}

	public void setEquipoGanador14(String equipoGanador14) {
		this.equipoGanador14 = equipoGanador14;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nID de la apuesta: "+getId()+"\nCedula del apostador: "+getCedula()+"\nSede de apuesta: "+getSede()+"\nfecha de la apuesta: "+getFechaApuesta()+"\nValor de la apuesta: $"+getValorAp()+"\nGanador partido 1: "+getEquipoGanador()+"\nGanador partido 2: "+getEquipoGanador2()+"\nGanador partido 3: "+getEquipoGanador3()+"\nGanador partido 4: "+getEquipoGanador4()+"\nGanador partido 5: "+getEquipoGanador5()+"\nGanador partido 6: "+getEquipoGanador6()+"\nGanador partido 7: "+getEquipoGanador7()+"\nGanador partido 8: "+getEquipoGanador8()+"\nGanador partido 9: "+getEquipoGanador9()+"\nGanador partido 10: "+getEquipoGanador10()+"\nGanador partido 11: "+getEquipoGanador11()+"\nGanador partido 12: "+getEquipoGanador12()+"\nGanador partido 13: "+getEquipoGanador13()+"\nGanador partido 14: "+getEquipoGanador14();
	}
}
