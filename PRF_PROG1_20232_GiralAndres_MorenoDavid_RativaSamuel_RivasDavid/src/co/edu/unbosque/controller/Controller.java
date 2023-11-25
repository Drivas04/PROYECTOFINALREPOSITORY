package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.model.BalotoDTO;
import co.edu.unbosque.model.BetPlayDTO;
import co.edu.unbosque.model.ChanceDTO;
import co.edu.unbosque.model.Fachade;
import co.edu.unbosque.model.LoteriaDTO;
import co.edu.unbosque.model.SuperAstroDTO;
import co.edu.unbosque.model.persistence.PropiedadesCasasDeApuestas;
import co.edu.unbosque.view.VentanaPartidos;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {

	private VentanaPrincipal ventanaP;
	private VentanaPartidos ventanaPAR;
	private Fachade f;

	public Controller() {
		ventanaP = new VentanaPrincipal(this);
		mostrarIndicaciones();
		ventanaPAR = new VentanaPartidos(this);
		ventanaP.setVisible(true);
		f = new Fachade();
	}

	public void mostrarIndicaciones() {
		ventanaP.mostrarMensaje("Antes de realizar una apuesta registre sus datos en el apartado APOSTADORES.\nApueste con moderacion", "BIENVENIDO");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// panelPrincipal
		if (e.getActionCommand().equals(ventanaP.getPanelP().VERPROPJUEGOS)) {
			ventanaP.getPanelP().setVisible(false);
			ventanaP.getPanelEleccion().setVisible(true);
			ventanaP.resize(500, 200);
			ventanaP.setLocationRelativeTo(null);
			// ventanaP.mostrarMensaje(f.getJuegosDao().verJuegos(juegos), null);
		}

		if (e.getActionCommand().equals(ventanaP.getPanelP().PARAMETROS)) {
			ventanaP.getPanelP().setVisible(false);
			ventanaP.getPanelPa().setVisible(true);
			ventanaP.resize(500, 200);
			ventanaP.setLocationRelativeTo(null);
		}

		if (e.getActionCommand().equals(ventanaP.getPanelP().SEDES)) {
			ventanaP.getPanelP().setVisible(false);
			ventanaP.getPanelS().setVisible(true);
			ventanaP.resize(500, 200);
			ventanaP.setLocationRelativeTo(null);
		}

		if (e.getActionCommand().equals(ventanaP.getPanelP().APOSTADORES)) {
			ventanaP.getPanelP().setVisible(false);
			ventanaP.getPanelO().setVisible(true);
			ventanaP.setLocationRelativeTo(null);
		}

		if (e.getActionCommand().equals(ventanaP.getPanelP().APOSTAR)) {
			ventanaP.getPanelP().setVisible(false);
			ventanaP.getPanelEA().setVisible(true);
			ventanaP.resize(500, 200);
			ventanaP.setLocationRelativeTo(null);
		}
		
		if(e.getActionCommand().equals(ventanaP.getPanelP().CONSULTAR)) {
			ventanaP.getPanelP().setVisible(false);
			ventanaP.getPanelCon().setVisible(true);
			ventanaP.resize(500, 200);
			ventanaP.setLocationRelativeTo(null);
		}

		// PanelApuestas
		if (e.getActionCommand().equals(ventanaP.getPanelEA().BALOTO)) {
			ventanaP.getPanelEA().setVisible(false);
			ventanaP.getPanelBa().setVisible(true);
			ventanaP.resize(800, 200);
			ventanaP.setLocationRelativeTo(null);
		}

		if (e.getActionCommand().equals(ventanaP.getPanelEA().BETPLAY)) {
			ventanaP.getPanelEA().setVisible(false);
			ventanaP.getPanelBP().setVisible(true);
			ventanaP.resize(500, 200);
			ventanaP.setLocationRelativeTo(null);
		}

		if (e.getActionCommand().equals(ventanaP.getPanelEA().CHANCE)) {
			ventanaP.getPanelEA().setVisible(false);
			ventanaP.getPanelCH().setVisible(true);
			ventanaP.resize(500, 200);
			ventanaP.setLocationRelativeTo(null);
		}

		if (e.getActionCommand().equals(ventanaP.getPanelEA().LOTERIA)) {
			ventanaP.getPanelEA().setVisible(false);
			ventanaP.getPanelL().setVisible(true);
			ventanaP.resize(500, 200);
			ventanaP.setLocationRelativeTo(null);
		}

		if (e.getActionCommand().equals(ventanaP.getPanelEA().SUPERASTRO)) {
			ventanaP.getPanelEA().setVisible(false);
			ventanaP.getPanelSA().setVisible(true);
			ventanaP.resize(500, 200);
			ventanaP.setLocationRelativeTo(null);
		}

		if (e.getActionCommand().equals(ventanaP.getPanelEA().VOLVER)) {
			ventanaP.getPanelEA().setVisible(false);
			ventanaP.getPanelP().setVisible(true);

			ventanaP.resize(500, 200);
			ventanaP.setLocationRelativeTo(null);
		}

		// panelBaloto
		if (e.getActionCommand().equals(ventanaP.getPanelBa().CREARAPBA)) {
			if (ventanaP.getPanelBa().getTxtNumeros().getText().isEmpty()) {
				ventanaP.mostrarMensaje("Agregar numeros", "ERROR");
			} else {
				if (f.getBalotodao().crearApBaloto(ventanaP.getPanelBa().getTxtNumeros().getText(),
						f.getApostadores().get(f.getApostadores().size() - 1).getCedula(),
						f.getSedes().get(f.getSedes().size() - 1).getUbicacion(), f.getFecha().toString(), "$5700",
						f.getBaloto(), f.getFileBa())) {
					ventanaP.mostrarMensaje("Apuesta guardada exitosamente", "INFORMACION");
					// ventanaP.mostrarMensaje(f.getBalotodao().verApBaloto(ventanaP.getPanelBa().getTxtNumeros().getText(),
					// f.getBaloto()), null);
				} else {
					ventanaP.mostrarMensaje("Error al guardar apuesta", "ERROR");
				}
			}
		}
		if (e.getActionCommand().equals(ventanaP.getPanelBa().LEERAPBA)) {
			if (f.getBaloto().size() > 0) {
				ventanaP.mostrarMensaje(
						f.getBalotodao().verApBaloto(ventanaP.getPanelBa().getTxtNumeros().getText(), f.getBaloto()),
						"INFORMACION");
			} else {
				ventanaP.mostrarMensaje("No hay apostadores en el sistema actualmente", "Informacion");
			}
		}

		if (e.getActionCommand().equals(ventanaP.getPanelBa().ACTUALIZARAPBA)) {
			String numAp = ventanaP.capturarDato("Indique el numero con el que apostó que desea modificar", null);
			if (f.getBalotodao().buscarApBaloto(numAp, f.getBaloto()) != null) {
				f.getBalotodao().eliminarApBaloto(numAp, f.getBaloto(), f.getFileBa());
				ventanaP.mostrarMensaje("Al actualizar los datos oprima el boton GUARDAR para guardar los cambios",
						"INFO");
			} else {
				ventanaP.mostrarMensaje("Apuesta no encontrada", "ERROR");
			}
		}

		if (e.getActionCommand().equals(ventanaP.getPanelBa().ELIMINARAPBA)) {
			String numAp = ventanaP.capturarDato("Indique el numero con el que apostó que desea eliminar", null);
			if (f.getBalotodao().buscarApBaloto(numAp, f.getBaloto()) != null) {
				f.getBalotodao().eliminarApBaloto(numAp, f.getBaloto(), f.getFileBa());
				ventanaP.mostrarMensaje("Apuesta eliminada correctamente", "EXITO");
			} else {
				ventanaP.mostrarMensaje("Apuesta no encontrada", "ERROR");
			}
		}

		if(e.getActionCommand().equals(ventanaP.getPanelBa().VOLVER)) {
			ventanaP.getPanelBa().setVisible(false);
			ventanaP.getPanelEA().setVisible(true);
		}
		//panelBetplay
		
		if(e.getActionCommand().equals(ventanaP.getPanelBP().CREARAPBP)) {
			ventanaP.getPanelBP().setVisible(false);
			ventanaP.getPanelVA().setVisible(true);
			ventanaPAR.setLocationRelativeTo(null);
		}
		if(e.getActionCommand().equals(ventanaP.getPanelVA().CONTINUAR)) {
			ventanaPAR.setVisible(true);
			ventanaP.getPanelVA().setVisible(false);
			ventanaP.getPanelBP().setVisible(true);
		}
		
		//ventanaApuestasDeportivas
		if(e.getActionCommand().equals(ventanaPAR.getPanelP1().LOCAL)) {
			ventanaPAR.getTxtG1().setText(ventanaPAR.getPanelP1().LOCAL);
			ventanaP.mostrarMensaje("Gana Local", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP1().EMPATE)){
			ventanaPAR.getTxtG1().setText(ventanaPAR.getPanelP1().EMPATE);
			ventanaP.mostrarMensaje("Empate", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP1().VISITANTE)) {
			ventanaPAR.getTxtG1().setText(ventanaPAR.getPanelP1().VISITANTE);
			ventanaP.mostrarMensaje("Gana Visitante", "GANADOR");
		}
		
		if(e.getActionCommand().equals(ventanaPAR.getPanelP2().LOCAL)) {
			ventanaPAR.getTxtG2().setText(ventanaPAR.getPanelP2().LOCAL);
			ventanaP.mostrarMensaje("Gana Local", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP2().EMPATE)){
			ventanaPAR.getTxtG2().setText(ventanaPAR.getPanelP2().EMPATE);
			ventanaP.mostrarMensaje("Empate", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP2().VISITANTE)) {
			ventanaPAR.getTxtG2().setText(ventanaPAR.getPanelP2().VISITANTE);
			ventanaP.mostrarMensaje("Gana Visitante", "GANADOR");
		}
		
		if(e.getActionCommand().equals(ventanaPAR.getPanelP3().LOCAL)) {
			ventanaPAR.getTxtG3().setText(ventanaPAR.getPanelP3().LOCAL);
			ventanaP.mostrarMensaje("Gana Local", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP3().EMPATE)){
			ventanaPAR.getTxtG3().setText(ventanaPAR.getPanelP3().EMPATE);
			ventanaP.mostrarMensaje("Empate", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP3().VISITANTE)) {
			ventanaPAR.getTxtG3().setText(ventanaPAR.getPanelP3().VISITANTE);
			ventanaP.mostrarMensaje("Gana Visitante", "GANADOR");
		}
		
		if(e.getActionCommand().equals(ventanaPAR.getPanelP4().LOCAL)) {
			ventanaPAR.getTxtG4().setText(ventanaPAR.getPanelP4().LOCAL);
			ventanaP.mostrarMensaje("Gana Local", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP4().EMPATE)){
			ventanaPAR.getTxtG4().setText(ventanaPAR.getPanelP4().EMPATE);
			ventanaP.mostrarMensaje("Empate", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP4().VISITANTE)) {
			ventanaPAR.getTxtG4().setText(ventanaPAR.getPanelP4().VISITANTE);
			ventanaP.mostrarMensaje("Gana Visitante", "GANADOR");
		}
		
		if(e.getActionCommand().equals(ventanaPAR.getPanelP5().LOCAL)) {
			ventanaPAR.getTxtG5().setText(ventanaPAR.getPanelP5().LOCAL);
			ventanaP.mostrarMensaje("Gana Local", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP5().EMPATE)){
			ventanaPAR.getTxtG5().setText(ventanaPAR.getPanelP5().EMPATE);
			ventanaP.mostrarMensaje("Empate", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP5().VISITANTE)) {
			ventanaPAR.getTxtG5().setText(ventanaPAR.getPanelP5().VISITANTE);
			ventanaP.mostrarMensaje("Gana Visitante", "GANADOR");
		}
		
		if(e.getActionCommand().equals(ventanaPAR.getPanelP6().LOCAL)) {
			ventanaPAR.getTxtG6().setText(ventanaPAR.getPanelP6().LOCAL);
			ventanaP.mostrarMensaje("Gana Local", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP6().EMPATE)){
			ventanaPAR.getTxtG6().setText(ventanaPAR.getPanelP6().EMPATE);
			ventanaP.mostrarMensaje("Empate", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP6().VISITANTE)) {
			ventanaPAR.getTxtG6().setText(ventanaPAR.getPanelP6().VISITANTE);
			ventanaP.mostrarMensaje("Gana Visitante", "GANADOR");
		}
		
		if(e.getActionCommand().equals(ventanaPAR.getPanelP7().LOCAL)) {
			ventanaPAR.getTxtG7().setText(ventanaPAR.getPanelP7().LOCAL);
			ventanaP.mostrarMensaje("Gana Local", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP7().EMPATE)){
			ventanaPAR.getTxtG7().setText(ventanaPAR.getPanelP7().EMPATE);
			ventanaP.mostrarMensaje("Empate", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP7().VISITANTE)) {
			ventanaPAR.getTxtG7().setText(ventanaPAR.getPanelP7().VISITANTE);
			ventanaP.mostrarMensaje("Gana Visitante", "GANADOR");
		}
		
		if(e.getActionCommand().equals(ventanaPAR.getPanelP8().LOCAL)) {
			ventanaPAR.getTxtG8().setText(ventanaPAR.getPanelP8().LOCAL);
			ventanaP.mostrarMensaje("Gana Local", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP8().EMPATE)){
			ventanaPAR.getTxtG8().setText(ventanaPAR.getPanelP8().EMPATE);
			ventanaP.mostrarMensaje("Empate", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP8().VISITANTE)) {
			ventanaPAR.getTxtG8().setText(ventanaPAR.getPanelP8().VISITANTE);
			ventanaP.mostrarMensaje("Gana Visitante", "GANADOR");
		}
		
		if(e.getActionCommand().equals(ventanaPAR.getPanelP9().LOCAL)) {
			ventanaPAR.getTxtG9().setText(ventanaPAR.getPanelP9().LOCAL);
			ventanaP.mostrarMensaje("Gana Local", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP9().EMPATE)){
			ventanaPAR.getTxtG9().setText(ventanaPAR.getPanelP9().EMPATE);
			ventanaP.mostrarMensaje("Empate", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP9().VISITANTE)) {
			ventanaPAR.getTxtG9().setText(ventanaPAR.getPanelP9().VISITANTE);
			ventanaP.mostrarMensaje("Gana Visitante", "GANADOR");
		}
		
		if(e.getActionCommand().equals(ventanaPAR.getPanelP10().LOCAL)) {
			ventanaPAR.getTxtG10().setText(ventanaPAR.getPanelP10().LOCAL);
			ventanaP.mostrarMensaje("Gana Local", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP10().EMPATE)){
			ventanaPAR.getTxtG10().setText(ventanaPAR.getPanelP10().EMPATE);
			ventanaP.mostrarMensaje("Empate", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP10().VISITANTE)) {
			ventanaPAR.getTxtG10().setText(ventanaPAR.getPanelP10().VISITANTE);
			ventanaP.mostrarMensaje("Gana Visitante", "GANADOR");
		}
		
		if(e.getActionCommand().equals(ventanaPAR.getPanelP11().LOCAL)) {
			ventanaPAR.getTxtG11().setText(ventanaPAR.getPanelP11().LOCAL);
			ventanaP.mostrarMensaje("Gana Local", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP11().EMPATE)){
			ventanaPAR.getTxtG11().setText(ventanaPAR.getPanelP11().EMPATE);
			ventanaP.mostrarMensaje("Empate", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP11().VISITANTE)) {
			ventanaPAR.getTxtG11().setText(ventanaPAR.getPanelP11().VISITANTE);
			ventanaP.mostrarMensaje("Gana Visitante", "GANADOR");
		}
		
		if(e.getActionCommand().equals(ventanaPAR.getPanelP12().LOCAL)) {
			ventanaPAR.getTxtG12().setText(ventanaPAR.getPanelP12().LOCAL);
			ventanaP.mostrarMensaje("Gana Local", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP12().EMPATE)){
			ventanaPAR.getTxtG12().setText(ventanaPAR.getPanelP12().EMPATE);
			ventanaP.mostrarMensaje("Empate", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP12().VISITANTE)) {
			ventanaPAR.getTxtG12().setText(ventanaPAR.getPanelP12().VISITANTE);
			ventanaP.mostrarMensaje("Gana Visitante", "GANADOR");
		}
		
		if(e.getActionCommand().equals(ventanaPAR.getPanelP13().LOCAL)) {
			ventanaPAR.getTxtG13().setText(ventanaPAR.getPanelP13().LOCAL);
			ventanaP.mostrarMensaje("Gana Local", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP13().EMPATE)){
			ventanaPAR.getTxtG13().setText(ventanaPAR.getPanelP13().EMPATE);
			ventanaP.mostrarMensaje("Empate", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP13().VISITANTE)) {
			ventanaPAR.getTxtG13().setText(ventanaPAR.getPanelP13().VISITANTE);
			ventanaP.mostrarMensaje("Gana Visitante", "GANADOR");
		}
		
		if(e.getActionCommand().equals(ventanaPAR.getPanelP14().LOCAL)) {
			ventanaPAR.getTxtG14().setText(ventanaPAR.getPanelP14().LOCAL);
			ventanaP.mostrarMensaje("Gana Local", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP14().EMPATE)){
			ventanaPAR.getTxtG14().setText(ventanaPAR.getPanelP14().EMPATE);
			ventanaP.mostrarMensaje("Empate", "GANADOR");
		}
		else if(e.getActionCommand().equals(ventanaPAR.getPanelP14().VISITANTE)) {
			ventanaPAR.getTxtG14().setText(ventanaPAR.getPanelP14().VISITANTE);
			ventanaP.mostrarMensaje("Gana Visitante", "GANADOR");
		}
		
		if(e.getActionCommand().equals(ventanaPAR.HIDE_ON_CLOSE)) {
			ventanaP.getPanelVA().setVisible(false);
			ventanaP.getPanelBP().setVisible(true);
		}
		
		if(e.getActionCommand().equals(ventanaPAR.getPanelGA().GUARDARABP)) {
			if(f.getBetplaydao().crearApBetPlay(ventanaP.getPanelVA().getTxtId().getText(),f.getApostadores().get(f.getApostadores().size() - 1).getCedula(), f.getSedes().get(f.getSedes().size() - 1).getUbicacion(), f.getFecha().toString(), ventanaP.getPanelVA().getTxtValorAp().getText(), ventanaPAR.getTxtG1().getText(), ventanaPAR.getTxtG2().getText(), ventanaPAR.getTxtG3().getText(), ventanaPAR.getTxtG4().getText(), ventanaPAR.getTxtG5().getText(), ventanaPAR.getTxtG6().getText(), ventanaPAR.getTxtG7().getText(), ventanaPAR.getTxtG8().getText(), ventanaPAR.getTxtG9().getText(), ventanaPAR.getTxtG10().getText(), ventanaPAR.getTxtG11().getText(), ventanaPAR.getTxtG12().getText(), ventanaPAR.getTxtG13().getText(), ventanaPAR.getTxtG14().getText(), f.getBetplay(), f.getFileBP())) {
			ventanaP.mostrarMensaje("Apuesta guardada", "EXITO");
			ventanaP.mostrarMensaje(f.getBetplaydao().verApBetplay(ventanaP.getPanelVA().getTxtId().getText(),f.getBetplay()), "RECIBO");
			}
			else {
				ventanaP.mostrarMensaje("Error al guardar apuesta", "ERROR");
			}
		}
		
		if(e.getActionCommand().equals(ventanaP.getPanelBP().LEERAPBP)) {
			String id = ventanaP.capturarDato("Digite el ID de la apuesta que desea ver: ", "INFORMACION");
			if(f.getBetplaydao().buscarApBetplay(id, f.getBetplay())!=null) {
			ventanaP.mostrarMensaje(f.getBetplaydao().verApBetplay(id,f.getBetplay()), null);
			}
			else {
				ventanaP.mostrarMensaje("Apuesta no encontrada", "ERROR");
			}
		}
		
		if(e.getActionCommand().equals(ventanaP.getPanelBP().ACTUALIZARAPBP)) {
			String id = ventanaP.capturarDato("Digite el ID de la apuesta que desea modificar: ", "INFORMACION");
			if(f.getBetplaydao().buscarApBetplay(id, f.getBetplay())!=null) {
				f.getBetplaydao().eliminarApBetplay(id, f.getBetplay(), f.getFileBP());
				ventanaP.mostrarMensaje("Oprima el boton JUGAR para modificar la apuesta", "INFORMACION");
			}
			else {
				ventanaP.mostrarMensaje("Apuesta no encontraada", "ERROR");
			}
		}
		
		if(e.getActionCommand().equals(ventanaP.getPanelBP().ELIMINARAPBP)){
			String id = ventanaP.capturarDato("Digite el ID de la apuesta que desea eliminar: ", "INFORMACION");
			if(f.getBetplaydao().buscarApBetplay(id, f.getBetplay())!=null) {
				f.getBetplaydao().eliminarApBetplay(id, f.getBetplay(), f.getFileBP());
				ventanaP.mostrarMensaje("Apuesta eliminada", "EXITO");
			}
			else {
				ventanaP.mostrarMensaje("Apuesta no encontrada", "ERROR");
			}
		}
		
		if(e.getActionCommand().equals(ventanaP.getPanelBP().VOLVER)) {
			ventanaP.getPanelBP().setVisible(false);
			ventanaP.getPanelEA().setVisible(true);
		}
		// panelChance
		if (e.getActionCommand().equals(ventanaP.getPanelCH().CREARAPC)) {
			String validacionLot = ventanaP.getPanelCH().getTxtLoteria().getText();
			// boolean existe = f.getLot().getNombre().contains(validacionLot);
			if (ventanaP.getPanelCH().getTxtNums().getText().isEmpty()
					|| ventanaP.getPanelCH().getTxtLoteria().getText().isEmpty()) {
				ventanaP.mostrarMensaje("Agregar todos los campos", "ERROR");

			} else {
				if (f.getChancedao().crearApChance(f.getApostadores().get(f.getApostadores().size() - 1).getCedula(),
						ventanaP.getPanelCH().getTxtLoteria().getText(), ventanaP.getPanelCH().getTxtNums().getText(),
						f.getSedes().get(f.getSedes().size() - 1).getUbicacion(), f.getFecha().toString(), "$4000",
						f.getChance(), f.getFileC())) {
					ventanaP.mostrarMensaje("Apuesta guardada exitosamente", "INFORMACION");
					// ventanaP.mostrarMensaje(f.getBalotodao().verApBaloto(ventanaP.getPanelBa().getTxtNumeros().getText(),
					// f.getBaloto()), null);
				} else {
					ventanaP.mostrarMensaje("Error al guardar apuesta", "ERROR");
				}
			}
		}
		if (e.getActionCommand().equals(ventanaP.getPanelCH().LEERAPC)) {
			if (f.getChance().size() > 0) {
				ventanaP.mostrarMensaje(
						f.getChancedao().verApChance(ventanaP.getPanelCH().getTxtNums().getText(), f.getChance()),
						"INFORMACION");
			} else {
				ventanaP.mostrarMensaje("No hay apostadores en el sistema actualmente", "Informacion");
			}
		}

		if (e.getActionCommand().equals(ventanaP.getPanelCH().ACTUALIZARAPC)) {
			String numAp = ventanaP.capturarDato("Indique el numero con el que apostó que desea modificar", null);
			if (f.getChancedao().buscarApChance(numAp, f.getChance()) != null) {
				f.getChancedao().eliminarApChance(numAp, f.getChance(), f.getFileC());
				ventanaP.mostrarMensaje("Al actualizar los datos oprima el boton GUARDAR para guardar los cambios",
						"INFO");
			} else {
				ventanaP.mostrarMensaje("Apuesta no encontrada", "ERROR");
			}
		}

		if (e.getActionCommand().equals(ventanaP.getPanelCH().ELIMINARAPC)) {
			String numAp = ventanaP.capturarDato("Indique el numero con el que apostó que desea eliminar", null);
			if (f.getChancedao().buscarApChance(numAp, f.getChance()) != null) {
				f.getChancedao().eliminarApChance(numAp, f.getChance(), f.getFileC());
				ventanaP.mostrarMensaje("Apuesta eliminada correctamente", "EXITO");
			} else {
				ventanaP.mostrarMensaje("Apuesta no encontrada", "ERROR");
			}
		}

		if(e.getActionCommand().equals(ventanaP.getPanelCH().VOLVER)) {
			ventanaP.getPanelCH().setVisible(false);
			ventanaP.getPanelEA().setVisible(true);
		}
		// panelLoteria
		if (e.getActionCommand().equals(ventanaP.getPanelL().CREARAPL)) {
			if (ventanaP.getPanelL().getTxtnumeros().getText().isEmpty()
					|| ventanaP.getPanelL().getTxtserie().getText().isEmpty()
					|| ventanaP.getPanelL().getTxtloteria().getText().isEmpty()) {
				ventanaP.mostrarMensaje("Agregar todos los campos", "ERROR");
			} else {
				if (f.getLoteriadao().crearApLoteria(f.getApostadores().get(f.getApostadores().size() - 1).getCedula(),
						ventanaP.getPanelL().getTxtloteria().getText(), ventanaP.getPanelL().getTxtnumeros().getText(),
						ventanaP.getPanelL().getTxtserie().getText(),
						f.getSedes().get(f.getSedes().size() - 1).getUbicacion(), f.getFecha().toString(), "$5000",
						f.getLoteria(), f.getFileL())) {
					ventanaP.mostrarMensaje("Apuesta guardada exitosamente", "INFORMACION");
					// ventanaP.mostrarMensaje(f.getBalotodao().verApBaloto(ventanaP.getPanelBa().getTxtNumeros().getText(),
					// f.getBaloto()), null);
				} else {
					ventanaP.mostrarMensaje("Error al guardar apuesta", "ERROR");
				}
			}
		}
		if (e.getActionCommand().equals(ventanaP.getPanelL().LEERAPL)) {
			if (f.getLoteria().size() > 0) {
				ventanaP.mostrarMensaje(
						f.getLoteriadao().verApLoteria(ventanaP.getPanelL().getTxtnumeros().getText(), f.getLoteria()),
						"INFORMACION");
			} else {
				ventanaP.mostrarMensaje("No hay apuestas de loteria en el sistema actualmente", "Informacion");
			}
		}

		if (e.getActionCommand().equals(ventanaP.getPanelL().ACTUALIZARAPL)) {
			String numAp = ventanaP.capturarDato("Indique el numero con el que apostó que desea modificar", null);
			if (f.getLoteriadao().buscarApLoteria(numAp, f.getLoteria()) != null) {
				f.getLoteriadao().eliminarApLoteria(numAp, f.getLoteria(), f.getFileL());
				ventanaP.mostrarMensaje("Al actualizar los datos oprima el boton GUARDAR para guardar los cambios",
						"INFO");
			} else {
				ventanaP.mostrarMensaje("Apuesta no encontrada", "ERROR");
			}
		}

		if (e.getActionCommand().equals(ventanaP.getPanelL().ELIMINARAPL)) {
			String numAp = ventanaP.capturarDato("Indique el numero con el que apostó que desea eliminar", null);
			if (f.getLoteriadao().buscarApLoteria(numAp, f.getLoteria()) != null) {
				f.getLoteriadao().eliminarApLoteria(numAp, f.getLoteria(), f.getFileL());
				ventanaP.mostrarMensaje("Apuesta eliminada correctamente", "EXITO");
			} else {
				ventanaP.mostrarMensaje("Apuesta no encontrada", "ERROR");
			}
		}

		if(e.getActionCommand().equals(ventanaP.getPanelL().VOLVER)) {
			ventanaP.getPanelL().setVisible(false);
			ventanaP.getPanelEA().setVisible(true);
		}
		// panelSuperastro
		if (e.getActionCommand().equals(ventanaP.getPanelSA().CREARAPS)) {
			if (ventanaP.getPanelSA().getTxtnums().getText().isEmpty()
					|| ventanaP.getPanelSA().getTxtsigno().getText().isEmpty()) {
				ventanaP.mostrarMensaje("Agregar todos los campos", "ERROR");

			} else {
				if (f.getSAdao().crearApSuperastro(f.getApostadores().get(f.getApostadores().size() - 1).getCedula(),
						ventanaP.getPanelSA().getTxtnums().getText(), ventanaP.getPanelSA().getTxtsigno().getText(),
						f.getSedes().get(f.getSedes().size() - 1).getUbicacion(), f.getFecha().toString(), ventanaP.getPanelSA().getTxtvalorap().getText(),
						f.getSuperas(), f.getFileSA())) {
					ventanaP.mostrarMensaje("Apuesta guardada exitosamente", "INFORMACION");
					// ventanaP.mostrarMensaje(f.getBalotodao().verApBaloto(ventanaP.getPanelBa().getTxtNumeros().getText(),
					// f.getBaloto()), null);
				} else {
					ventanaP.mostrarMensaje("Error al guardar apuesta", "ERROR");
				}
			}
		}

		if (e.getActionCommand().equals(ventanaP.getPanelSA().LEERAPS)) {
			if (f.getSuperas().size() > 0) {
				ventanaP.mostrarMensaje(
						f.getSAdao().verApSuperastro(ventanaP.getPanelSA().getTxtnums().getText(), f.getSuperas()),
						"INFORMACION");
			} else {
				ventanaP.mostrarMensaje("No hay apuestas de superastro en el sistema actualmente", "Informacion");
			}
		}

		if (e.getActionCommand().equals(ventanaP.getPanelSA().ACTUALIZARAPS)) {
			String numAp = ventanaP.capturarDato("Indique el numero con el que apostó que desea modificar", null);
			if (f.getSAdao().buscarApSuperastro(numAp, f.getSuperas()) != null) {
				f.getSAdao().eliminarApSuperastro(numAp, f.getSuperas(), f.getFileSA());
				ventanaP.mostrarMensaje("Al actualizar los datos oprima el boton GUARDAR para guardar los cambios",
						"INFO");
			} else {
				ventanaP.mostrarMensaje("Apuesta no encontrada", "ERROR");
			}
		}

		if (e.getActionCommand().equals(ventanaP.getPanelSA().ELIMINARAPS)) {
			String numAp = ventanaP.capturarDato("Indique el numero con el que apostó que desea eliminar", null);
			if (f.getSAdao().buscarApSuperastro(numAp, f.getSuperas()) != null) {
				f.getSAdao().eliminarApSuperastro(numAp, f.getSuperas(), f.getFileSA());
				ventanaP.mostrarMensaje("Apuesta eliminada correctamente", "EXITO");
			} else {
				ventanaP.mostrarMensaje("Apuesta no encontrada", "ERROR");
			}
		}

		if(e.getActionCommand().equals(ventanaP.getPanelSA().VOLVER)) {
			ventanaP.getPanelSA().setVisible(false);
			ventanaP.getPanelEA().setVisible(true);
		}
		// panelParametros
		if (e.getActionCommand().equals(ventanaP.getPanelPa().CREARAR)) {
			f.getArchprop().crearArchivo(f.getFileParametros());

		}

		if (e.getActionCommand().equals(ventanaP.getPanelPa().GUARDAR)) {
			if (ventanaP.getPanelPa().getTxtnombreCasa().getText().isEmpty()
					|| ventanaP.getPanelPa().getTxtNumeroSedes().getText().isEmpty()
					|| ventanaP.getPanelPa().getTxtPresupuestosTotales().getText().isEmpty()) {
				ventanaP.mostrarMensaje("Debe llenar todos los campos", "ERROR");
			} else {
				if (f.getParametrosdao().agregarParametros(ventanaP.getPanelPa().getTxtnombreCasa().getText(),
						ventanaP.getPanelPa().getTxtNumeroSedes().getText(),
						ventanaP.getPanelPa().getTxtPresupuestosTotales().getText(), f.getParametros(),
						f.getFileParametros())) {
					PropiedadesCasasDeApuestas props = new PropiedadesCasasDeApuestas();
					props.escribirPropiedades(f.getParametros().get(f.getParametros().size() - 1).getNombreCasa(),
							f.getParametros().get(f.getParametros().size() - 1).getNumSedes(),
							f.getParametros().get(f.getParametros().size() - 1).getPresupuesto());
					ventanaP.mostrarMensaje("Parametros agregados correctamente", "EXITO");
					ventanaP.mostrarMensaje(
							f.getArchprop().verPropiedades(
									f.getParametros().get(f.getParametros().size() - 1).getNombreCasa(),
									f.getParametros().get(f.getParametros().size() - 1).getNumSedes(),
									f.getParametros().get(f.getParametros().size() - 1).getPresupuesto()),
							"Parametros");
					ventanaP.getPanelPa().getTxtnombreCasa().setText("");
					ventanaP.getPanelPa().getTxtNumeroSedes().setText("");
					ventanaP.getPanelPa().getTxtPresupuestosTotales().setText("");
				} else {
					ventanaP.mostrarMensaje("Estos parametros ya se encuentran registrados", "ERROR");
				}
			}
		}

		if (e.getActionCommand().equals(ventanaP.getPanelPa().MODIFICAR)) {
			String nombre = ventanaP.capturarDato("Indique el nombre de la casa de los parametros que desea modificar",
					null);
			if (f.getParametrosdao().buscarParametros(nombre, f.getParametros()) != null) {
				f.getParametrosdao().eliminarParametros(nombre, f.getParametros(), f.getFileParametros());
				ventanaP.mostrarMensaje("Al actualizar los datos oprima el boton GUARDAR para guardar los cambios",
						"INFO");
			} else {
				ventanaP.mostrarMensaje("Parametros no encontrados", "ERROR");
			}
		}

		if (e.getActionCommand().equals(ventanaP.getPanelPa().VOLVER)) {
			ventanaP.getPanelPa().setVisible(false);
			ventanaP.getPanelO().setVisible(false);
			ventanaP.getPanelP().setVisible(true);
			ventanaP.resize(800, 600);
			ventanaP.setLocationRelativeTo(null);
		}

		// panelApostadores
		if (e.getActionCommand().equals(ventanaP.getPanelO().CREARA)) {

			ventanaP.getPanelO().setVisible(false);
			ventanaP.getPanelR().setVisible(true);
			ventanaP.resize(500, 300);
			ventanaP.setLocationRelativeTo(null);
		}

		if (e.getActionCommand().equals(ventanaP.getPanelR().VOLVER)) {
			ventanaP.getPanelR().setVisible(false);
			ventanaP.getPanelO().setVisible(true);
			ventanaP.resize(800, 600);
			ventanaP.setLocationRelativeTo(null);
		}

		if (e.getActionCommand().equals(ventanaP.getPanelO().ACTUALIZAR)) {
			String cedulaApostador = ventanaP.capturarDato("Ingrese la cedula del apostador que quiere actualizar",
					"INGRESE CEDULA");
			if (f.getApostadoresdao().BuscarApostador(cedulaApostador, f.getApostadores()) != null) {
				f.getApostadoresdao().EliminarApostador(cedulaApostador, f.getApostadores(), f.getFileAp());
				ventanaP.getPanelO().setVisible(false);
				ventanaP.getPanelR().setVisible(true);
				ventanaP.resize(500, 300);
				ventanaP.setLocationRelativeTo(null);
				ventanaP.mostrarMensaje("Al actualizar los datos pulse el boton CREAR para guardar", "INFO");
			} else {
				ventanaP.mostrarMensaje("Apostador no encontrado", "ERROR");

			}
		}

		if (e.getActionCommand().equals(ventanaP.getPanelO().VOLVER)) {
			ventanaP.getPanelO().setVisible(false);
			ventanaP.getPanelP().setVisible(true);
			ventanaP.resize(800, 600);
			ventanaP.setLocationRelativeTo(null);
		}

		if (e.getActionCommand().equals(ventanaP.getPanelR().CREARAP)) {

			if (ventanaP.getPanelR().getCampoNombre().getText().isEmpty()
					|| ventanaP.getPanelR().getCampoCedula().getText().isEmpty()
					|| ventanaP.getPanelR().getCampoDireccion().getText().isEmpty()
					|| ventanaP.getPanelR().getCampoCelular().getText().isEmpty()
					|| ventanaP.getPanelR().getCampoEdad().getText().isEmpty()) {
				ventanaP.mostrarMensaje("Debe agregar todos los valores", "error");
			} else {
				int numero = Integer.parseInt(ventanaP.getPanelR().getCampoEdad().getText());
				if (numero < 18) {
					ventanaP.mostrarMensaje("El jugador debe ser mayor de edad", "ERROR");
				} else {
					if (f.getApostadoresdao().AgregarApostador(ventanaP.getPanelR().getCampoNombre().getText(),
							ventanaP.getPanelR().getCampoCedula().getText(),
							ventanaP.getPanelR().getCampoSede().getText(),
							ventanaP.getPanelR().getCampoCelular().getText(),
							ventanaP.getPanelR().getCampoDireccion().getText(),
							ventanaP.getPanelR().getCampoEdad().getText(), f.getApostadores(), f.getFileAp())) {
						ventanaP.mostrarMensaje("Se ha agregado el apostador con cedula: "
								+ ventanaP.getPanelR().getCampoCedula().getText(), "INFORMACION");
						 
					} else {
						ventanaP.mostrarMensaje("El apostador con cedula: "
								+ ventanaP.getPanelR().getCampoCedula().getText() + " ya se enecunetra en el sistema",
								"ERROR");
					}

				}

			}
		}

		if (e.getActionCommand().equals(ventanaP.getPanelO().LEER)) {
			if (f.getApostadores().size() > 0) {
				ventanaP.mostrarMensaje(f.getApostadoresdao().LeerApostador(f.getApostadores()), "informacion");
			} else {
				ventanaP.mostrarMensaje("No hay apostadores en el sistema actualmente", "Informacion");
			}

		}

		if (e.getActionCommand().equals(ventanaP.getPanelO().BORRAR)) {
			String cedulaApostador1 = ventanaP.capturarDato("Ingrese la cedula del apostador que quiere eliminar",
					"INGRESE CEDULA");
			if (f.getApostadoresdao().BuscarApostador(cedulaApostador1, f.getApostadores()) != null) {
				if (f.getApostadoresdao().EliminarApostador(cedulaApostador1, f.getApostadores(), f.getFileAp())) {
					ventanaP.mostrarMensaje("Se ha eliminado el apostador con cedula: " + cedulaApostador1,
							"INFORMACION");
				} else {
					ventanaP.mostrarMensaje("No se ha podido eliminar el apostador con cedula: " + cedulaApostador1,
							"ERROR");
				}
			} else {
				ventanaP.mostrarMensaje(
						"El apostador con cedula: " + cedulaApostador1 + " no se ha encontrado en el sistema", "ERROR");
			}
		}

		// panelEleccion
		if (e.getActionCommand().equals(ventanaP.getPanelEleccion().BALOTO)) {
			BalotoDTO baloto = new BalotoDTO(null, null, null);
			if (f.getJuegosDao().buscarJuego(ventanaP.getPanelEleccion().BALOTO, f.getJuegos()) == null) {
				f.getJuegosDao().agregarJuego(baloto.getNombreJuego(), baloto.getTipoJuego(),
						baloto.getPresupuestoJuego(), f.getJuegos(), f.getFile());
				ventanaP.mostrarMensaje(f.getJuegosDao().verJuego(ventanaP.getPanelEleccion().BALOTO, f.getJuegos()),
						"Parametros del Baloto");
			} else {
				ventanaP.mostrarMensaje(f.getJuegosDao().verJuego(ventanaP.getPanelEleccion().BALOTO, f.getJuegos()),
						"Parametros del Baloto");
			}
		}

		if (e.getActionCommand().equals(ventanaP.getPanelEleccion().BETPLAY)) {
			BetPlayDTO betplay = new BetPlayDTO(null, null, null);
			if (f.getJuegosDao().buscarJuego(ventanaP.getPanelEleccion().BETPLAY, f.getJuegos()) == null) {
				f.getJuegosDao().agregarJuego(betplay.getNombreJuego(), betplay.getTipoJuego(),
						betplay.getPresupuestoJuego(), f.getJuegos(), f.getFile());
				ventanaP.mostrarMensaje(f.getJuegosDao().verJuego(ventanaP.getPanelEleccion().BETPLAY, f.getJuegos()),
						"Parametros de BetPlay");
			} else {
				ventanaP.mostrarMensaje(f.getJuegosDao().verJuego(ventanaP.getPanelEleccion().BETPLAY, f.getJuegos()),
						"Parametros de BetPlay");

			}
		}

		if (e.getActionCommand().equals(ventanaP.getPanelEleccion().CHANCE)) {
			ChanceDTO chance = new ChanceDTO(null, null, null);
			if (f.getJuegosDao().buscarJuego(ventanaP.getPanelEleccion().CHANCE, f.getJuegos()) == null) {
				f.getJuegosDao().agregarJuego(chance.getNombreJuego(), chance.getTipoJuego(),
						chance.getPresupuestoJuego(), f.getJuegos(), f.getFile());
				ventanaP.mostrarMensaje(f.getJuegosDao().verJuego(ventanaP.getPanelEleccion().CHANCE, f.getJuegos()),
						"Parametros de Chance");
			} else {
				ventanaP.mostrarMensaje(f.getJuegosDao().verJuego(ventanaP.getPanelEleccion().CHANCE, f.getJuegos()),
						"Parametros de Chance");

			}
		}

		if (e.getActionCommand().equals(ventanaP.getPanelEleccion().LOTERIA)) {
			LoteriaDTO loteria = new LoteriaDTO(null, null, null);
			if (f.getJuegosDao().buscarJuego(ventanaP.getPanelEleccion().LOTERIA, f.getJuegos()) == null) {
				f.getJuegosDao().agregarJuego(loteria.getNombreJuego(), loteria.getTipoJuego(),
						loteria.getPresupuestoJuego(), f.getJuegos(), f.getFile());
				ventanaP.mostrarMensaje(f.getJuegosDao().verJuego(ventanaP.getPanelEleccion().LOTERIA, f.getJuegos()),
						"Parametros de Loteria");
			} else {
				ventanaP.mostrarMensaje(f.getJuegosDao().verJuego(ventanaP.getPanelEleccion().LOTERIA, f.getJuegos()),
						"Parametros de Loteria");

			}

		}

		if (e.getActionCommand().equals(ventanaP.getPanelEleccion().SUPERASTRO)) {
			SuperAstroDTO superastro = new SuperAstroDTO(null, null, null);
			if (f.getJuegosDao().buscarJuego(ventanaP.getPanelEleccion().SUPERASTRO, f.getJuegos()) == null) {
				f.getJuegosDao().agregarJuego(superastro.getNombreJuego(), superastro.getTipoJuego(),
						superastro.getPresupuestoJuego(), f.getJuegos(), f.getFile());
				ventanaP.mostrarMensaje(
						f.getJuegosDao().verJuego(ventanaP.getPanelEleccion().SUPERASTRO, f.getJuegos()),
						"Parametros de SuperAstro");
			} else {
				ventanaP.mostrarMensaje(
						f.getJuegosDao().verJuego(ventanaP.getPanelEleccion().SUPERASTRO, f.getJuegos()),
						"Parametros de SuperAstro");

			}
		}

		if (e.getActionCommand().equals(ventanaP.getPanelEleccion().VOLVER)) {
			ventanaP.getPanelEleccion().setVisible(false);
			ventanaP.getPanelP().setVisible(true);
			ventanaP.resize(800, 600);
			ventanaP.setLocationRelativeTo(null);
		}

		// PanelSedes
		if (e.getActionCommand().equals(ventanaP.getPanelP().SEDES)) {
			try {
				f.getArchivosedes().crearArchivoSedes(f.getFilesedes());

			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		if (e.getActionCommand().equals(ventanaP.getPanelS().GUARDAR)) {
			PropiedadesCasasDeApuestas pr = new PropiedadesCasasDeApuestas();
			if (ventanaP.getPanelS().getTxtUbicacion().getText().isEmpty()
					|| ventanaP.getPanelS().getTxtNumEmpleados().getText().isEmpty()) {
				ventanaP.mostrarMensaje("Agregar todos los campos", "ERROR");
			}
			if (f.getSedesDAO().guardarSede(ventanaP.getPanelS().getTxtUbicacion().getText(),
					Integer.parseInt(ventanaP.getPanelS().getTxtNumEmpleados().getText()), f.getSedes(),
					f.getFilesedes())) {
				ventanaP.mostrarMensaje("Sede guardada exitosamente", "INFORMACION");

			} else {
				ventanaP.mostrarMensaje("Error al guardar sede", "ERROR");
			}

		}

		if (e.getActionCommand().equals(ventanaP.getPanelS().VER)) {
			if (f.getSedes().size() > 0) {
				ventanaP.mostrarMensaje(f.getSedesDAO().verSedes(f.getSedes()), "INFORMACION");
			} else {
				ventanaP.mostrarMensaje("No hay sedes para mostrar", "ERROR");
			}
		}
		
		if(e.getActionCommand().equals(ventanaP.getPanelS().ELIMINAR)){
			String UbicacionSede=ventanaP.capturarDato("Ingrese la sede a eliminar", "INGRESAR SEDE");
				if(f.getSedesDAO().buscarSede(UbicacionSede, f.getSedes())!=null) {
					if(f.getSedesDAO().eliminarSede(UbicacionSede, f.getSedes(), f.getFilesedes())) {
						ventanaP.mostrarMensaje("Se ha eliminado correctamente", "INFORMACION");
					}else {
						ventanaP.mostrarMensaje("No se ha podido eliminar la sede", "INFORMACION");
					}
				}else {
					ventanaP.mostrarMensaje("La sede ingresada "+UbicacionSede+" no esta en el sistema","ERROR");
				}
			
		}

		if (e.getActionCommand().equals(ventanaP.getPanelS().VOLVER)) {
			ventanaP.getPanelS().setVisible(false);
			ventanaP.getPanelP().setVisible(true);
			ventanaP.resize(800, 600);
			ventanaP.setLocationRelativeTo(null);
		}
		
		//panelConsultas
		if(e.getActionCommand().equals(ventanaP.getPanelCon().CLIENTESSEDE)) {
			String dato=ventanaP.capturarDato("Ingrese la sede:  \nSedes registradas hasta ahora: \n"+ f.getSedesDAO().verUbicaciones(f.getSedes()), "INFORMACION");
			boolean existe = false;
			String cedula="";
			for(int i=0;i<f.getSedes().size();i++) {
				existe = f.getSedes().get(i).getUbicacion().contains(dato);
				if(existe) {
					
					for(int j=0;j<f.getApostadores().size();j++) {
						if(f.getApostadores().get(j).getSede()==dato) {
							cedula=cedula.concat(dato);
						}
					}
							
						
					}
					
				}
			ventanaP.mostrarMensaje(cedula, "");
			}
			
			
		
		
		if(e.getActionCommand().equals(ventanaP.getPanelCon().DETALLEAPUESTA)) {
			ventanaP.getPanelCon().setVisible(false);
			ventanaP.getPanelD().setVisible(true);
		}
		if(e.getActionCommand().equals(ventanaP.getPanelD().CONTINUAR)) {
			if(ventanaP.getPanelD().getTxtCedula().getText().isEmpty() || ventanaP.getPanelD().getTxtJuego().getText().isEmpty()) {
				ventanaP.mostrarMensaje("LLene todos los campos", null);
			}
			else {
				for(int i=0;i<f.getApostadores().size();i++) {
					if(!f.getApostadores().get(i).getCedula().contains(ventanaP.getPanelD().getTxtCedula().getText())) {
						ventanaP.mostrarMensaje("Apostador no encontrado", "ERROR");
					}
					else if(ventanaP.getPanelD().getTxtJuego().getText()=="Baloto"){
						for(int j=0;j<f.getBaloto().size();j++) {
							ventanaP.mostrarMensaje(f.getBaloto().get(j).getCedula(), "ERROR");
						}	
					}
				}
			}
		}
	}
	
	

}
