package controller;

import java.util.List;

import model.Attività;
import model.Spot;

public interface IGestioneUtente {
	
	public List<Spot> cercaSpot(String indirizzo, Attività attivita);
	public String getUsername();
	public void logout();

}
