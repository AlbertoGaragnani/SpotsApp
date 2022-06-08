package model_test;

import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.*;

class TestRecensione {

	private Recensione compRecensione;
	private Recensione simpRecensione;
	
	@BeforeEach
	public void SetUp() {
		Permanenza permanenza = Permanenza.MATTINA;
		List<Permanenza> list = new ArrayList<>();
		list.add(permanenza);
		compRecensione = new Recensione("RE001", 3, Optional.of("Rampa molto alta!"),
				Optional.of("Lo spot è molto bello ma al contempo molto pericoloso"), Optional.of(list));
		simpRecensione = new Recensione("RE002", 5, Optional.empty(), Optional.empty(), Optional.empty());
	}
	
	@Test
	public void testRecensione() {
		assertEquals(compRecensione.getId(), "RE001");
		assertEquals(compRecensione.getDescrizione().get(), "Lo spot è molto bello ma al contempo molto pericoloso");
		assertEquals(compRecensione.getPermanenza().get().get(0), Permanenza.MATTINA);
		assertThrows(NoSuchElementException.class, () -> simpRecensione.getDescrizione().get());
		assertEquals(simpRecensione.getPermanenza(), Optional.empty());
	}

}


