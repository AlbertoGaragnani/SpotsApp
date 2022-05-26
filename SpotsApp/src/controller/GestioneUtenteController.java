package controller;

import java.util.ArrayList;
import java.util.List;

import model.Attività;
import model.DbmsMock;
import model.Spot;

public class GestioneUtenteController implements IGestioneUtente{

	private DbmsMock dbms;
	
	public GestioneUtenteController()
	{
		this.dbms = new DbmsMock();
	}
	
	@Override
	public List<Spot> cercaSpot(String indirizzo, Attività attivita) 
	{
		List<Spot> res = new ArrayList<Spot>();
		for(Spot s : dbms.getSpot())
		{
			if(indirizzo!=null && !indirizzo.isEmpty())
			{
				if(s.getIndirizzo().equals(indirizzo) && attivitaPresente(s.getAttività(), attivita))
					res.add(s);
			}
			else
			{
				if(attivitaPresente(s.getAttività(), attivita))
					res.add(s);
			}
		}
		return res;
	}
	
	private boolean attivitaPresente(List<Attività> possibili, Attività scelta)
	{
		boolean res = false;
		for(Attività a : possibili)
		{
			if(a.equals(scelta))
				return true;
		}
		return res;
	}

	@Override
	public String getUsername() 
	{
		String res = "";
		
		return res;
	}

	@Override
	public void logout() 
	{
		
	}
	
	

}
