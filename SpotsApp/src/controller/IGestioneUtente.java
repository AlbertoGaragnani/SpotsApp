package controller;

import java.util.List;

import model.*;

public interface IGestioneUtente {
	
//	public List<Spot> cercaSpot(String indirizzo, Attivita attivita);
	public List<Spot> findByAddress(String address, List<Spot> listaSpot);
	public List<Spot> findByActivities(Attivita attivita, List<Spot> listaSpot);
	public List<Spot> findByActivities(String attivita, List<Spot> listaSpot);
	public String getUsername();
	public void logout();

}
