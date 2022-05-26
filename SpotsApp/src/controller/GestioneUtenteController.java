package controller;

import java.util.ArrayList;
import java.util.List;

import model.Attivit�;
import model.DbmsMock;
import model.Spot;

public class GestioneUtenteController implements IGestioneUtente{

	private DbmsMock dbms;
	
	public GestioneUtenteController()
	{
		this.dbms = new DbmsMock();
	}
	
	@Override
	public List<Spot> cercaSpot(String indirizzo, Attivit� attivita) 
	{
		List<Spot> res = new ArrayList<Spot>();
		for(Spot s : dbms.getSpot())
		{
			if(indirizzo!=null && !indirizzo.isEmpty())
			{
				if(s.getIndirizzo().equals(indirizzo) && attivitaPresente(s.getAttivit�(), attivita))
					res.add(s);
			}
			else
			{
				if(attivitaPresente(s.getAttivit�(), attivita))
					res.add(s);
			}
		}
		return res;
	}
	
	private boolean attivitaPresente(List<Attivit�> possibili, Attivit� scelta)
	{
		boolean res = false;
		for(Attivit� a : possibili)
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
