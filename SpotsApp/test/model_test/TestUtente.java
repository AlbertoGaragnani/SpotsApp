package model_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.*;

class TestUtente {
	
	private Utente utente;
	
	@BeforeEach
	public void setUp() {
		utente = new Utente("AlessandroPajola", "alessandropajola@gmail.com", Privilegio.VERIFICATO);
	}

	@Test
	public void testGetters() {
		assertEquals(utente.getUsername(), "AlessandroPajola");
		assertEquals(utente.getEmail(), "alessandropajola@gmail.com");
		assertEquals(utente.getPrivilegio(), Privilegio.VERIFICATO);
	}

}

