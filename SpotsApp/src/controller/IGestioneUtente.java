package controller;

import java.util.List;

import model.Attivit�;
import model.Spot;

public interface IGestioneUtente {
	
	public List<Spot> cercaSpot(String indirizzo, Attivit� attivita);
	public String getUsername();
	public void logout();

}
