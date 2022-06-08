package controller_test;
import java.util.ArrayList;

import java.util.List;

import model.*;

public class DbmsMock {
	
	private List<Spot> listaSpot;
	
	public DbmsMock() {
		this.listaSpot = new ArrayList<Spot>();
		Spot s = new Spot();
		s.setId("SP0000");
		s.setUsernameUtente("SashaDani");
		s.setNome("Segafredo Arena");
		s.setIndirizzo("Piazzale Costituzione 2");
		Attivita a = Attivita.BASKETBALL;
		s.setAttivita(a);
		listaSpot.add(s);
		Spot s1 = new Spot();
		s1.setId("SP0001");
		s1.setUsernameUtente("PeppePoeta85");
		s1.setNome("Unipol Arena");
		s1.setIndirizzo("viale Risorgimento 5");
		Attivita a1 = Attivita.CLIFFDIVING;
		s.setAttivita(a1);
		listaSpot.add(s1);
		Spot s2 = new Spot();
		s2.setId("SP0002");
		s2.setUsernameUtente("AbdulGaddy");
		s2.setNome("Palamalaguti");
		s2.setIndirizzo("via Terracini 31");
		Attivita a2 = Attivita.SKATEBOARDING;
		s.setAttivita(a2);
		listaSpot.add(s2);
		Spot s3 = new Spot();
		s3.setId("SP0002");
		s3.setUsernameUtente("Milos44");
		s3.setNome("Palaozza");
		s3.setIndirizzo("Piazza");
		List<Attivita> listaAttivita = new ArrayList<>();
		Attivita a3 = Attivita.SKATEBOARDING;
		listaAttivita.add(a3);
		Attivita a4 = Attivita.CLIFFDIVING;
		listaAttivita.add(a4);
		Attivita a5 = Attivita.PARKOUR;
		listaAttivita.add(a5);
		Attivita a6 = Attivita.SURF;
		listaAttivita.add(a6);
		s.setAttivita(listaAttivita);
		listaSpot.add(s2);
	}
	
	public List<Spot> getSpots() {
		return this.listaSpot;
	}
	
	public void setSpots(List<Spot> list) {
		this.listaSpot = list;
	}
	
	public void addSpot(Spot spot) {
		this.listaSpot.add(spot);
	}
	
	public void addListSpot(List<Spot> list) {
		for(Spot s : list)
			this.listaSpot.add(s);
	}
	
	public void removeSpot(Spot spot) {
		for(int index=0;index<this.listaSpot.size();index++)
			if(this.listaSpot.get(index).equals(spot))
				this.listaSpot.remove(index);
	}

}
