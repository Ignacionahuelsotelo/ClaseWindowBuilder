package ui;

import java.util.ArrayList;

import Observadores.Observer;
import controladores.HinchaController;

public class ObserverUi implements Observer{
	private ContadorHinchasUI mainUi = new ContadorHinchasUI();
	private HinchaController controller = new HinchaController();
	
	

//	public ObserverUi(ContadorHinchasUI mainUi, HinchaController controller) {
//		this.mainUi = mainUi;
//		this.controller = controller;
//	}

	@Override
	public void notificar() {
		System.out.println("estoy en el notificar");
		ArrayList<String> clubes = controller.obtenerClubes();
		
		for (String club : clubes) {
			Integer cantHinchas = controller.obtenerCantHinchas(club);
			
			switch (club) {
	        case "River Plate":
	        	System.out.println("club elegido " + club);
	            this.contRiver.setText(cantHinchas.toString());
	            break;
	        case "Independiente":
	            contIndep.setText(cantHinchas.toString());
	            break;
	        case "San Lorenzo":
	            contSanLor.setText(cantHinchas.toString());
	            break;
	        case "Estudiantes de La Plata":
	            contEDLP.setText(cantHinchas.toString());
	            break;
	        case "Argentinos Juniors":
	            contArgJr.setText(cantHinchas.toString());
	            break;
	        case "Boca Juniors":
	            contBoca.setText(cantHinchas.toString());
	            break;
	        case "Racing Club":
	            contRacing.setText(cantHinchas.toString());
	            break;
	        case "Vélez Sarsfield":
	            contVelez.setText(cantHinchas.toString());
	            break;
	        case "Gimnasia y Esgrima La Plata":
	            contGim.setText(cantHinchas.toString());
	            break;
	        case "Rosario Central":
	            contRC.setText(cantHinchas.toString());
	            break;
	        default:
	            System.out.println("Club no encontrado: " + cantHinchas);
	            break;
	    }
		}
	}
}
	

