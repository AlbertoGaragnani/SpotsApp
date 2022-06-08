package controller;

import java.util.*;

import model.Attivita;
import model.Spot;
import model.Utente;

public class GestioneUtenteController implements IGestioneUtente{

	private Utente utente;
	
	public GestioneUtenteController()
	{
		this.utente = new Utente();
	}
	
	@Override
	public List<Spot> findByAddress(String address, List<Spot> listaSpot) {
		List<Spot> res = new ArrayList<>();
		for(Spot s : listaSpot)
			if(s.getIndirizzo().equals(address))
				res.add(s);
		return res;
	}

	@Override
	public List<Spot> findByActivities(Attivita attivita, List<Spot> listaSpot) {
		List<Spot> res = new ArrayList<>();
		for(Spot s : listaSpot)
			for(Attivita a : s.getAttivita())
				if(a.equals(attivita))
					res.add(s);
		return res;
	}

	@Override
	public List<Spot> findByActivities(String attivita, List<Spot> listaSpot) {
		List<Spot> res = new ArrayList<>();
		for(Spot s : listaSpot)
			for(Attivita a : s.getAttivita())
				if(a.equals(Attivita.valueOf(attivita)))
					res.add(s);
		return res;
	}

	@Override
	public String getUsername() 
	{
		return this.utente.getUsername();
	}

	@Override
	public void logout() 
	{
		
	}
	
//	@Override
//	public List<Spot> cercaSpot(String indirizzo, Attivita attivita) 
//	{
//		List<Spot> res = new ArrayList<Spot>();
//		for(Spot s : dbms.getSpots()) {
//			if(indirizzo!=null && !indirizzo.isEmpty()) {
//				if(s.getIndirizzo().equals(indirizzo) && attivitaPresente(s.getAttivita(), attivita))
//					res.add(s); 
//				}
//			else {
//				if(attivitaPresente(s.getAttivita(), attivita))
//					res.add(s);
//				}
//		}
//		return res;
//	}
//	
//	private boolean attivitaPresente(List<Attivita> possibili, Attivita scelta)
//	{
//		boolean res = false;
//		for(Attivita a : possibili)
//		{
//			if(a.equals(scelta))
//				return true;
//		}
//		return res;
//	}
	
//	public Spot findSpotById(String id) {
//	for(Spot s : this.dbms.getSpots())
//		if(s.getId().equals(id))
//			return s;
//	return null;
//}
	
//	public List<Spot> findSpotsByName(String name) {
//	List<Spot> res = new ArrayList<>();
//	for(Spot s : this.dbms.getSpots())
//		if(s.getNome().equals(name))
//			res.add(s);
//	return res;
//}

}
