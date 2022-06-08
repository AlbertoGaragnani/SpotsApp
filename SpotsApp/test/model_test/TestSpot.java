package model_test;

import static org.junit.jupiter.api.Assertions.*;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.*;

class TestSpot {
	
	private Spot spot;
	private Utente utente;

	@BeforeEach
	public void setUp() {
		List<Attivita> attivita = new ArrayList<>();
		attivita.add(Attivita.BASKETBALL);
		attivita.add(Attivita.SKATEBOARDING);
		List<Recensione> recensioni = new ArrayList<>();
		recensioni.add(new Recensione("RE002", 5, Optional.empty(), Optional.empty(), Optional.empty()));
		File[] immagini = new File[2];
		utente = new Utente("AlessandroPajola", "alessandropajola@gmail.com", Privilegio.BASE);
		immagini[0] = new File("C:/Users/Utente/Desktop/foto1.jpeg");
		immagini[1] = new File("C:/Users/Utente/Desktop/foto2.jpeg");
		spot = new Spot("SP001", utente.getUsername(), "Skate Big Ramp", "Viale della Pace 333", immagini, attivita, null, recensioni);
	}
	
	@Test
	public void testGetters() {
		assertEquals(spot.getId().substring(0, 2), "SP");
		assertEquals(spot.getUsernameUtente(), utente.getUsername());
		assertEquals(spot.getIndirizzo(), "Viale della Pace 333");
		assertEquals(spot.getNome(), "Skate Big Ramp");
		assertEquals(spot.getImmagini().length, 2);
		assertEquals(spot.getPresenzeSegnalate(), 0);
		assertNull(spot.getAffluenza());
		assertEquals(spot.getAttivita().get(0), Attivita.BASKETBALL);
		assertThrows(NoSuchElementException.class, () -> spot.getRecensioni().get(0).getDescrizione().get());
	}

}

