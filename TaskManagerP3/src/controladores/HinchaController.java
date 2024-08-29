package controladores;

import java.util.ArrayList;

import Observadores.Observer;
import logica.Contador;

public class HinchaController {
	private Contador model;
	
	public HinchaController() {
		this.model = new Contador();
	}

    public void agregarHincha(String club) {
        model.agregarHincha(club);
    }
    
    public ArrayList<String> obtenerClubes() {
    	return model.obtenerClubes();
    }
    
    public int obtenerCantHinchas(String club) {
    	return model.obtenerCantHinchas(club);
    }
    
    public void registrarObservador(Observer obs) {
    	model.registrar(obs);
    }
    
    
}
