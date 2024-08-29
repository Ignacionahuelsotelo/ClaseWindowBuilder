package logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Observadores.Observer;

public class Contador {
	private HashMap<String,Integer> mapHinchas;
    private List<Observer> observers;
    
	public Contador() {
		this.mapHinchas = new HashMap<String, Integer>();
		this.observers = new ArrayList<Observer>();
	}
	
	 public void agregarHincha(String club) {
		 if(mapHinchas.containsKey(club)) {
			 mapHinchas.put(club, mapHinchas.get(club) + 1);
		 }
		 else {
			 mapHinchas.put(club,1);
		 }
		 
		 notificarObservers();
	  }

	public ArrayList<String> obtenerClubes() {
		return new ArrayList<String>(mapHinchas.keySet());
	}
	
	public int obtenerCantHinchas(String club) {
		return mapHinchas.get(club);
	}
	
	public void registrar(Observer observador)
	{
		observers.add(observador);
	}

	private void notificarObservers() {
        for (Observer observer : observers) {
            observer.notificar();
        }
    }
}

    

