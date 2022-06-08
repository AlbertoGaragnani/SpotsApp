package controller_test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import controller.GestioneUtenteController;
import model.Attivita;
import model.Spot;

public class TestCercaSpot {
	
	private DbmsMock mockDatabase;
	private GestioneUtenteController controller;
	
	@BeforeEach
	public void SetUp() {
		/*
		Nel momento in cui viene inizializzato il DbmsMock,
		automaticamente vengono creati degli utenti e degli spot fittizzi
		al fine di testare in maniera opportuna l'efficacia dei metodi di ricerca del controller
		*/
		this.mockDatabase = new DbmsMock();
		this.controller = new GestioneUtenteController();
	}
	
	@Test
	public void TestRicerca() {
		//Test sul metodo: void findSpotByAddress(String id)
		String address = "Piazza";
		Spot spot1 = new Spot();
		spot1.setIndirizzo(address);
		List<Spot> lista1 = new ArrayList<>();
		lista1.add(spot1);
		assertEquals(lista1, this.controller.findByAddress(address, mockDatabase.getSpots()));
		//Test sul metodo: void findByActivities(Attivita attivita)
		Attivita attivita = Attivita.BASKETBALL;
		Spot spot2 = new Spot();
		spot2.setAttivita(attivita);
		List<Spot> lista2 = new ArrayList<>();
		lista2.add(spot2);
		assertEquals(lista2, this.controller.findByActivities(attivita, this.mockDatabase.getSpots()));
//		Test sul metodo: void findByActivities(String attivita)
		String strAttivita = "Parkour";
		Spot spot3 = new Spot();
		spot3.setAttivita(Attivita.valueOf(strAttivita));
		List<Spot> lista3 = new ArrayList<>();
		lista3.add(spot3);
		assertEquals(lista3, this.controller.findByActivities(strAttivita, this.mockDatabase.getSpots()));
	}

}