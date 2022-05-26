package model;
import java.util.ArrayList;
import java.util.List;

public class DbmsMock {
	
	private List<Spot> listaSpot;
	
	public DbmsMock()
	{
		this.listaSpot = new ArrayList<Spot>();
		Spot s = new Spot();
		s.setId("SP0000");
		s.setUsernameUtente("SashaDani");
		s.setNome("Segafredo Arena");
		s.setIndirizzo("Piazzale Costituzione 2");
		Attività a = Attività.BASKETBALL;
		listaSpot.add(s);
		Spot s1 = new Spot();
		s1.setId("SP0001");
		s1.setUsernameUtente("PeppePoeta85");
		s1.setNome("Unipol Arena");
		s1.setIndirizzo("viale casalecchio 5");
		Attività a1 = Attività.CLIFFDIVING;
		listaSpot.add(s1);
	}
	
	public List<Spot> getSpot()
	{
		return this.listaSpot;
	}

}
